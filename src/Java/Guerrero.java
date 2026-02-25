package Java;

public class Guerrero extends Combate {
    private int escudo;
    private int furia;

    public Guerrero(String nombre) {
        super(nombre);
        this.escudo = 50;
        this.furia = 0;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getFuria() {
        return furia;
    }

    public void setFuria(int furia) {
        this.furia = furia;
    }
}
