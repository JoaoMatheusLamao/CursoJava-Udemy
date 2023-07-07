package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Aiaia");
        }
        sc.close();
    }
}
