class Bank {
        private String fullName;
        private String bankAccountNumber;
        private double balance;
        private int years;

        Bank(String fullName, String bankAccountNumber,double balance, int years) {
            this.fullName = fullName;
            this.bankAccountNumber = bankAccountNumber;
            this.balance = balance;
            this.years = years;

        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getFullName() {
            return fullName;
        }
        public String getBankAccountNumber() {
            return bankAccountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setYears(int years) {
            this.years = years;
        }

        public int getYears() {
            return years;
        }

        //method print
        public void print() {
            System.out.println("fullname: " + fullName);
            System.out.println("bankAccount: " + bankAccountNumber);
            System.out.println("balance: : " + balance);
            System.out.println("years: : " + years);
        }



}
