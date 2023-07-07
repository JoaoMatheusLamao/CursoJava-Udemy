package files.application;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        pastas();
    }

    public static void pastas(){
        Scanner sc = new Scanner(System.in);
        System.out.print("OPa: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
         //region pastas
        File[] folders = path.listFiles(File::isDirectory);

        for (File folder:
             folders) {
            System.out.println(folder);
        }

        String path2 = "C:\\Users\\joaom\\Desktop";
        boolean success = new File(path2 + "\\pastinhadojava").mkdir();

        System.out.println(success);
        //endregion

        //region arquivos
        File[] files = path.listFiles(File::isFile);

        for (File file:
                files) {
            System.out.println(file);
        }
        //endregion


        sc.close();
    }

    public static void exemplo4(){
        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noiteeeeee"};

        String path = "C:\\Users\\joaom\\Desktop\\ola.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void exemplo3(){
        String path = "C:\\Users\\joaom\\Desktop\\ola.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }





    public static void exemplo2(){
        String path = "C:\\Users\\joaom\\Desktop\\ola.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            try {
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void exemplo1(){
        File file = new File("C:\\Users\\joaom\\Desktop\\ola.txt");

        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
