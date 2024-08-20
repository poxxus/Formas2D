import main.Ponto;
import main.SegmentoReta;
import main.Triangulo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0.1, 0);
        Ponto p2 = new Ponto(0.9, 0);
        Ponto p3 = new Ponto(0.5, 0.4);
        Triangulo tri = new Triangulo(p1, p2, p3);
        System.out.println(tri.altura());
        System.out.println(tri.largura());
        System.out.println(tri.area());
        System.out.println(tri.perimetro());
    }
}
