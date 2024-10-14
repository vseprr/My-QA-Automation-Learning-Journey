package deneme;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Java çok harikadıkrk.";
        Scanner scan = new Scanner(System.in);
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.indexOf("i"));
        System.out.println(str.contains("k h"));
        System.out.println(str.contains("k"));
        String str2  ="javaasdads";
        System.out.println(str2.substring(0));
        System.out.println(str.lastIndexOf('k'));
        System.out.println("lutfen gir");
        char input = scan.next().charAt(0);
        int sonK = str.lastIndexOf(input)-1;
        System.out.println(str.lastIndexOf(input,sonK));

    }
}
