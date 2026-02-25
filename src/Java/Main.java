package Java;

public class Main {
    static void main(String[] args) {
        Mago mago = new Mago("Dolfor");
        Guerrero guerrero =new Guerrero("Kalse");

        while (guerrero.estaVivo() && mago.estaVivo()) {

            guerrero.turnoguerrero(mago);

            if (!mago.estaVivo()) break;

            mago.turnoMago(guerrero);

            System.out.println("Vida Guerrero: " + guerrero.getVidaMaxima());
            System.out.println("Vida Mago: " + mago.getVidaMaxima());
            System.out.println("------------------------");
        }

        if (guerrero.estaVivo()) {
            System.out.println("Gana el Guerrero");
        } else {
            System.out.println("Gana el Mago");
        }





    }
}
