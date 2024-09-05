package deneme;

import java.util.Scanner;

public class day_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir char giriniz...");
        char input=scan.next().charAt(0);
        char nextchar1 = (char) (input+1);
        char nextchar2 = (char) (input+2);
        char nextchar3 = (char) (input+3);
        System.out.println("girilen karakterlerin bir sonrasında olan karakterler: "+nextchar1+" "+nextchar2+" "+nextchar3);



    }
}
