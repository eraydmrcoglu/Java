import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);
        userName = inp.nextLine();

        System.out.print("Şİfreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız : "); 
        } else {
            System.out.println("Bilgileriniz Yanlış !");
        }
    }
}