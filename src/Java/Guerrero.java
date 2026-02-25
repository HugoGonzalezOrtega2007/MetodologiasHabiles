package Java;

import java.util.Random;
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

    public void turnoguerrero(Mago enemigo){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Que acción deseas realizar: (1. Ataque  | 2. Aumentar furia)");
        int eleccion = sc.nextInt();
        double danio=0;

        switch (eleccion) {
            case 1:
                int numeroaleatorio= random.nextInt(5)+1;
                if (numeroaleatorio<=3){
                    danio= getAtaque();
                    enemigo.recibirdanio(danio);
                    System.out.println("Has hecho " + danio + " de daño.");
                } else if (numeroaleatorio==4) {
                    danio=getAtaque()*1.5;
                    enemigo.recibirdanio(danio);
                    System.out.println("Golpe crítico! Has hecho " + danio + " de daño.");
                } else {
                    System.out.println("Has fallado el ataque.");
                }
                break;
            case 2:
                furia += 10;
                System.out.println("Tu furia ahora es: " + furia);
                break;

        }

    }
    public boolean estaVivo() {
        return getVidaMaxima() > 0;
    }
}
