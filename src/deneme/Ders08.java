package deneme;

import java.util.Scanner;

public class Ders08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz...");
        double number = scan.nextDouble();
        number = number%5;
        boolean sonuc = number == 0;
        if (sonuc){
            System.out.println("Girmiş olduğunuz sayı 5 ile tam bölünebilir...");
        }
        if (!sonuc){
            System.out.println("Girmiş olduğunuz sayı 5 ile tam bölünemez!!!");
        }


    }
}
