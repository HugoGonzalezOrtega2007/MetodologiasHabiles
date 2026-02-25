package Java;

import java.util.Scanner;

public class Mago extends Combate {
    private int ataqueMagicoMago = 20;

    public void turnoMago() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que acción deseas realizar: (1. Ataque normal | 2. Ataque magico | 3. Esquivar");
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
