package sobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        exProdutos();
        exAcount();
    }

    public static void exAcount(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String name_titular = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        int num_acount = sc.nextInt();

        System.out.print("Deseja realizar um depósito inicial? (S/N) ");
        char op = sc.next().charAt(0);

        Acount conta;
        if (op == 's'){
            System.out.print("Digite o valor do saldo: ");
            double saldo = sc.nextDouble();
            conta = new Acount(num_acount,name_titular,saldo);
        } else{
            conta = new Acount(num_acount,name_titular);
        }
        System.out.print("\n---------------------------------------------------\n");
        System.out.print(conta + "\n");
        System.out.print("\n---------------------------------------------------\n");

        System.out.print("Saque:\n");

        System.out.print("Digite o valor do saque: ");
        double value = sc.nextDouble();
        conta.saque(value);

        System.out.print("\n---------------------------------------------------\n");
        System.out.print(conta + "\n");
        System.out.print("\n---------------------------------------------------\n");

        System.out.print("Digite o valor do depósito: ");
        value = sc.nextDouble();
        conta.deposito(value);

        System.out.print("\n---------------------------------------------------\n");
        System.out.print(conta + "\n");
        System.out.print("\n---------------------------------------------------\n");


        sc.close();
    }

    public static void exProdutos(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = (sc.nextLine());

        System.out.print("Price: ");
        double price = (sc.nextDouble());

        System.out.print("Quantity: ");
        int quantity = (sc.nextInt());
        System.out.println("--------------------------------------");

        Product_update pdct = new Product_update(name,quantity,price);

        System.out.printf("Product Data: %s\n", pdct);
        System.out.println("--------------------------------------");

        System.out.print("Enter the number of products to be added in stock: ");
        pdct.entrada(sc.nextInt());
        System.out.printf("Upadate Data: %s\n", pdct);
        System.out.println("--------------------------------------");

        System.out.print("Enter the number of products to be removed in stock: ");
        pdct.retirada(sc.nextInt());
        System.out.printf("Upadate Data: %s\n", pdct);
        System.out.println("--------------------------------------");
        sc.close();
    }
}
