package matematica;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        double raiz = raizQuadrada(64);
        System.out.println(raiz);

        double potencia = potencia(5, 2);
        System.out.println(potencia);

        String bhaskara = bhaskara(1, -1, -6);
        System.out.println(bhaskara);
    }

    public static double raizQuadrada(double x){
        return Math.sqrt(x);
    }

    public static double potencia(double base, double expoente){
        return Math.pow(base, expoente);
    }

    public static String bhaskara(double a, double b, double c){
        double delta = (Math.pow(b, 2)) -4 * a * c;
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);

        String result = "X1 = " + x1 + ";\nX2 = " +x2;
        return result;
    }
}
