package p2;

public class B1 extends p1.A1{
    @Override
    public String toString() {
        return  "B1 {" +
                //"pri=" + pri + // doesn't work
                ", pub=" + pub +
                //", nomod=" + nomod +  //Does not work
                ", pro=" + pro +
                '}';
    }
}
