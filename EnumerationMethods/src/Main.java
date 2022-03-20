import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Static values()
        Day[] array = Day.values();

        for(var d : array)
            System.out.println(d + "(" + d.ordinal() + ")");

        System.out.println(Day.THURSDAY.compareTo(Day.MONDAY));
        System.out.println(Day.THURSDAY.compareTo(Day.THURSDAY));
        System.out.println(Day.THURSDAY.compareTo(Day.FRIDAY));

        Day d = Day.valueOf("MONDAY");
        System.out.println(d);

        System.out.println("=====================");
        // Get input from user and print the matching constant from Enum class
        try (Scanner sc = new Scanner(System.in)) {
            // Initialize
            Day day = null;

            while (day == null) {
                try {
                    System.out.print("Print a day of the week: ");
                    String s = sc.next().toUpperCase();

                    // Return Constant that matches with String input
                    day = Day.valueOf(s);

                } catch (IllegalArgumentException e) {
                    System.out.println("Not a valid day");
                }
            }
            System.out.println(day);
        }
    }
}
