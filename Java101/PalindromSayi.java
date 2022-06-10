import java.util.Scanner;

public class Main {
    
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("Sayı => " + temp);
            lastNumber = tem % 10;
            System.out.println("Son Basamak => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni Sayı => " + reverseNumber);
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrom(247);
    }
}