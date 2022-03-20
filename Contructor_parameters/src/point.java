import java.lang.Math;

public class point {

    int x;                          // class characteristics
    int y;

    point (point object) {          //copy_constructor
        x = object.x;
        y = object.y;
    }

    point(int x, int y) {
        this.x = x;                 //  characteristic of class (this x) is given the value of argument int x.
        this.y = y;
    }

    point middle(point object) {
        // new object
        point middle = new point((this.x + object.x) / 2, (this.y + object.y) /2 );
        return middle;
    }

    void set(int x, int y) {            // method set manipulates members of class
        this.x = x;
        this.y = y;

    }

    double length() {
        double len = Math.sqrt(x*x + y*y);
        return len;
    }


    void print()
    {
        System.out.println("(" + x + "," + y + ")");
    }
}
