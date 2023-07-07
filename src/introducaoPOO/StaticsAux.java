package introducaoPOO;

public class StaticsAux {
    public static final double PI = 3.14159;
    public static final double TX_IOF = 0.06;

    public static double area(double radius){
        return PI * radius * radius;
    }

    public static double circunference(double radius){
        return 2 * PI * radius;
    }

    public static double dollar_to_real(double value_dollar, double qtd_dollar){
        return value_dollar*qtd_dollar*(1 + TX_IOF);
    }
}
