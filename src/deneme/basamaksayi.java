package deneme;

import java.util.Scanner;

public class basamaksayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen rakamlarını toplamak istediğin sayiyi gir.");
        int sayi1 = scan.nextInt();
        int bsmk1 = sayi1 % 10;
        int bsmk10 = sayi1 / 10 % 10;
        int bsmk100 = sayi1 / 100;
        System.out.println("girilen sayının rakamları toplamı : " + (bsmk1 + bsmk10 + bsmk100));

    }
}
