package Arrays;

import java.util.Scanner;

public class ExFixacao {

    public static void main(String[] args) {
        pensionato();
    }

    public static void negativos(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }

    public static void soma_vetor(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        System.out.print("Valores: ");

        for (int i = 0; i < vect.length; i++){
            System.out.print(vect[i] + " ");
            sum += vect[i];
        }

        System.out.printf("\nSoma: %.2f", sum);
        System.out.printf("\nMédia: %.2f", sum/ vect.length);

        sc.close();
    }

    public static void alturas(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        Person[] vect_persons = new Person[n];

        for (int i = 0; i < vect_persons.length; i++){

            vect_persons[i] = new Person();

            sc.nextLine();
            System.out.print("Nome: ");
            vect_persons[i].setName(sc.nextLine());

            System.out.print("Idade: ");
            vect_persons[i].setAge(sc.nextInt());

            System.out.print("Altura: ");
            vect_persons[i].setHeigth(sc.nextDouble());
        }

        double sum = 0;
        int num_person_more_sixteen = 0;

        for (int i = 0; i < vect_persons.length; i++){
            sum += vect_persons[i].getHeigth();
            if (vect_persons[i].getAge() < 16){
                num_person_more_sixteen += 1;
            }
        }

        System.out.printf("Altura média: %.2f\n", sum / vect_persons.length);

        double percentual = (((double)num_person_more_sixteen)/vect_persons.length)*100;
        System.out.printf("Pessoas com menos de 16 anos: %.2f\n", percentual);

        for (int i = 0; i < vect_persons.length; i++){
            if (vect_persons[i].getAge() < 16){
                System.out.println(vect_persons[i].getName());
            }
        }

        sc.close();
    }

    public static void pensionato(){

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n_rooms = sc.nextInt();

        Student[] v_student = new Student[10];

        for (int i = 1; i <= n_rooms; i++){
            sc.nextLine();
            System.out.println("Rent: #" + i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room_selected = sc.nextInt();

            v_student[room_selected] = new Student(name, email);
        }

        System.out.println("Busy rooms: ");

        for (int i = 0; i < v_student.length; i++){
            if (v_student[i] != null){
                System.out.println(i + ": " + v_student[i]);
            }
        }

        sc.close();

    }
}
