package deneme;

import java.util.Scanner;

public class SwitchStatemenst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte gunNumarasi;
        System.out.println("Lütfen gün numarasını giriniz...");
        gunNumarasi = scan.nextByte();



        switch (gunNumarasi){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Pazarte");
                break;
            case 3:
                System.out.println("Pazarsi");
                break;
            case 4:
                System.out.println("Paztesi");
                break;
            case 5:
                System.out.println("Paartesi");
                break;
            case 6:
                System.out.println("zartesi");
                break;
            case 7:
                System.out.println("azartesi");
                break;
            default:
                System.out.println("gecersizzzzzzzz");
        }



    }
}
