package IntroducaoPOO;

import java.util.Locale;
import java.util.Scanner;

public class FunctionsStatics {
    public static void main(String[] args) {
//        exFx1();
        exFx2();
    }

    public static void exFx1(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o raio: ");
        double radius = sc.nextDouble();
        double area = StaticsAux.area(radius);
        double circunference = StaticsAux.circunference(radius);

        System.out.printf("Circunferência: %.2f%n", circunference);
        System.out.printf("Área: %.2f%n", area);
        sc.close();
    }


    public static void exFx2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do dolar: ");
        double value_dollar = sc.nextDouble();
        System.out.print("Entre com o valor  de dolares a serem comprados: ");
        double qtd_dollar = sc.nextDouble();

        double value_real = StaticsAux.dollar_to_real(value_dollar, qtd_dollar);

        System.out.printf("US$ %.2f = R$ %.2f\n", qtd_dollar, value_real);
        sc.close();
    }
}
