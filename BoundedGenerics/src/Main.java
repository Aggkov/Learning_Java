public class Main {

    public static void main(String[] args) {
        /*doesn't work. Class Box cannot create objects of type A
        Box<A> c = new Box<A>(1); */

        Box<B> b = new Box<>(new B(1,2));
        Box<C> c = new Box<>(new C(1,2, 3));
        System.out.println(b);
        System.out.println(c);
    }
}