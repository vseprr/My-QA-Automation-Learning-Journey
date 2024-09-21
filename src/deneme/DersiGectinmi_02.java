package deneme;

import java.util.Scanner;

public class DersiGectinmi_02 {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            double not1, not2, not3;

            while (true) {
                System.out.println("Lütfen üç adet sınav puanınızı giriniz...");
                not1 = scan.nextDouble();
                not2 = scan.nextDouble();
                not3 = scan.nextDouble();

                if ((not1 < 0) || (not1 > 100) || (not2 < 0) || (not2 > 100) || (not3 < 0) || (not3 > 100)) {
                    System.out.println("Girdiğiniz notlar geçersizdir, lütfen notlarınızı kontrol edin.");
                } else {
                    break;
                }
            }

            double notort = (not1 + not2 + not3) / 3;
            if (notort >= 85) {
                System.out.println("Notunuz AA");
            } else if (notort >= 65) {
                System.out.println("Notunuz BB");
            } else if (notort >= 50) {
                System.out.println("Notunuz CC");
            } else {
                System.out.println("Notunuz DD");
            }
        }
    }
}