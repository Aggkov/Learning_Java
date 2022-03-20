import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //array reference to base class, so I can save inside objects of base class(Shape) AND Subclasses
        Shape[] array = new Shape[10];
        Random r = new Random();

        for (int i = 0; i < array.length; i++)
            switch (r.nextInt(5)) {
                case 0:
                    array[i] = new Shape();
                    break;
                case 1:
                    array[i] = new Triangle();
                    break;
                case 2:
                    array[i] =  new Square();
                    break;
                case 3:
                    array[i] = new Ellipse();
                    break;
                case 4:
                    array[i] = new Cycle();
                    break;
            }
        for (Shape s: array)
            s.drawShape();
    }
}
