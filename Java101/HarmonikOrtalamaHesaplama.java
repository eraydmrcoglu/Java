import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        double total = 0.0;
        for (int i : list){
            total += 1 / i;
        }
        System.out.println("Dizi : \n" + Arrays.toString(list));
        System.out.println("Dizinin Harmonik Ortalaması : " + list.length / total);
    }
}