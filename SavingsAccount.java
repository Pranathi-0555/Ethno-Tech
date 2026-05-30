class Banktransactions {
    protected int balance;

    public Banktransactions(int balance) {
        this.balance = balance;
    }

    public void depos(int money) {
        balance += money;
        System.out.println("Deposited Amount: " + money);
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdraw(int money) {
        if (money <= balance) {
            balance -= money;
            System.out.println("Withdraw Amount: " + money);
            System.out.println("Balance after withdraw: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class Bank extends Banktransactions {

    public SavingsAccount(int balance) {
        super(balance);
    }

    public void addInterest() {
        int interest = (balance * 1) / 100; // 1% interest
        balance += interest;

        System.out.println("Interest Added: " + interest);
        System.out.println("Balance after Interest: " + balance);
    }

    public static void main(String args[]) {
        SavingsAccount sa = new SavingsAccount(500000);

        sa.showBalance();
        sa.depos(30000);
        sa.withdraw(200000);
        sa.addInterest();
        sa.showBalance();
    }
}