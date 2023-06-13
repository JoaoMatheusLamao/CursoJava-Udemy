package Repeticoes;

import java.util.Scanner;

public class EstruturasRepetitivas {
    public static void main(String[] args) {
        conversorMedida();

    }


    public static void enquanto(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;

        while (a != 0){
            b += a;
            a = sc.nextInt();
        }
        System.out.println(b);
    }

    public static void para(){
        for (int x = 0; x <= 10; x+=2){
            System.out.println(x);
        }
    }

    public static void conversorMedida(){
        Scanner sc = new Scanner(System.in);
        char op;
        do {
            System.out.print("Entre com a temperatura em Celsius: ");
            double temp = sc.nextDouble();

            double f = ((9*temp)/5)+32;
            System.out.printf("%.1f C é igual a %.2f F\n\n", temp, f);

            System.out.print("Deseja calcular uma nova temperatura? (S/N): ");
            op = sc.next().charAt(0);

        } while (op == 's' || op == 'S');
        sc.close();
    }
}