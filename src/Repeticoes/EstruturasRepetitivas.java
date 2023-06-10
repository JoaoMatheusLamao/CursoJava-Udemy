package Repeticoes;

import java.util.Scanner;

public class EstruturasRepetitivas {
    public static void main(String[] args) {
        enquanto();

    }


    public static void enquanto(){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 0;

        while (a != 0){
            a = sc.nextInt();
            b += a;
        }
        System.out.println(b);
    }
}
