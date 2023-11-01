package Game;

public enum TC {
    GUERREIRO(0, 4, 2, 3, 1),
    MAGO(1, 1, 2, 2, 4),
    LADINO(2, 3, 5, 1, 1);

    private int id;
    private double forca;
    private double agilidade;
    private double vida;
    private double hp;

    private double inteligencia;

    TC(int id, double forca, double agilidade, double vida, double inteligencia) {
        this.id = id;
        this.forca = forca;
        this.agilidade = agilidade;
        this.vida = vida;
        this.inteligencia = inteligencia;
    }

    public double[] getAtributos() {
        return new double[] { forca, agilidade, vida, inteligencia };
    }

}
