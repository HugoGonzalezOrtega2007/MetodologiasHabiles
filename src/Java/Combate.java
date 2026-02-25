package Java;
import java.util.Random;
import java.util.Scanner;

public class Combate {
    private String nombre;
    private int energia;
    private int vidaMaxima;
    private int ataque;

    public Combate() {
    }

    public Combate(String nombre) {
        this.nombre = nombre;
        this.energia = 80;
        this.vidaMaxima = 100;
        this.ataque = 15;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void esquivar(){
        int esquivo = (int) (Math.random() * 10);
        if (esquivo == 3) {
            System.out.println("El personaje ha esquivado el ataque");
        } else {
            System.out.println("El personaje ha recibido el ataque");
        }
    }

    public void ataqueEnergiaBaja(){
        if (energia<20){
            vidaMaxima-=ataque+15;
        }
    }

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

