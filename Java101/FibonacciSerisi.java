import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç Adet Fibonnacci Sayısı Görmek İstiyorsunuz?");
        int sayi = inp.nextInt();
        int birinci = 0;
        int ikinci = 1;
        int ucuncu = birinci + ikinci;
        
        System.out.println("Fibonacci Sayıları ");  
        System.out.print(birinci+ " "+ ikinci + " "); 
        
            while(sayi>0){
            System.out.print(ucuncu + " "); 
            sayi--;        
            birinci = ikinci;
            ikinci = ucuncu;      
            ucuncu = birinci+ikinci; 
             
              
          }   
        
    }

}