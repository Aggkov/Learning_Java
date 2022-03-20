public class point {

    int x;                          //members of class
    int y;

    point() {
        x = 0;
        y = 0;
    }

    void set(int x, int y) {            // method set manipulates members of class
        this.x = x;
        this.y = y;

    }
    void print()
    {
        System.out.println("(" + x + "," + y + ")");
    }
}
