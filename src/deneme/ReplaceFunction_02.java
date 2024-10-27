package deneme;

import java.util.Scanner;

public class ReplaceFunction_02 {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Metin giriniz:");
        input = scan.nextLine();

        // Fazla boşlukları tek bir boşlukla değiştir
        input = input.replaceAll("\\s+", " ");

        // Sayıları kaldır
        input = input.replaceAll("\\d", "");

        // Özel karakterleri kaldır (boşluk hariç)
        input = input.replaceAll("[^\\w\\s]", "");

        // Başlangıç ve bitişteki olası boşlukları kırp
        input = input.trim();

        System.out.println(input);
        double number = 900000000;
        int number2 = (int) number;
        System.out.println(number2);

    }
}
