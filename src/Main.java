import main.*;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0.5, 0.5);
        SemiCirculo elip = new SemiCirculo(p1, 0.5);
        System.out.println(elip.altura());
        System.out.println(elip.largura());
        System.out.println(elip.area());
        System.out.println(elip.circunferencia());


    }
}
