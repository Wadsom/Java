package exercicio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        idCor(id);
    }

    // private void getId(int id) {
    // id == id;
    // }
    Cor c = null;

    public void idCor(int id) {
        for (Cor c : Cor.values()) {
            if (c.getId() == id) {
                System.out.println(c);
            }
        }
    }

    public void getEtnias() {
        for (Cor CH : Cor.values()) {
            System.out.println(CH);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
};