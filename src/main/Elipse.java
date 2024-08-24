package main;

public class Elipse extends FormaGeometrica {
    protected final Ponto centro;
    protected final double semiEixoA;
    protected final double semiEixoB;
    public Elipse(Ponto centro,  double semiEixoA, double semiEixoB) {
        this.centro = centro;
        this.semiEixoA = semiEixoA;
        this.semiEixoB = semiEixoB;
        if (semiEixoA < 0 || semiEixoB < 0) {
            throw new IllegalArgumentException();
        }
    }

    public double getSemiEixoMenor() {
        return Math.min(semiEixoA, semiEixoB);
    }

    public double getSemiEixoMaior() {
        return Math.max(semiEixoA, semiEixoB);
    }

    public double circunferencia() {
        return Math.PI * 2 * Math.sqrt((semiEixoA*semiEixoA + semiEixoB*semiEixoB)/2);
    }

    @Override
    public double largura() {
        return 2*semiEixoA;
    }

    @Override
    public double area() {
        return Math.PI * semiEixoB * semiEixoA;
    }

    @Override
    public double altura() {
        return 2*semiEixoB;
    }

    @Override
    public double perimetro() {
        return this.circunferencia();
    }

    public Ponto getCentro() {
        return new Ponto(this.centro.getCoordX(), this.centro.getCoordY());
    }

    public double getSemiEixoA() {
        return semiEixoA;
    }

    public double getSemiEixoB() {
        return semiEixoB;
    }
}