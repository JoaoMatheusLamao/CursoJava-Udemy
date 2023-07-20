package intefaces.exFixacao.services;

public interface OnlinePaymenteService {
    public Double paymenteFee(Double amount);
    public Double interest(Double amount, int months);
}
