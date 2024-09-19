package deneme;

import java.util.Scanner;

public class dersiGectimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üç adet sınav puanınızı giriniz...");
        double not1 = scan.nextDouble();
        double not2 = scan.nextDouble();
        double not3 = scan.nextDouble();
        boolean notort = (not1+not2+not3)/3>=50;
        if (notort){
            System.out.println("Tebrikler! dersi gectiniz.");
        }else {
            System.out.println("Maalesef kaldınız...");
        }

    }
}
