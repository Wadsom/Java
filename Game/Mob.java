package Game;

public class Mob {
    private double vida;
    private double atk;

    public Mob(double vida) {
        this.vida = vida;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtk() {
        return this.atk;
    }

    public void setAtk() {
        this.atk = Math.floor(Math.random() * 10.0);
    }

}
