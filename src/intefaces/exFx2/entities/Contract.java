package intefaces.exFx2.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {

    private Integer number;
    private LocalDate localDate;
    private Double totalValue;
    private ArrayList<Installment> installmentsList = new ArrayList<>();

    public Contract(Integer number, LocalDate localDate, Double totalValue) {
        this.number = number;
        this.localDate = localDate;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public ArrayList<Installment> getInstallmentsList() {
        return installmentsList;
    }

    public void setInstallmentsList(Installment parcela) {
        this.installmentsList.add(parcela);
    }
}
