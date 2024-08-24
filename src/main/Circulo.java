package main;

public class Circulo extends Elipse {
    public Circulo(Ponto centro, double raio) {
        super(centro, raio, raio);
        if (raio < 0) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double largura() {
        return super.largura();
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double altura() {
        return super.altura();
    }

    @Override
    public double perimetro() {
        return this.circunferencia();
    }

    @Override
    public double circunferencia() {
        return 2 * Math.PI * this.semiEixoA;
    }

    public double getRaio() {
        return semiEixoA;
    }
}