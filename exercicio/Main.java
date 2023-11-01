package exercicio;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {

    // public static void exMetodo(String... names) {
    // for (String num : names) {
    // System.out.println(num);
    // }
    // }

    // public static void main(String[] args) {
    // // String[] nomes = new String[3];
    // // nomes[0] = "bob";
    // // nomes[1] = "Marley";
    // // nomes[2] = "Wiill";
    // // for (int i = 0; i == nomes.length; i++) {
    // // System.out.println("Nome: " + nomes[i]);
    // // }
    // exMetodo("bob", "Melissa", "Roier");
    // }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = src.next();
        // System.out.println("Idade: ");
        // int idade = src.nextInt();
        // System.out.println("Id: ");
        // int id = src.nextInt();
        // Pessoa p1 = new Pessoa(nome, idade, id);
        Pessoa p2 = new Pessoa("Wadson", 21, 3);
        p2.getEtnias();

        System.out.println("Valor: ");
        double valor = src.nextDouble();
        System.out.println("Selecione a forma de Pagamento");
        System.out.println("0 - Credito         Débito - 1");
        int tipo = src.nextInt();
        switch (tipo) {
            case 0:

                System.out.println(TIpoPagamento.CREDITO.Desconto(valor));
                break;
            case 1:
                System.out.println(TIpoPagamento.DEBITO.Desconto(valor));
                break;
            default:
                System.out.println("Escolha entre 0 para Credito e 1 para Débito");
                break;
        }
        src.close();

    }

}
