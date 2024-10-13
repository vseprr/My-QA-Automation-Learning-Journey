package deneme;

import java.util.Scanner;

public class SwitchStatements_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ISTQB;
        System.out.println("Lütfen ISTQB kısaltmasının hangi harfinin " +
                "ne anlama geldiğini merak ediyorsanız aşğıya girin.");
        ISTQB = scan.next().toUpperCase().charAt(0);



        switch (ISTQB){
            case 'I':
                System.out.println("I : International");
                break;
            case 'S':
                System.out.println("S : International2");
                break;
            case 'T':
                System.out.println("T : International3");
                break;
            case 'Q':
                System.out.println("Q : International4");
                break;
            case 'B':
                System.out.println("B : International5");
                break;
            default:
                System.out.println("girilen harf gecersiz");

        }

    }
}
