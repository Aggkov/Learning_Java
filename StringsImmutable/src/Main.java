public class Main {
    public static void main(String[] args) {
        String s  = "a string";
        System.out.println(s + "(" + s.hashCode() +")");
        // s[1] = 'a'; //error -- immutable
        s = "another string"; //ok
        System.out.println(s + "(" + s.hashCode() +")");
        s = s + " some more"; //ok
        System.out.println(s + "(" + s.hashCode() +")");
    }
}