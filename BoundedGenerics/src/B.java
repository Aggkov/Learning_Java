public class B extends A{
    int y;

    public B(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + " y=" + y;
    }
}