package generics;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
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
