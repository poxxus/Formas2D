package main;

public class Trapezio extends Quadrilatero {
    protected final SegmentoReta reta12;
    protected final SegmentoReta reta34;
    protected final SegmentoReta reta14;
    protected final SegmentoReta reta23;

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
        reta12 = new SegmentoReta(p1, p2);
        reta34 = new SegmentoReta(p3,p4);
        reta14 = new SegmentoReta(p1,p4);
        reta23 = new SegmentoReta(p2, p3);
    }
    static public boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta reta1 = new SegmentoReta(p1, p2);
        SegmentoReta reta2 = new SegmentoReta(p3,p4);
        return reta1.paralelo(reta2);
    }
    public SegmentoReta baseMenor() {
        return (reta34.comprimento() < reta12.comprimento()) ? reta34 : reta12;
    }

    public SegmentoReta baseMaior() {
        return (reta12.comprimento() > reta34.comprimento()) ? reta12 : reta34;
    }

    @Override
    public double area() {
        return (this.baseMenor().comprimento() + this.baseMaior().comprimento()) * this.altura() * 0.5;
    }

    @Override
    public double largura() {
        return this.baseMaior().comprimento();
    }

    @Override
    public double altura() {
        return this.reta12.distancia(reta34);
    }

    @Override
    public double perimetro() {
        return reta12.comprimento() + reta14.comprimento() + reta34.comprimento() + reta23.comprimento();
    }
}