public class Main {

    public static void main(String[] args) {
        MyData d = new MyData();
        MyData2 d2 = new MyData2();

        //interface reference
        StandardMethods ir;
        // interface references to object in class MyData
        ir = d;
        ir.print();
        //interface references to object in class MyData2
        ir = d2;
        ir.print();

    }
}
