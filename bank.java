class bank
{
    private int balance = 5000;

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public int getBalance(){
        return balance;
    }

    public static void main(String args[])
    {
        bank a = new bank();

        a.deposit(2000);

        a.withdraw(1000);

        System.out.println("Balance: " + a.getBalance());
    }
}
