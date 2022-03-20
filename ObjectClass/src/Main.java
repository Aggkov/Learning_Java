public class Main {

    public static void main(String[] args) {
        SampleClass s = new SampleClass(1,2);
        System.out.println(s.getClass());
        System.out.println(s.toString());   //calls ToString overriden method
        System.out.println(s);              //now I can just print s like that

        SampleClass s2 = new SampleClass(s);
        System.out.println(s == s2);           // Comparing references of two objects
        System.out.println(s.equals(s2));       //but their values are equal since we implemented copyConstructor

        //s2 can be also an object of superClass Object. Their values are equal again
        Object o = s2;
        System.out.println(s.equals(o));
    }
}
