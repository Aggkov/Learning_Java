public class Main {

    public static void main(String[] args) {
        //Conversion
        //valueOf is a static method called by the class name
        String s = String.valueOf(5);
        String s2 = String.valueOf(true);
        System.out.println(s + " " + s2);
        //now 5 and true are Strings!
    }
}
