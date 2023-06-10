package Dados;


import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
//        EntradaDados.entradaSimples();
//        EntradaDados.exFx1();
//        entradaQuebraLinha();
    }

    public static void entradaSimples() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Strings");
        String xstr = sc.next();
        System.out.printf("Você digitou: %s \n", xstr);

        System.out.println("\nNúmeros inteiros");
        int xint = sc.nextInt();
        System.out.printf("Você digitou: %d \n", xint);

        System.out.println("\nNúmeros .flutuantes");
        double xdouble = sc.nextDouble();
        System.out.printf("Você digitou: %.2f\n", xdouble);

        System.out.println("Primeiro caracter da String");
        char xchar = sc.next().charAt(0);
        System.out.println("Você digitou: " + xchar);
        sc.close();
    }
    public static void entradaQuebraLinha(){
        Scanner sc = new Scanner(System.in);

        String a, b, c;
        int d;
        d = sc.nextInt();
        sc.nextLine();
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();
        System.out.printf("esse cara: %s\n",a);
        System.out.printf("... %s...\n",b);
        System.out.printf("essa pessoinha: %s!!!\n",c);
        sc.close();
    }
    public static void exFx1(){
        Scanner sc = new Scanner(System.in);

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is %.2f\n", product1, price1);
        System.out.printf("%s, which price is %.2f\n", product2, price2);

        System.out.printf("\nRecord: %s years old, code %d and gender: $c\n\n", age, code, gender);

        System.out.printf("Measue with eight decimal places: %f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);

        sc.close();
    }

}
