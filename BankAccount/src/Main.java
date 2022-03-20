public class Main {

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Angelos Kovatsis", "000000123", 1000.0, 5);
        System.out.println(b);

        //change fullname and print
        b.setFullName("Angelos K");
        System.out.println(b);

        //change years
        b.setYears(8);
        System.out.println(b);




    }
}
