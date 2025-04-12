package parcial2;

public class Mago extends Criatura implements Magico {

    private String hechizo;

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.hechizo = null;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        if (getArma() != null) {
            daño += getArma().getDañoAdicional();
        }

        if (hechizo != null) {
            System.out.println(getNombre() + " lanza el hechizo '" + hechizo + "' causando " + daño + " de daño a " + objetivo.getNombre());
        } else {
            System.out.println(getNombre() + " lanza un ataque mágico básico causando " + daño + " de daño a " + objetivo.getNombre());
        }

        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        reducirSalud(daño);
        System.out.println(getNombre() + " recibe " + daño + " de daño. Salud restante: " + getSalud());
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        this.hechizo = hechizo;
        System.out.println(getNombre() + " ha aprendido el hechizo: " + hechizo);
    }

    public void lanzarHechizo() {
        System.out.println(getNombre() + " lanza el hechizo: " + hechizo);
    }

    @Override
    public void lanzarHechizo(Criatura objetivo) {

    }

    void equiparArma(Arma baston) {
       

    private Object getArma() {
        
    }
}
