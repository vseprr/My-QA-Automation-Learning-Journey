package deneme;

public class ForLoop {
    public static void main(String[] args) {

        // 980 den 2352 ye kadar olan çift sayıları yazdırın
        int sayac = 0;

        for (int cift = 980; cift <= 2352; cift++) {
            if (cift % 2 == 0) {
                sayac++;
                System.out.print(cift + " ");
            }
        }
        System.out.println("");

        // Toplam çift sayı sayısını yazdır
        System.out.println("Toplam çift sayı: " + sayac);


    }
}