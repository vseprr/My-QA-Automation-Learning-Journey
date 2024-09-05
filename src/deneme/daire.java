package deneme;

import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double parsedRadius;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("------------------------------");
            System.out.println("Lutfen bir yaricap giriniz...");
            String input = scanner.nextLine();
            try {
                parsedRadius = Double.parseDouble(input);
                double circleArea = parsedRadius * parsedRadius * Math.PI;
                System.out.println("girmis olduğunuz dairenin alanı :" + circleArea);

                if (circleArea < 100) {
                    System.out.println("Alan 100den küçük. " + circleArea);
                } else {
                    System.out.println("Alana 100den büyük. " + circleArea);
                }
            } catch (NumberFormatException e) {
                System.out.println("Lütfen bir sayı giriniz.");
            }
        }

    }
}

