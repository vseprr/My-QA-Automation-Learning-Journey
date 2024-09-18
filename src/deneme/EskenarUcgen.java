package deneme;

import java.util.Scanner;

public class EskenarUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 adet kenar uzunluğunu giriniz...");
        int edge1 = scan.nextInt();
        int edge2 = scan.nextInt();
        int edge3 = scan.nextInt();
        boolean sonuc = (edge1 == edge2) || (edge1 == edge3) || (edge2 == edge3);
        if (sonuc) {
            System.out.println("Girmiş olduğunuz değerlere göre üçgeniniz bir eşkenar üçgendir...");
        }
        if (!sonuc) {
            System.out.println("Girmiş olduğunuz değerlere göre üçgeniniz bir eşkenar üçgen değildir...");
        }

    }
}
