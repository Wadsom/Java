package eventodeluta;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    public int rounds = 0;
    private boolean aprovada = false;
    public boolean lutando;

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void marcaLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria()) || l2.getCategoria().equals(l1.getCategoria())) && l1 != l2) {
            this.desafiante = l1;
            this.desafiado = l2;
            this.aprovada = true;
            lutar(desafiante, desafiado);

        } else if (l1 == l2) {
            System.out.println("Lutadores iguais não podem lutar!");
            return;
        } else {

            System.out.println("Lutadores de categorias diferentes não podem lutar!!");
        }
    }

    public void lutar(Lutador desafiante, Lutador desafiado) {
        this.lutando = true;
        System.out.println("-----------------Apresentando Lutadores-----------------");
        System.out.println("     O Desafiante     ");
        System.out.println("______________________");
        this.desafiante.status();
        System.out.println("______________________");
        System.out.println("     O Desafiado      ");
        System.out.println("______________________");
        this.desafiado.status();
        System.out.println("______________________");
        while (rounds < 3) {
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("*****Empatou******");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;

                case 1:
                    System.out.println("******Desafiante ganhou!!******");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("******Desafiado Ganhou**********");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            }
            rounds++;
        }
    }

}