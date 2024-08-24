package main;

public class Paralelogramo extends Trapezio {
    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }
    static public boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta reta1 = new SegmentoReta(p1, p2);
        SegmentoReta reta2 = new SegmentoReta(p3,p4);
        SegmentoReta reta3 = new SegmentoReta(p1, p4);
        SegmentoReta reta4 = new SegmentoReta(p2, p3);
        return reta1.paralelo(reta2) && reta3.paralelo(reta4);

    }
    @Override
    public double largura() {
        return this.reta12.comprimento() + Math.sqrt(Math.pow(reta23.comprimento(), 2) - (Math.pow(this.altura(), 2)));
    }

    @Override
    public double area() {
        return this.reta34.comprimento()*this.altura();
    }

    @Override
    public double altura() {
        return super.altura();
    }

    @Override
    public double perimetro() {
        return super.perimetro();
    }
}