package eventodeluta;

public class Arte extends Lutador {

    public Arte(String name, int idade, float altura, double peso, String nacionalidade) {
        super(name, idade, altura, peso, nacionalidade);

        // TODO Auto-generated constructor stub
    }

    public int ganharLuta(int a, int b) {
        return a - b;
    }

    // public double ganharLuta(double a, double b) {
    // return 0.5;
    // }
}
