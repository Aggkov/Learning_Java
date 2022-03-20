public class Main {

    public static void main(String[] args) {
        // new object without reference calls g Method
        (new SClass()).g();
        // call Interface Method
        System.out.println(StatInterface.f());
    }
}
