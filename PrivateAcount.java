public class PrivateAcount extends BankAcount{
    private final double feeAmount=6.9;

    public PrivateAcount(Costumer costumer, double balance, boolean fees) {
        super(costumer, balance, fees);
        this.setFees(true);
    }

    @Override
    public double withdraw(double number) {
        this.setBalance(-number);
        return number;
    }

    @Override
    public void deposite(double number) {
        this.setBalance(number-this.feeAmount);
    }

    @Override
    public String toString() {
        return   super.toString()+ "PrivateAcount{" +
                "feeAmount=" + feeAmount +
                '}';
    }
}
