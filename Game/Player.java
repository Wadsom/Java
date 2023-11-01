package Game;

import java.util.Scanner;

public class Player extends BasePlay {
    public Player(String nome, int idade, double[] status) {
        super(nome, idade);
        setForca(status[0]);
        setAgilidade(status[1]);
        setVida(status[2]);
        setInteligencia(status[3]);
    }

    public static void main(String[] args) {
        TC getClass;

        Scanner linkStart = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = linkStart.next();

        System.out.println("idade: ");
        int idade = linkStart.nextInt();

        System.out.println(" 0 || 1 || 2");
        int id = linkStart.nextInt();
        double[] status = TC.values()[id].getAtributos();
        Player p1 = new Player(nome, idade, status);

        switch (id) {
            case 0:
                System.out.println("Guerreiro");
                System.out.println(p1.toString());
                break;
            case 1:
                System.out.println("Mago");
                System.out.println(p1.toString());
                break;
            case 2:
                System.out.println("Ladino");
                System.out.println(p1.toString());
                break;
            default:
                System.out.println("Orgia de Traveco R$ 5,00");
                break;
        }

    }
}
