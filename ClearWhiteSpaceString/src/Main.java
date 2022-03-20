import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static String getName(Scanner sc) {
        System.out.print("Type your Lastname: ");
        //Erase Whitespace and converts all chars to lower
        String s = sc.next().strip().toLowerCase();
        //we need 1st char to be Upper. 1) Get char[0] from s ,make it a string(valueOf) 2)Concat with rest string (lowercase)// substring(1) = from position 1 and forth
        return String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println(getName(sc));
        }
    }
}




