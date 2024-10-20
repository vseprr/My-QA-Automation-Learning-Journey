package deneme;

public class ReplaceFunction {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);
        str = "java nhaber cnm 345 yhaa ?";
        System.out.println(str.replace("cnm","canım"));
        System.out.println(str.replace('a',' '));
        System.out.println(str.replace("a",""));
        System.out.println(str.replace("cnm","HAN"));
        System.out.println(str.replaceFirst("a","G"));
        System.out.println(str.replaceFirst(" ","*"));
        System.out.println(str.replaceFirst("\\s","*"));
        System.out.println(str.replaceFirst("\\d","*"));
        System.out.println(str.replace(str.charAt(0),str.toUpperCase().charAt(0)));


    }
}
