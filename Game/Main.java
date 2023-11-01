package Game;

import java.util.Scanner;

public class Main {

    public static void leitura(double[] n) {
        double soma = 0;
        for (int i = 0; i < n.length; i++) {
            soma += n[i];

        }
        System.out.println("Total: " + soma);
    }

    public static void main(String[] args) {
        Scanner valida = new Scanner(System.in);
        double[] n = new double[4];
        double tamanho = n.length;

        for (int i = 0; i < tamanho; i++) {
            System.out.println("insira o número");
            n[i] = valida.nextDouble();
        }
        leitura(n);
        valida.close();
    }
}
