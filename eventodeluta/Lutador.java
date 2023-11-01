package eventodeluta;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private double peso;
    private String categoria;
    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;

    public Lutador(String name, int idade, float altura, double peso, String nacionalidade) {
        this.nome = name;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        setPeso(peso);
    }

    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacio());
        System.out.println("idade: " + getIdade());
        System.out.println("Altura: " + getAltura() + " m");
        System.out.println("Peso: " + getPeso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(peso);
    }

    public double getPeso() {
        return this.peso;
    }

    public void setCategoria(double peso) {
        if (peso < 52.2) {
            this.categoria = "Mosca";
        } else if (peso < 70.3) {
            this.categoria = "Galo";
        } else if (peso < 83.9) {
            this.categoria = "Pena";
        } else if (peso < 120.2) {
            this.categoria = "Medio";
        } else {
            this.categoria = "Pesado";
        }
    }

    public void ganharLuta() {
        this.setVitoria();
    }

    public void empatarLuta() {
        this.setEmpate();
    }

    public void perderLuta() {
        this.setDerrotas();
    }

    public String getCategoria() {
        return this.categoria;
    }

    public float getAltura() {
        return this.altura / 100;
    }

    public String getNacio() {
        return this.nacionalidade;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitoria() {
        this.vitorias = this.getVitorias() + 1;

    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas() {
        this.derrotas = this.getDerrotas() + 1;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpate() {
        this.empates = this.getEmpates() + 1;

    }
}
