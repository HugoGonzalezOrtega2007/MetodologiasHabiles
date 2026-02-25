package Java;

import java.util.Scanner;

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

    public void turnoguerrero(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Que acción deseas realizar: (1. Ataque normal | 2. Aumentar furia)");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("te he atacadi");
                vidaMaxima -= 10;
                break;
            case 2:
                break;
            case 3:

                break;
        }
    }
}
