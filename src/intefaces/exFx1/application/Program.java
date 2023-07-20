package intefaces.exFx1.application;

import intefaces.exFx1.entities.CarRental;
import intefaces.exFx1.entities.Vehicle;
import intefaces.exFx1.services.CarRentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modelCar = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.print("Entre com o preço por hora: ");
        Double pricePerHour = sc.nextDouble();

        System.out.print("Entre com o preço por hora: ");
        Double pricePerDay = sc.nextDouble();

        CarRental cr = new CarRental(start, finish, new Vehicle(modelCar));

        CarRentalService crService = new CarRentalService(pricePerHour, pricePerDay);

        crService.processInvoice(cr);

        System.out.println("Fatura: ");

        System.out.println("Pagamento básico: R$" + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: R$" + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: R$" + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
