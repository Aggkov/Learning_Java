import jdk.swing.interop.SwingInterOpUtils;

public class Credit extends Payment{
    private String cardNumber;
    private String expDate;

    Credit (double amount, String cardNumber, String expDate) {
        super(amount);
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }

    public void print() {
        System.out.println("\n\nCREDIT");
        System.out.println("Amount: " + getAmount());
        System.out.println("Cardnumber: " + cardNumber);
        System.out.println("expDate: " + expDate);
    }
}
