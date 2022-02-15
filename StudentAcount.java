public class StudentAcount extends BankAcount{
    private int years;

    public StudentAcount(Costumer costumer, double balance, boolean fees, int years) {
        super(costumer, balance, fees);
        setYears(years);
        super.setFees(false);
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public void deposite(double number) {
        if(years<4){
            super.setBalance(number);
        }
        else
            super.setBalance(number-10);
    }

    @Override
    public double withdraw(double number) {
      super.setBalance(-number);
      return number;
    }

    @Override
    public String toString() {
        return super.toString()+"StudentAcount{" +
                "years=" + years +
                '}';
    }
}
