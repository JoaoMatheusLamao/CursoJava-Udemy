package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        exEmployee();
    }
    public static void exListas(){
        List<String> listinha = new ArrayList<>();



        //region Adicionar elementos na lista
        listinha.add("João");
        listinha.add("Matheus");
        listinha.add("Aparecido");
        listinha.add("Lamão");
        //endregion

        for (String x:
             listinha) {
            System.out.println(x);
        }

        System.out.println("---------------------------------------");

        //region Adcionar elementos em uma determinada posição na lista
        listinha.add(0, "Eu sou o:");
        //endregion

        for (String x:
                listinha) {
            System.out.println(x);
        }
        System.out.println("---------------------------------------");

        //region Removendo itens
        listinha.remove(0);
        //endregion

        for (String x:
                listinha) {
            System.out.println(x);
        }
        System.out.println("---------------------------------------");

        //region Removendo itens a partir de um predicado (lambda)
        listinha.removeIf(x -> x.charAt(0) == 'J');
        //endregion

        for (String x:
                listinha) {
            System.out.println(x);
        }
        System.out.println("---------------------------------------");

        //region Buscando o index de um elemento
        System.out.println("Index of João: " + listinha.indexOf("João"));
        System.out.println("Index of Matheus: " + listinha.indexOf("Matheus"));
        //endregion

        //region Filtrando lista a partir de um predicado (lambda)
        List<String> listinha_filtrada = listinha.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        //endregion

        for (String x:
                listinha_filtrada) {
            System.out.println(x);
        }
        System.out.println("---------------------------------------");

        //region Buscando o primeiro elemento a partir de um predicado
        String name = listinha.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        //endregion

        System.out.println(name);
        System.out.println("---------------------------------------");
    }

    public static void exEmployee(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão cadastrados? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.print("ID: ");
            int id = sc.nextInt();

            while (fecthId(employees, id)){
                System.out.println("Id já existente! \nTente novamente: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        for (Employee a: employees) {
            System.out.println(a);
        }

        System.out.println("---------------------------------------");

        System.out.print("Entre com o id do usuário: ");
        int id = sc.nextInt();
        sc.nextLine();

        Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee != null){
            System.out.print("Entre com o percentual de aumento (%): ");
            double percent = sc.nextDouble();
            percent = percent/100;
            employee.upSalary(percent);
        }

        for (Employee a: employees) {
            System.out.println(a);
        }

        sc.close();
    }

    public static boolean fecthId(List<Employee> lista, int id){
        boolean result = false;
        if (lista != null) {
            for (Employee x:
                 lista) {
                if (x.getId() == id) {
                    result =  true;
                }
            }
        }
        return result;
    }
}
