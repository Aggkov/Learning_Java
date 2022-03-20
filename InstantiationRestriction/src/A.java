public class A<T> {
    T elem;

    public A(T elem) {
        this.elem = elem;
    }

    public A() {
        elem = new T();
    }
}