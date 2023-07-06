package Polimorfismo.entities;

public class EmployeeOutsourced extends Employee{
    private double additionalCharge;

    public EmployeeOutsourced(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return (double) this.getHours()*this.getValuePerHour() + (this.additionalCharge * 1.10);
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
