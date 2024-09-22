package deneme;

import java.util.Scanner;

public class IfDivaded {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bir sayı giriniz...");
            double number = scan.nextDouble();
            if ((number % 5 == 0) && (number % 3 == 0)) {
                System.out.println("Girmiş olduğunuz sayı bir süper sayıdır !");
            } else if (number % 5 == 0) {
                System.out.println("Girmiş olduğunuz sayı 5 ile tam bölünebilir...");
            } else if (number % 3 == 0) {
                System.out.println("Girmiş olduğunuz sayı 3 ile tam bölünebilir...");
            } else {
                System.out.println("Girmiş olduğunuz sayı 5 ve 3 ile tam bölünemez.");
            }
        }
    }
}
