import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Lamda gets called by Interface reference
        FuncInter f = (n)->n/2;
        // Call function from interface
        System.out.println(f.func(5));

        f = (x) -> x*x;
        System.out.println(f.func(2));

        f = (n) -> 2*n + 1;
        System.out.println(f.func(4));

        Random r = new Random();
        f = (n) -> r.nextInt(10)*n;
        System.out.println(f.func(10));

    }
}