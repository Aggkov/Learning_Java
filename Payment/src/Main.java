public class Main {

    public static void main(String[] args) {
        Payment p = new Payment(560.4);
        Credit c = new Credit(1250.5, "1000000222000", "12-04-2023");
        Check ch = new Check(901.1, 123, "1000000222000");

        p.print();
        c.print();
        ch.print();


    }
}
