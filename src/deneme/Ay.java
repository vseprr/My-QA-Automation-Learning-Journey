package deneme;

import java.util.Scanner;

public class Ay {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz...");
        Character inputChar = scan.next().charAt(0);
        if (inputChar == 'o' || inputChar =='O'){
            System.out.println("Ocak");
        }
        if (inputChar == 'ş' || inputChar =='Ş'){
            System.out.println("Şubat");
        }
        if (inputChar == 'm' || inputChar =='M'){
            System.out.println("Mart");
        }
        if (inputChar == 'n' || inputChar =='N'){
            System.out.println("Nisan");
        }
        if (inputChar == 'm' || inputChar =='M'){
            System.out.println("Mayıs");
        }
        if (inputChar == 'h' || inputChar =='H'){
            System.out.println("Haziran");
        }
        if (inputChar == 't' || inputChar =='T'){
            System.out.println("Temuz");
        }
        if (inputChar == 'a' || inputChar =='A'){
            System.out.println("Ağustos");
        }
        if (inputChar == 'e' || inputChar =='E'){
            System.out.println("Eylül");
        }
        if (inputChar == 'e' || inputChar =='E'){
            System.out.println("Ekim");
        }
        if (inputChar == 'k' || inputChar =='K'){
            System.out.println("Kasım");
        }
        if (inputChar == 'a' || inputChar =='A'){
            System.out.println("Aralık");
        }
    }
}
