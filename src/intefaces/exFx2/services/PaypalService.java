package intefaces.exFx2.services;

public class PaypalService implements OnlinePaymenteService{
    @Override
    public Double paymenteFee(Double amount) {
        return amount*0.02;
    }

    @Override
    public Double interest(Double amount, int months) {
        return (0.01*amount)*months;
    }
}
