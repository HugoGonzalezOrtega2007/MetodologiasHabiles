package Java;
import java.util.Random;

public class Combate {
    private int vidaMaxima = 100;
    private int ataque = 15;

    public void esquivar(){
        int esquivo = (int) (Math.random() * 10);
        if (esquivo == 3) {
            System.out.println("El personaje ha esquivado el ataque");
        } else {
            System.out.println("El personaje ha recibido el ataque");
        }
    }

}

