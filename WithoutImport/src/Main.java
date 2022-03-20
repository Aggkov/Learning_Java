public class Main {

    public static void main(String[] args) {
        pack.A a = new pack.A(5);
        System.out.println(a);

        pack.subpack.B b = new pack.subpack.B(5);
        System.out.println(b);
    }
}
