package parcial2;

public class Principal {

    public static void simularBatalla(Criatura criatura1, Criatura criatura2) {
        System.out.println("\n Comienza la batalla entre " + criatura1.getNombre() + " y " + criatura2.getNombre());

        while (criatura1.estaViva() && criatura2.estaViva()) {
            criatura1.atacar(criatura2);
            if (criatura2.estaViva()) {
                criatura2.atacar(criatura1);
            }
        }

        System.out.println("\n Batalla terminada ");
        if (criatura1.estaViva()) {
            System.out.println(criatura1.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println(criatura2.getNombre() + " ha ganado la batalla.");
        }
    }

    public static void main(String[] args) {

        Dragon dragon = new Dragon("Dragon", 150, 30, "rojas");
        Guerrero guerrero = new Guerrero("Guerrero", 120, 25);
        Mago mago = new Mago("Mago", 100, 20);

        Arma garras = new Arma("Garras", 5);
        Arma espada = new Arma("Espada", 15);
        Arma baston = new Arma("Baston", 10);

        dragon.equiparArma(garras);
        guerrero.equiparArma(espada);
        mago.equiparArma(baston);

        mago.aprenderHechizo("Bola de fuego");

        dragon.volar();
        dragon.aterrizar();

        simularBatalla(dragon, mago);
        simularBatalla(guerrero, dragon);
    }
}
