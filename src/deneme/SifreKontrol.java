package deneme;

import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz:");
        String password = scan.nextLine();

        if (!isLastCharacterDigit(password)) {
            System.out.println("Şifrenizin son karakteri rakam içermeli.");
        } else if (containsSpace(password)) {
            System.out.println("Şifrenizde boşluk olmamalı.");
        } else if (!isFirstCharacterUppercase(password)) {
            System.out.println("Şifrenizin ilk harfi büyük olmalı.");
        } else if (!isLengthValid(password)) {
            System.out.println("Şifreniz en az 10 karakter olmalı.");
        } else {
            System.out.println("Şifreniz başarıyla kaydedilmiştir.");
        }

        scan.close();
    }

    private static boolean isLastCharacterDigit(String password) {
        char lastChar = password.charAt(password.length() - 1);
        return Character.isDigit(lastChar);
    }

    private static boolean containsSpace(String password) {
        return password.contains(" ");
    }

    private static boolean isFirstCharacterUppercase(String password) {
        char firstChar = password.charAt(0);
        return Character.isUpperCase(firstChar);
    }

    private static boolean isLengthValid(String password) {
        return password.length() >= 10;
    }
}
