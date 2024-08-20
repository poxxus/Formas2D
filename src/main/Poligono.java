package main;

public abstract class Poligono extends FormaGeometrica {
    private final Ponto[] pontos;
    public Poligono(Ponto[] pontos) {
        this.pontos = new Ponto[pontos.length];
        System.arraycopy(pontos, 0, this.pontos, 0, pontos.length);
    }

    public Ponto[] getPontos() {
        Ponto[] pontosCopia = new Ponto[this.pontos.length];
        System.arraycopy(this.pontos, 0, pontosCopia, 0, pontos.length);
        return pontosCopia;
    }
}