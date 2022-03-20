public class C extends B{
    int z;

    public C(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + " z=" + z;
    }
}