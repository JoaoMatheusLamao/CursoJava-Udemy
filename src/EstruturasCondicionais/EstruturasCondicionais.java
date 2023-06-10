package EstruturasCondicionais;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
//        quantasHoras();
//        System.out.println(meses());
        expTernaria();
    }

    public static void quantasHoras(){
        Scanner sc = new Scanner(System.in);
        for (int x = 1; x <= 4; x++){
            System.out.println("Que horas são? ");
            int hrs = sc.nextInt();

            if (hrs >= 0 && hrs < 5){
                System.out.println("Boa madrugada");
            } else if (hrs >= 5 && hrs < 12) {
                System.out.println("Bom dia");
            } else if (hrs > 12 && hrs < 18) {
                System.out.println("Boa tarde");
            } else {
                System.out.println("Boa noite");
            }
        }
        sc.close();
    }

    public static String meses(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número equivalente ao mês: ");
        int mesNum = sc.nextInt();
        sc.close();
        String mesExtenso;

        switch (mesNum){
        case 1:
            mesExtenso =  "Janeiro";
            break;
        case 2:
            mesExtenso =  "Fevereiro";
            break;
        case 3:
            mesExtenso =  "Março";
            break;
        case 4:
            mesExtenso =  "Abril";
            break;
        case 5:
            mesExtenso =  "Maio";
            break;
        case 6:
            mesExtenso =  "Junho";
            break;
        case 7:
            mesExtenso =  "Julho";
            break;
        case 8:
            mesExtenso =  "Agosto";
            break;
        case 9:
            mesExtenso =  "Setembro";
            break;
        case 10:
            mesExtenso =  "Outubro";
            break;
        case 11:
            mesExtenso =  "Novembro";
            break;
        case 12:
            mesExtenso =  "Dezembro";
            break;
        default:
            mesExtenso =  "Mês inválido";
            break;
        }
        return mesExtenso;
    }

    public static void expTernaria(){
        double preco = 20;
        double desconto = (preco > 15)? preco*0.2 : preco*0.5;
        System.out.println(preco+desconto);
    }
}
