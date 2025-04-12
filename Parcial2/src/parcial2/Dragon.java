package parcial2;
public class Dragon extends Criatura implements Volador{
   private String escamas;
    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        objetivo.defender(fuerza * 2);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " aterrizó.");
    }
}