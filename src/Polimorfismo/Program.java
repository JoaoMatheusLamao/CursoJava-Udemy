package Polimorfismo;

import Polimorfismo.entities.Employee;
import Polimorfismo.entities.EmployeeOutsourced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre the number of employees: ");
        int num_employee = sc.nextInt();
        sc.nextLine();
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 1; i <= num_employee; i++){
            System.out.printf("Employee #%d data:\n", i);
            System.out.print("Outsourced (y/n)? ");
            char op = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if (op == 'y'){
                System.out.print("Addtional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();

                employeeList.add(new EmployeeOutsourced(name, hours, valuePerHour, additionalCharge));
            }
            else {
                employeeList.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee emp: employeeList) {
            System.out.printf("%s - %.2f;\n", emp.getName(), emp.payment());
        }

        sc.close();
    }
}
