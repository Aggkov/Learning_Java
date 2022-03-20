package pack.subpack;

// if B is not public we can't use it
public class B {
    int x;

    public B(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "B{" +
                "x=" + x +
                '}';
    }
}
