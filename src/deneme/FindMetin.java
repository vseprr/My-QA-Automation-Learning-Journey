package deneme;

import java.util.Scanner;

public class FindMetin {
    public static void main(String[] args) {
        String inputSentences;
        String inputWant;
        int firstIndex;
        int lastIndex;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen cümleyi ve içinde bulmak istediğiniz metni girin.");
        inputSentences = scan.nextLine().toLowerCase();
        inputWant = scan.nextLine().toLowerCase();
        firstIndex = inputSentences.indexOf(inputWant);
        lastIndex = inputSentences.lastIndexOf(inputWant);

        if (firstIndex == -1) {
            System.out.println("İstediğiniz metin cümle içinde geçmiyor.");
        } else if (firstIndex == lastIndex) {
            System.out.println("Aradığınız metin cümlede geçiyor.");
        } else {
            System.out.println("Aradığınız metin cümlede birden fazla kullanılmış.");
        }
    }
}