package main;

public abstract class Quadrilatero extends Poligono {
    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new Ponto[]{p1, p2, p3, p4});
    }

    public Ponto getP1() {
        return new Ponto(this.pontos[0].getCoordX(), this.pontos[0].getCoordY());
    }

    public Ponto getP2() {
        return new Ponto(this.pontos[1].getCoordX(), this.pontos[1].getCoordY());
    }

    public Ponto getP3() {
        return new Ponto(this.pontos[2].getCoordX(), this.pontos[2].getCoordY());
    }

    public Ponto getP4() {
        return new Ponto(this.pontos[3].getCoordX(), this.pontos[3].getCoordY());
    }
}