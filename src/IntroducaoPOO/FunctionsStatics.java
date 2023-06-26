package IntroducaoPOO;

import java.util.Locale;
import java.util.Scanner;

public class FunctionsStatics {
    public static void main(String[] args) {
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
}
