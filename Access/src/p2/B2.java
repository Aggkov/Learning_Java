package p2;

import p1.A1;

public class B2 {
    A1 ob;

    public B2 () {
        this.ob = new A1();
    }

    @Override
    public String toString() {
        return "B2{" +
                //"pri=" + pri +            // doesn't work
                ", pub=" + ob.pub +
                //", nomod=" + nomod +      //Does not work
                // ", pro=" + ob.pro +      // Does not work
                '}';
    }
}
