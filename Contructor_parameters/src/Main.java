public class Main {

    public static void main(String[] args) {

        point p1 = new point(1, 1);
        point p2 = new point(3,3);

        point p3 = p1.middle(p2);          //Find the middle of object p1 (with argument of p2)
        p3.print();

    }
}
