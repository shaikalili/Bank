public abstract class BankAcount {
    private int accNumber;
    private Costumer costumer;
    private double balance;
    private boolean fees;
    private static int AccId=1;

    public BankAcount(){}

    public BankAcount(Costumer costumer, double balance, boolean fees) {
        setCostumer(costumer);
        setBalance(balance);
        setFees(fees);
        this.AccId++;
        setAccNumber(this.AccId);
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accId) {
        this.accNumber =(int)Math.round(this.AccId*this.balance-8);
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public boolean isFees() {
        return fees;
    }

    public void setFees(boolean fees) {
        this.fees = fees;
    }

    public static int getAccId() {
        return AccId;
    }

    public static void setAccId(int accId) {
        AccId = accId;
    }

    public abstract void deposite(double number);
    public abstract double withdraw(double number);

    @Override
    public String toString() {
        return "BankAcount{" +
                "accNumber=" + getAccNumber() +
                ", costumer=" + getCostumer() +
                ", balance=" + getBalance() +
                ", fees=" + isFees() +
                '}';
    }
}
