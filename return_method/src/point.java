import java.lang.Math;

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

        double length() {
            double len = Math.sqrt(x*x + y*y);
            return len;
        }
        void print()
        {
            System.out.println("(" + x + "," + y + ")");
        }
    }

