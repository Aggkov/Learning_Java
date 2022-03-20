import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

//        Snack s = new Snack();
//        s.read(sc);
//        System.out.println(s);

        TropicalFruit f = new TropicalFruit();

        f.read(sc);
        System.out.println(f);







        sc.close();

    }
}
