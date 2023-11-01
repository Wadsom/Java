package Game;

public abstract class BasePlay {
    private String nome;
    private int idade;
    private double forca = 0;
    private double agilidade = 0;
    private double vida = 0;
    private double inteligencia = 0;
    private double hp;

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(double agilidade) {
        this.agilidade = agilidade;
    }

    public double getHp() {
        return hp;
    }

    public void setHp() {
        this.hp = (getVida() * 10);
    }

    public double getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return "BasePlay [nome=" + nome + ", idade=" + idade + ", forca=" + forca + ", agilidade=" + agilidade
                + ", vida=" + vida + ", inteligencia=" + inteligencia + "]";
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double defesa) {
        this.inteligencia = defesa;
    }

    public BasePlay(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
