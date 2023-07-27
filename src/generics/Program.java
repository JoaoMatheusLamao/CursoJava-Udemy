package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<? super Number> lista = new ArrayList<>();
        lista.add(0);
        lista.add(3.14);

    }

    public static void ex1(){

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        int vezes = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < vezes; i++){
            ps.addValue(sc.nextInt());
        }

        ps.print();

        sc.close();

    }

}
