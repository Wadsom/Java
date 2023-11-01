package eventodeluta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valida = new Scanner(System.in);
        Lutador l[] = new Lutador[2];
        Luta UFC = new Luta();

        System.out.println("Bem-Vindo ao Evento de Lutas:");
        for (int i = 0; i <= l.length; i++) {
            // System.out.println("Diga seu nome:");
            // String nome = valida.next();
            // System.out.println("Diga sua nacionalidade: ");
            // String nacionalidade = valida.next();
            // System.out.println("Idade:");
            // int idade = valida.nextInt();
            // System.out.println("Altura em cm:");
            // float altura = valida.nextFloat();
            // System.out.println("Peso:");
            // double peso = valida.nextDouble();
            // l[i] = new Lutador(nome, idade, altura, peso, nacionalidade);
            // l[i] = new Lutador(nome, idade, altura, peso, nacionalidade);
            l[0] = new Lutador("Pedro", 21, 178, 89, "Brasil");
            l[1] = new Lutador("Walter", 21, 189, 90, "EUA");
            if (i == 1) {
                UFC.marcaLuta(l[1], l[1]);
                System.out.println(" ");
                System.out.println("Status do lutador " + 0);
                l[0].status();
                System.out.println("_____________________");
                System.out.println("Status do lutador " + 1);
                l[1].status();

            }

            if (!UFC.lutando) {
                System.out.println("____________________________");
                System.out.println("Novo Lutador:");
            }
        }

        valida.close();
    }

}
