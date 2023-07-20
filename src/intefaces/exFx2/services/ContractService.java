package intefaces.exFx2.services;

import intefaces.exFx2.entities.Contract;
import intefaces.exFx2.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    public void processContract(Contract contract, int months){

        Double valorBase = contract.getTotalValue()/months;

        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getLocalDate().plusMonths(i);

            OnlinePaymenteService paymenteService = new PaypalService();

            Double result = paymenteService.interest(valorBase, i) + valorBase;
            result += paymenteService.paymenteFee(result);

            Installment parcela = new Installment(dueDate, result);
            contract.setInstallmentsList(parcela);
        }

    }

}
