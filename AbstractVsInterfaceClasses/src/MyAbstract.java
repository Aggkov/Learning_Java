public class MyAbstract {
    int x; // var that will get inherited by subs
    final int fx = 5;  // constant
    static int sx; // static variable (inherited by subs)
    final static int fsx = 4;   // static constant (1 value for all objects)

    void f() {} // method
    static void g(){} // static method
    abstract void af(); // abstract method

}
