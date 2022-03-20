package p1;

public class A3 {
    //A3 does not inherit A1 but it defines an object of type A1
    A1 ob;

    public A3() {
        this.ob = new A1();
    }

    @Override
    public String toString() {
        return "A3{" +
        //"pri=" + pri + // doesn't work
        ", pub=" + ob.pub +
                ", nomod=" + ob.nomod +
                ", pro=" + ob.pro +
                '}';
    }
}
