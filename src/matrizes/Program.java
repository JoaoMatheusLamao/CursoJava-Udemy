package matrizes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ex2();
    }
    public static void exMatrix(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int [][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }


        sc.close();
    }

    public static void ex2(){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        int [][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int x = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == x){
                    System.out.println("Position: " + i + ", " + j);
                    if (i > 0){
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i < mat.length - 1){
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                    if (j > 0){
                        System.out.println("Esquerda (left): " + mat[i][j-1]);
                    }
                    if (j < mat[i].length - 1){
                        System.out.println("Direita (left): " + mat[i][j+1]);
                    }
                }
            }
        }

        sc.close();
    }
}
