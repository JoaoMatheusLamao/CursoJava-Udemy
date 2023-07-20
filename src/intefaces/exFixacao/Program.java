package intefaces.exFixacao;

import intefaces.exFixacao.entities.Contract;

import intefaces.exFixacao.entities.Installment;
import intefaces.exFixacao.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato: ");

        System.out.print("Número: ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data: (dd/MM/yyyy) ");
        LocalDate localDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Valor do contrato: ");
        Double valorContratual = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        Integer numeroParcelas = sc.nextInt();
        sc.nextLine();

        Contract contract = new Contract(number,localDate, valorContratual);

        ContractService contractService = new ContractService();

        contractService.processContract(contract, numeroParcelas);

        System.out.println("\nPARCELAS");

        for (Installment parcelas :
                contract.getInstallmentsList()) {
            System.out.print( parcelas.getDueData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - R$" + parcelas.getAmount() + "\n");
        }
        sc.close();


    }
}
