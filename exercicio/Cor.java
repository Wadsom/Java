package exercicio;

public enum Cor {
    Moreno(0, "Moreno", 10),
    Branco(1, "Branco", 0),
    Negro(2, "Negro", 10),
    HPardo(3, "Pardo1", 8);

    private String nome;
    private int id;
    private int nota;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    Cor(int id, String nome, int nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
