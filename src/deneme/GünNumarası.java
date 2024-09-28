package deneme;

import java.util.Scanner;

public class GünNumarası {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte gunNumarasi;
        System.out.println("Lütfen gün numarasını giriniz...");
        gunNumarasi = scan.nextByte();
        if (gunNumarasi==1){
            System.out.println("Pazartesi");
        }else if (gunNumarasi==2){
            System.out.println("Salı");
        }else if (gunNumarasi==3){
            System.out.println("Çarşamba");
        }else if (gunNumarasi==4) {
            System.out.println("Perşembe");
        }else if (gunNumarasi==5) {
            System.out.println("Cuma");
        }else if (gunNumarasi==6) {
            System.out.println("C.tesi");
        }else if (gunNumarasi==7) {
            System.out.println("Pazar");
        }else {
            System.out.println("gecersiz gun numarasi");
        }

    }
}
