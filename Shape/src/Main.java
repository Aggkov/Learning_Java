public class Main {

    public static void main(String[] args) {
        Triangle t = new Triangle(new Point(0,0),new Point(1,1), new Point(2,0) );
        t.draw();
        System.out.println("Perimeter: " + t.perimeter());

        Triangle t2 = new EquilateralTriangle(new Point(0,0))
    }
}
