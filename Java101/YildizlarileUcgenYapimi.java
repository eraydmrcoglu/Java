import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz : ");
        int n = input.nextInt();

        for (int i = 1 ; i <= n ; i++) {
            for (int k = 1 ; k<=(n-i);k++) {
                System.out.print(" ");
            }
                for (int j = 1 ; j<=(2*i)-1 ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        for (int l = n-1; l >= 1; l--) { 
            for (int h = 1; h <= (n-l); h++) {
                System.out.print(" ");
            }
                for (int g = (2*l)-1; g>=1; g--) {
                    System.out.print("*");
        }
            System.out.println();

        }
    }
}