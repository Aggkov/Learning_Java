import java.util.ArrayList;

public class Utils {
    static void apply(ArrayList<Integer> al, IntFunc ob) {

        /* For every element inside the ArrayList apply the Lambda function
         and instead of returning the value and storing it in a variable,
         set the current element with new value.
         */

        for(int i = 0; i < al.size(); i++)
            al.set(i, ob.func(al.get(i)));
        System.out.println(al);
        }
    }

        /*
        int fact;

        for(int i = 0; i < al.size(); i++) {
        fact = ob.func(al.get(i));
        System.out.print(fact + " ");

        */



