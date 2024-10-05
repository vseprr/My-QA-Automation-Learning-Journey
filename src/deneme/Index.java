package deneme;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number;
        System.out.println("Lütfen sayı gir...");
        number = scan.nextDouble();

        // İlk koşul: number 10'a tam bölünemiyorsa
        if (number % 10 != 0) {
            // number 100'den büyük veya eşitse
            if (number >= 100) {
                // number 200'den küçük veya eşitse
                if (number <= 200) {
                    System.out.println("Sayı 100 ile 200 arasında ve 10'a tam bölünmüyor.");
                } else if (number > 200) {
                    // number 200'den büyükse ve 10'a tam bölünemiyorsa
                    System.out.println("Sayı 200'den büyük ve 10'a tam bölünmüyor.");
                }
            }
        } else if (number > 300) {
            // İlk koşul sağlanmazsa ve number 300'den büyükse
            System.out.println(number);
        }
    }
}
