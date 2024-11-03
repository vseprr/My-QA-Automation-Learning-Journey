package deneme;

import java.util.Scanner;

public class ForLoop_02 {
    public static void main(String[] args) {
        int numberStart;
        int numberFinish;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Lütfen başlangıç ve bitiş değerlerini giriniz...");
            numberStart = scan.nextInt();
            numberFinish = scan.nextInt();

            if (numberFinish < numberStart){
                System.out.println("Bitiş değeri başlangıçtan küçük olamaz lütfen tekrar giriniz");
            }else {
                break;
            }

        }


        for (int i = numberStart; i <= numberFinish ; i++) {

            if (i % 7 == 0){
                System.out.print("7 ile tam bölünebilen sayılar : ");
            }
            break;

        }
        for (int i = numberStart; i <= numberFinish ; i++) {

            if (i % 7 == 0){
                System.out.print(i + " ");
            }

        }






    }
}
