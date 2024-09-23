package deneme;

import java.util.Scanner;

public class StringUzunluk {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir şeyler girin");
        input = scan.nextLine();
        int metinLenght = input.length();
        boolean metingLenghtControl = (metinLenght % 2 == 0);

        if (metingLenghtControl == true) {
            System.out.println((input.substring(0, input.length() / 2)) + ":)" + (input.substring(input.length() / 2)));

        } else {
            System.out.println((input.substring(0, input.length() / 2)) + ":(" + (input.substring(input.length() / 2)));
        }
    }
}
