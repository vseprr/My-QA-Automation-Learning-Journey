package deneme;

import java.util.Scanner;

public class kelime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim gir");
        String isim= scan.nextLine();
        System.out.println("lutfen soyisim gir");
        String soyisim= scan.nextLine();
        System.out.println("Lutfen yas gir");
        double yas=scan.nextDouble();
        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(yas);


    }
}
