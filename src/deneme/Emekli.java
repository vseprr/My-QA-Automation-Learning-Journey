package deneme;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Emekli {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer yas = null;
        String cinsiyet;

        while (true) {
            System.out.println("Lütfen cinsiyet ve yaşınızı giriniz...");
            cinsiyet = scan.next();

            try {
                yas = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Yaş bilgisi sayısal olmalıdır!");
                scan.next(); // hatalı girişi temizlemek için
                continue;
            }

            if (!cinsiyet.equalsIgnoreCase("Kadın") && !cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Cinsiyet bilgisini doğru yazınız!");
            } else {
                break;
            }
        }

        if (cinsiyet.equalsIgnoreCase("Kadın")) {
            if (yas >= 60 && yas < 101) {
                System.out.println("Tebrikler! Emekli olabilirsiniz.");
            } else if (yas >= 101) {
                System.out.println("Emekli olabilirsiniz fakat girdiğiniz yaş bilgisi dolayısı ile danışmana danışınız...");
            } else {
                System.out.println("Üzgünüz :( Emekli olmak için gereken minimum yaş kriterini karşılamıyorsunuz...");
                System.out.println("Emekli olmak için " + (60 - yas) + " yıl çalışmanız gerekiyor.");
            }
        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            if (yas >= 65 && yas < 101) {
                System.out.println("Tebrikler! Emekli olabilirsiniz.");
            } else if (yas >= 101) {
                System.out.println("Emekli olabilirsiniz fakat girdiğiniz yaş bilgisi dolayısı ile danışmana danışınız...");
            } else {
                System.out.println("Üzgünüz :( Emekli olmak için gereken minimum yaş kriterini karşılamıyorsunuz...");
                System.out.println("Emekli olmak için " + (65 - yas) + " yıl çalışmanız gerekiyor.");
            }
        }
    }
}

