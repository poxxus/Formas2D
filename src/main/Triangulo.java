package main;

public class Triangulo extends Poligono {
    private final SegmentoReta lado13;
    private final SegmentoReta lado12;
    private final SegmentoReta lado23;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[]{p1, p2, p3});
        lado13 = new SegmentoReta(p1, p3);
        lado12 = new SegmentoReta(p1, p2);
        lado23 = new SegmentoReta(p2, p3);
    }

    @Override
    public double largura() {
        return Math.max(Math.max(lado12.comprimento(), lado13.comprimento()),
                lado23.comprimento());
    }

    @Override
    public double area() {
        double s = this.perimetro()/2;

        return Math.sqrt(s*(s- lado12.comprimento())*(s - lado13.comprimento())
                *(s - lado23.comprimento()));
    }

    @Override
    public double altura() {
        return (2*this.area())/this.largura();
    }

    @Override
    public double perimetro() {
        return lado13.comprimento() + lado12.comprimento() + lado23.comprimento();
    }

    public SegmentoReta getLado12() {
        return new SegmentoReta(this.lado12.getP1(), this.lado12.getP2());
    }

    public SegmentoReta getLado23() {
        return new SegmentoReta(this.lado23.getP1(), this.lado23.getP2());
    }

    public SegmentoReta getLado13() {
        return new SegmentoReta(this.lado13.getP1(), this.lado13.getP2());
    }
}