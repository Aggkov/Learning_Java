import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Array of Objects
        Person[] array = {new Person("John", "Snow"),
                new Person("Tywin", "Lannister"),
                new Person("Cersei", "Lannister")};

        //after implementing compareTo() I can now sort
        Arrays.sort(array);
        for (Person p : array)
            System.out.println(p);
    }
}