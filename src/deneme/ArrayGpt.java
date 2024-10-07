package deneme;

import java.util.ArrayList;
import java.util.List;

public class ArrayGpt {
    public static void main(String[] args) {




        List<Integer> fibonacci2;
        fibonacci2 = fibonacci(6);
        System.out.println(fibonacci2);

    }





    public static List<Integer> fibonacci(int finish) {
        ArrayList<Integer> fibonacciArray = new ArrayList<>();
        int n1 = 0, n2 = 1, n3;

        fibonacciArray.add(n1); // ilk eleman 0
        if (finish > 1) {
            fibonacciArray.add(n2); // ikinci eleman 1
        }

        for (int i = 2; i < finish; i++) {
            n3 = n1 + n2;
            fibonacciArray.add(n3);
            n1 = n2;
            n2 = n3;
        }

        return fibonacciArray;
    }

}
