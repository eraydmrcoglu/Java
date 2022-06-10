import java.util.Scanner;

public class TaksimetreHesaplama {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double kmPrice = 2.20;
        double startPrice = 10.0;
        int km;
        double totalCost; 

        System.out.println("Kaç kilometre yol gittiniz?");
        km = input.nextInt();
        totalCost = (km*kmPrice) + startPrice;

        totalCost = (totalCost < 20) ? 20 : totalCost;

        System.out.println("Toplam Ücret: " + totalCost + "TL");

        input.close();

    }
}