package deneme;

import java.util.Scanner;

public class ForLoop_03 {
    public static void main(String[] args) {
        int inputnumber;
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Lütfen bir sayı giriniz. (faktoryeli alınacak)");
            inputnumber = scan.nextInt();

            if (inputnumber >= 14) {
                System.out.println("Lütfen 14 ten küçük bir sayı giriniz.");

            } else {
                break;
            }
        }


        System.out.print(inputnumber + "! = ");
        int faktoryel = 1;
        for (int i = inputnumber; i >= 1; i--) {
             faktoryel *= i;
             if (i != 1){
                 System.out.print(i +"*");

             }else {
                 System.out.print(i +"");
             }




        }

        System.out.print(" = " +(faktoryel));

    }
}
