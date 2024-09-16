package deneme;

import java.util.Scanner;

public class Ders_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number;
        System.out.println("Lütfen notort gir");
        number = scan.nextDouble();
        System.out.println(number>0 ? (number%2==0 ? "sayı çift":"sayı tek"):(number<=-100 && number>-1000 ? "3 basamakli" : "3 basamaklı değil"));
    }
}
