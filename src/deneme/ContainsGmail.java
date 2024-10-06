package deneme;

import java.util.Scanner;

public class ContainsGmail {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mailinizi giriniz...");

        input = scan.nextLine().toLowerCase();

        if (!(input.contains("@gmail.com") && input.contains("@"))) {
            System.out.println("Geçersiz Mail !");
        } else if (!input.endsWith("@gmail.com")) {
            System.out.println("Mailde yazım hatası var.");

        }
        System.out.println(input.indexOf("y", 6));
    }

}
