import java.util.Scanner;

public class Main {

    public static int us(int taban,int usdeger) {
        if (usdeger==0)
            return 1;
        else if(taban==1)
            return 1;
        else
            return taban*us(taban, usdeger-1);
    }
    
    public static void main(String[] args) {
        System.out.println(us(2, 5));
    
    }
    
}