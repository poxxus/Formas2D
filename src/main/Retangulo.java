package main;

public class Retangulo extends Paralelogramo {

    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }


    static public boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta reta1 = new SegmentoReta(p1, p2);
        SegmentoReta reta2 = new SegmentoReta(p3, p4);
        SegmentoReta reta3 = new SegmentoReta(p1, p4);
        SegmentoReta reta4 = new SegmentoReta(p2, p3);
        return (reta1.paralelo(reta2) && reta3.paralelo(reta4))
                && (reta1.coeficienteAngular() == 0)
                && (Math.abs(reta3.coeficienteAngular()) == Math.abs(reta4.coeficienteAngular()));
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
        return super.perimetro();
    }

    public boolean quadrado() {
        return this.reta12.comprimento() == this.reta14.comprimento();
    }
}