class Main {

    public static void main(String[] args) {
        //create array with 4 bank accounts and print max
        Bank[] array = {
                new Bank("Angelos Kovatsis", "000000123", 1000.0, 5),
                new Bank("Angelos ", "000000123", 1987.9, 5),
                new Bank("Angelos ", "000000123", 500.4, 5),
                new Bank("Angelos ", "000000123", 400.0, 5)
        };

        //find max balance
        double max = -1;
        //find also person with max balance account (when loop finds max balance it saves also the reference to that account)
        Bank r = null;

        for (var account: array) {
            if (account.getBalance() > max) {
                max = account.getBalance();
                r = account;
            }
        }
        r.print();




    }
}
