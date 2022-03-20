import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /*ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al, 1,2,3,4,5);

        // Only even numbers will pass through
        List<Integer> array = al.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(array);

        List<Integer> array2 = al.stream()
                .map(x->x*x)
                .filter(x->x%2==0)
                .map(x->x/2)
                .collect(Collectors.toList());
        System.out.println(array2);*/

        ArrayList<String> al = new ArrayList<>();
        Collections.addAll(al, "5.2","1.6","1.1","4.44","1.52");

        al.stream()
                .mapToDouble(Double::valueOf)
                .peek(x->System.out.print(x + " "))
                .sorted()
                .takeWhile(x -> x<=4)
                .forEach(x->System.out.print("\n" + x));
            }
        }




