package p1;

public class A2 extends A1{
    @Override
    public String toString() {
        return "A2 {" +
                //"pri=" + pri + // doesn't work
                ", pub=" + pub +
                ", nomod=" + nomod +
                ", pro=" + pro +
                '}';
    }
}
