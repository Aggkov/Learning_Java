import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(3);
        al.add(4); al.add(5); al.add(3);

        // Factorial
        IntFunc f = (x) -> {
            int val = 1;
            for(int i = 1; i <= x; i++)
               val *= i;
            return val;
        };
        System.out.println(al);

        // Call static method with arguments an arraylist and a Lambda function.
        // The Lambda Function will act on the arraylist.
        Utils.apply(al, f);

        // Now we have a static function with multiple Lambdas as parameters.
        Utils.apply(al, (n) -> n / 2);


    }
}
