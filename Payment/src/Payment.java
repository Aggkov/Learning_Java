public class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void print() {
        System.out.println("PAYMENT: ");
        System.out.println("Amount: " + amount);
    }
}
