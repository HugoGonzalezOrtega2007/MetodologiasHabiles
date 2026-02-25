package Java;

import java.util.Scanner;

public class Mago extends Combate {
    private int ataqueMagicoMago = 20;

    public Mago(String nombre) {
        super(nombre);
    }

    public int getAtaqueMagicoMago() {
        return ataqueMagicoMago;
    }
    public void setAtaqueMagicoMago(int ataqueMagicoMago) {
        this.ataqueMagicoMago = ataqueMagicoMago;
    }

    public void turnoMago(Guerrero guerre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que acción deseas realizar: (1. Ataque normal | 2. Ataque magico | 3. Esquivar");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("El mago ha conectado un ataque al guerrero");
                guerre.setVidaMaxima(getVidaMaxima()-10);
                break;
            case 2:
                break;
            case 3:
                int esquivo = (int) (Math.random() * 5);
                if (esquivo == 3) {
                    System.out.println("El personaje ha esquivado el ataque");
                } else {
                    System.out.println("El personaje ha recibido el ataque");
                }
                break;
        }
    }

}
