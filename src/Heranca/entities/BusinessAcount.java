package Heranca.entities;

public class BusinessAcount extends Acount{
    private Double loan_limit;

    public BusinessAcount() {
        super();
    }

    public BusinessAcount(Integer number, String holder, Double balance, Double loan_limit) {
        super(number, holder, balance);
        this.loan_limit = loan_limit;
    }

    public Double getLoan_limit() {
        return loan_limit;
    }

    public void setLoan_limit(Double loan_limit) {
        this.loan_limit = loan_limit;
    }
    @Override
    public void saque(double amount){
        this.balance += amount *2;
    }
}
