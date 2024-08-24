package main;

public class SemiCirculo extends Circulo {
    public SemiCirculo(Ponto centro, double raio) {
        super(centro, raio);
    }

    @Override
    public double largura() {
        return super.largura();
    }

    @Override
    public double area() {
        return super.area()/2;
    }

    @Override
    public double altura() {
        return super.altura()/2;
    }

    @Override
    public double perimetro() {
        return super.perimetro()/2;
    }

    @Override
    public double circunferencia() {
        return super.circunferencia()/2;
    }
}