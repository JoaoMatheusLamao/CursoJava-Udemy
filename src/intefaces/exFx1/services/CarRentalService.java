package intefaces.exFx1.services;

import intefaces.exFx1.entities.CarRental;
import intefaces.exFx1.entities.Invoice;

import java.time.Duration;

public class CarRentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    public CarRentalService(Double pricePerHour, Double pricePerDay) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }



    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60.0;

        Double basic;
        if (hours > 12){
            basic = Math.ceil(hours/24) * pricePerDay;
        }else {
            basic = Math.ceil(hours) * pricePerHour;
        }

        carRental.setInvoice(new Invoice(basic, BrazilTaxService.tax(basic)));
    }
}
