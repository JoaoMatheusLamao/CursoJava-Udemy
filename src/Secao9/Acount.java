package Secao9;

public class Acount {
    //region Attributes
    private int num_acount;
    private String name_titular;
    private double saldo;
    //endregion

    //region Constructors
    public Acount(){

    }
    public Acount(int num_acount, String name_titular, double saldo) {
        this.num_acount  = num_acount;
        this.name_titular = name_titular;
        deposito(saldo);
    }
    public Acount(int num_acount, String name_titular) {
        this.num_acount  = num_acount;
        this.name_titular = name_titular;
    }
    //endregion


    //region Getter and Setters
    public int getNum_acount() {
        return num_acount;
    }

    public void setNum_acount(int num_acount) {
        this.num_acount = num_acount;
    }

    public String getName_titular() {
        return name_titular;
    }

    public void setName_titular(String name_titular) {
        this.name_titular = name_titular;
    }

    public double getSaldo() {
        return saldo;
    }
    //endregion

    public void saque(double value){
        this.saldo -= value;
    }

    public  void deposito(double value){
        this.saldo += value;
    }

    public String toString() {
        return "Número: "
                + getNum_acount()
                + "\nTitular: "
                + getName_titular()
                + "\nSaldo: "
                + getSaldo();
    }
}
