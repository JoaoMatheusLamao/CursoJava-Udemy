package Arrays;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ex2();
    }

    public static void ex1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de alturas: ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++){
            sum += vect[i];
        }

        double average = sum/ vect.length;

        System.out.println("Average: " + average);
        sc.close();
    }

    public static void ex2(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }

        double average = sum / vect.length;

        System.out.println(average);

        sc.close();
    }
}
