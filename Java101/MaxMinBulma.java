import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = {25, 6, 748, 3, -9, -861, 4, 0};
        System.out.print("Girilen Sayı : ");
        int n = input.nextInt();
        Arrays.sort(list);

        int min = n;
        int max = n;

        for (int i = 0 ;i < list.length ;i++) {
            System.out.println(i);
            if (n < list[i]){
              min = list[i-1];
              max = list[i];
              break;
            }
        }
        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);



    }
}