import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int max = 0;
        int min = 10;
        
        System.out.print("Sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        
        String sayi = input.nextInt();
        String[] rakamlar = sayi.split("");
        
        for (int i = 0; i < rakamlar.length; i++) {             
            if (Integer.parseInt(rakamlar[i]) > max) {
                max = Integer.parseInt(rakamlar[i]);
            } else if (Integer.parseInt(rakamlar[i]) < min) {
                min = Integer.parseInt(rakamlar[i]);
            }
        }
        
        System.out.println("En büyük rakam: " + max);
        System.out.println("En küçük rakam: " + min);
    }
}