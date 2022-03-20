public class Main {

    public static void main(String[] args) {
        //new object o
        MyClass o = new MyClass();
//       //I can access my object in 3 ways:
//       // 1st way: Reference to the object class. With this way I can access super ,sub and interface methods with my object
        o.sub();
        o.sup();
        o.inter();

        System.out.println("=============");

        // 2nd way: Reference to super class: Can access only superClass methods with my object (unless I have overwritten a method in subclass
        //Reference of object o references super class
        SupClass s = o;

        // s.sub(); Doesn't work
        s.sup();

        // 3rd way: Reference to the interface that the class object implements
        MyInterface i = o;
        //only Interface method works
        i.inter();





    }
}
