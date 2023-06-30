package enumeracoes_composicoes;

import enumeracoes_composicoes.entities.Department;
import enumeracoes_composicoes.entities.HourContract;
import enumeracoes_composicoes.entities.Worker;
import enumeracoes_composicoes.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter departament's name: ");
        String departament = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.printf("Name: ");
        String name = sc.nextLine();

        System.out.printf("Level: ");
        String level = sc.nextLine();

        System.out.printf("Base salary: ");
        Double base_salary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), base_salary, new Department(departament));

        System.out.printf("How many contracts to this worker? ");
        Integer ncontracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < ncontracts; i++){
            System.out.printf("Enter contract #%d data: %n", i);

            System.out.printf("Data: ");
            Date contract_date = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

            System.out.printf("Value per hour: ");
            double value_per_hour = sc.nextDouble();
            sc.nextLine();

            System.out.printf("Duration: ");
            int duration = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(contract_date, value_per_hour, duration);
            worker.addContract(contract);
        }

        System.out.println("----------------------------------");

        System.out.printf("Enter month and year to calculate income (MM/YYYY): ");
        String date_input = sc.nextLine();
        int date_month = Integer.parseInt(date_input.substring(0, 2));
        int date_year = Integer.parseInt(date_input.substring(3));

        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f%n", date_input, worker.income(date_year,date_month));

        sc.close();
    }
}
