import java.util.Random;

public class Main {

    public static void main(String[] args) {
        point object = new point();
        // class Random with object r and we initialize its constructor (just like all classes)
        Random r = new Random();

        object.set(r.nextInt(11), r.nextInt(11));
        object.print();

        // Start = 10 (10 till 20)
        object.x = 10 + r.nextInt(11);
        object.y = 10 + r.nextInt(11);
        object.print();
    }
}
