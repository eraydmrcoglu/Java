import java.util.Scanner;

public class HipotenusBulma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a,b,c;

        System.out.println("Birinci kenar uzunluğunu giriniz: ");
        a = input.nextDouble();

        System.out.println("İkinci kenar uzunluğunu giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Üçgenin Hipotenüsü: " + c + "\n");

        System.out.println("" + "\n");

        System.out.println("Birinci kenar uzunluğunu giriniz: ");
        a = input.nextDouble();

        System.out.println("İkinci kenar uzunluğunu giriniz: ");
        b = input.nextDouble();

        System.out.println("Üçüncü kenar uzunluğunu giriniz: ");
        c = input.nextDouble();

        double u, cevre, alan;
        u = (a+b+c)/ 2;
        cevre = 2 * u;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Çevresi: " + cevre + "\n" + "Üçgenin Alanı: " + alan);
        System.out.println("" + "\n");

        input.close();
    }
}