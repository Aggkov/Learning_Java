public class Check extends Payment{
    private int checkBook;
    private String bankCode;

    Check(double amount, int checkBook, String bankCode) {
        super(amount);
        this.checkBook = checkBook;
        this.bankCode = bankCode;
    }

    public void print() {
        System.out.println("\n\nCHECK: " + checkBook);
        System.out.println("Amount: " + getAmount());
        System.out.println("Checkbook: " + checkBook);
        System.out.println("bankCode: " + bankCode);
    }
}
