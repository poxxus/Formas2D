package main;

public class SemiCirculo extends FormaGeometrica {
    private final Ponto centro;
    private final double raio;
    public SemiCirculo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
        if (raio < 0) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double largura() {
        return 2*raio;
    }

    @Override
    public double area() {
        return (Math.PI*this.raio*this.raio)/2;
    }

    @Override
    public double altura() {
        return this.raio;
    }

    @Override
    public double perimetro() {
        return (Math.PI * 2 * this.raio)/2;
    }

    public double circunferencia() {
        return this.perimetro();
    }

    public double getRaio() {
        return this.raio;
    }

    public Ponto getCentro() {
        return new Ponto(this.centro.getCoordX(), this.centro.getCoordY());
    }
}