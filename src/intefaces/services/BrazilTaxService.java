package intefaces.services;

public class BrazilTaxService{
    public static Double tax(Double amount){
        if (amount>100.0){
            return amount*0.15;
        }
        else {
            return amount*0.2;
        }
    }
}
