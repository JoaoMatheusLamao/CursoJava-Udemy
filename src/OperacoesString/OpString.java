package OperacoesString;

public class OpString {
    public static void main(String[] args) {
        String a = "Abacate no lava a jato  ";

        System.out.println("|" + a + "|");
        System.out.println("|" + a.toLowerCase()+"|");
        System.out.println("|" + a.toUpperCase()+"|");
        System.out.println("|" + a.trim()+"|");
        System.out.println("|" + a.substring(4)+"|");
        System.out.println("|" + a.substring(4, a.trim().length() - 1)+"|");

        a = a.trim();
        String[] b = a.split(" ");
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
