public class Main {

    public static void f(Object o, int padding) {
        // o will be be converted to String to find its length
        System.out.println("+" + "-".repeat(2*padding + String.valueOf(o).length()) +"+");
        //Here toString will be called to print object o
        System.out.println("|" + " ".repeat(padding) + o + " ".repeat(padding) + "|");
        System.out.println("+" + "-".repeat(2*padding + String.valueOf(o).length()) +"+");
    }

    public static void main(String[] args) {
        f(5, 3);
        f("a string", 6);
    }
}