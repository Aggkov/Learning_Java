import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    Actors array[] = {
                new Actors("Daniel day Lewis", 1600.50),
                new Actors("Al Pacino", 1800.55),
                new Actors("Antony Hopkins", 900.13),
                new Actors("Jeremy Irons", 800.20),
                new Actors("Tom Hanks", 1300.60)
        };
        
        System.out.print("+");
        for(int i = 0; i < 3; i++) System.out.print("-");
        System.out.print("+");
        for(int i = 0; i < 20; i++) System.out.print("-");
        System.out.print("+");
        for(int i = 0; i < 9; i++) System.out.print("-");
        System.out.print("+\n");


        for(int i = 0; i < array.length; i++) {
            System.out.print("| " + (i+1) + " |");
            System.out.printf("%-20s|", array[i].getFullName());
            System.out.printf(Locale.US, "%9.2f|", array[i].getSalary());

            System.out.println();
        }

        System.out.print("+");
        for(int i = 0; i < 3; i++) System.out.print("-");
        System.out.print("+");
        for(int i = 0; i < 20; i++) System.out.print("-");
        System.out.print("+");
        for(int i = 0; i < 9; i++) System.out.print("-");
        System.out.print("+\n");

    }
}
