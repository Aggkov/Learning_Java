import java.lang.Math;

public class Point {

    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point() {
        x = 0;
        y = 0;
    }
    Point(double diag) {
        this.x = diag;
        this.y = diag;
    }
    //copy constructor
    Point(Point ob) {
        this.x = ob.x;
        this.y = ob.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    void set(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void print() {
        System.out.println("( " + x + ", " + y + " )");
    }
}