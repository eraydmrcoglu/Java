import java.util.Scanner;

public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, muzik;

        Scanner giris=new Scanner(System.in);

        System.out.println("Matemetik notunu giriniz : ");
        matematik = giris.nextInt();

        System.out.println("Fizik notunu giriniz : ");
        fizik = giris.nextInt();

        System.out.println("Kimya notunu giriniz : ");
        kimya = giris.nextInt();

        System.out.println("Türkçe notunu giriniz : ");
        turkce = giris.nextInt();

        System.out.println("Müzik notunu giriniz : ");
        muzik = giris.nextInt();

        double ort=(matematik+fizik+kimya+turkce+muzik)/5;
        System.out.println("Not ortalaması : " + ort);

        System.out.println(ort > 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");
    }
}