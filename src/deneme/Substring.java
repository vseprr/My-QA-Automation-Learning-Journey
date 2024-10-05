package deneme;

import java.util.Scanner;

public class  Substring {
    public static void main(String[] args) {
        String input;

         Scanner scan = new Scanner(System.in);


        System.out.println("gir");
        input = scan.nextLine().toLowerCase();


        if (input.contains("ev") && input.contains("iş")) {
            System.out.println("denge güzeldir...");

        } else if (input.contains("iş")) {
            System.out.println("çalışmak güzeldir");

        } else if (input.contains("ev")) {
            System.out.println("evim guzel evim...");

        } else {
            System.out.println("tembel teneke");
        }


    }
}
