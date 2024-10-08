package  main;

public class SegmentoReta extends ObjetoGeometrico {
    private final Ponto p1;
    private final Ponto p2;

    public SegmentoReta(Ponto p1, Ponto p2) {
        this.p1 = new Ponto(p1.getCoordX(), p1.getCoordY());
        this.p2 = new Ponto(p2.getCoordX(), p2.getCoordY());
    }

    public double comprimento() {
        return Math.sqrt(Math.pow(p2.getCoordX() - p1.getCoordX(), 2)
        + Math.pow(p2.getCoordY() - p1.getCoordY(), 2));
    }

    public double coeficienteAngular() {
        if (p1.getCoordX() == p2.getCoordX()) {
            return Double.POSITIVE_INFINITY;
        }
        return (p2.getCoordY()- p1.getCoordY()) / (p2.getCoordX() - p1.getCoordX());
    }

    public boolean paralelo(SegmentoReta s) {
        return Math.round(Math.abs(this.coeficienteAngular())) == Math.round(Math.abs(s.coeficienteAngular()));
    }

    public Ponto getP1() {
        return new Ponto(p1.getCoordX(), p1.getCoordY());
    }

    public Ponto getP2() {
        return new Ponto(p2.getCoordX(), p2.getCoordY());
    }

    public double distancia(SegmentoReta s) {
        if (!this.paralelo(s)) {
            throw new IllegalArgumentException();
        }
        double m = this.coeficienteAngular();
        double c1 = this.getP1().getCoordY() - m * this.getP1().getCoordX();
        double c2 = s.getP1().getCoordY() - m * s.getP1().getCoordX();
        return (Math.abs(c2 - c1))/(Math.sqrt(1 + m*m));
    }
}