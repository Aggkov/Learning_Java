public class Main {

    public static void main(String[] args) {
        Box<Integer> i = new Box<>(5);
        Box<String> s = new Box<>("some string");

        System.out.println(i.getData() + " " + s.getData());

    }
}