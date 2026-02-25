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

    public void turnoMago(Guerrero guerrero) {
        Scanner sc = new Scanner(System.in);
        int esquivo = (int) (Math.random() * 10);

        System.out.println("Que acción deseas realizar: (1. Ataque normal | 2. Ataque magico");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                if (esquivo == 3) {
                    System.out.println("El guerrero ha esquivado el ataque");
                } else {
                    System.out.println("El mago ha conectado un ataque al guerrero");
                    guerrero.setVidaMaxima(guerrero.getVidaMaxima()-getAtaque());
                }
                break;

            case 2:
                if (esquivo == 3) {
                    System.out.println("El guerrero ha esquivado el ataque");
                } else {
                    System.out.println("El mago ha realizado un ataque magico");
                    guerrero.setVidaMaxima(getVidaMaxima()-ataqueMagicoMago);
                    setEnergia(getEnergia()-10);
                }
                break;

        }
        System.out.println("Estadisticas del mago -- Vida: " + getVidaMaxima() + " | Energia: " + getEnergia());
    }
}
