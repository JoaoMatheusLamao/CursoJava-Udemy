package IntroducaoPOO;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        exTriangulo();
//        exProdutos();
    }

    public static void exTriangulo(){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        //region Triangle 1
        System.out.print("Valor para A: ");
        double a = sc.nextDouble();
        x.setA(a);

        System.out.print("Valor para B: ");
        double b = sc.nextDouble();
        x.setB(b);

        System.out.print("Valor para B: ");
        double c = sc.nextDouble();
        x.setC(c);

        System.out.println("---------------------------");
        //endregion

        //region Triangle 2
        System.out.print("Valor para A: ");
        a = sc.nextDouble();
        y.setA(a);

        System.out.print("Valor para B: ");
        b = sc.nextDouble();
        y.setB(b);

        System.out.print("Valor para B: ");
        c = sc.nextDouble();
        y.setC(c);
        System.out.println("---------------------------");
        //endregion

        System.out.println("Área X: " + x.getArea());
        System.out.println("Área Y: " + y.getArea());

        if (x.getArea()> y.getArea()) {
            System.out.println("Maior área é do primeiro tirângulo!");
        } else{
            System.out.println("Maior área é do segundo tirângulo!");
        }

        sc.close();
    }

    public static void exProdutos(){
        Product pdct = new Product();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        pdct.setName(sc.nextLine());

        System.out.print("Price: ");
        pdct.setPrice(sc.nextDouble());

        System.out.print("Quantity: ");
        pdct.setQuantity(sc.nextInt());
        System.out.println("--------------------------------------");

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
