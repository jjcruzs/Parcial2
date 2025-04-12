package parcial2;
public class Mago extends Criatura implements Magico{
    private String hechizo;

    public Mago(String hechizo, String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.hechizo = hechizo;
    }
    
    @Override
    public void atacar (Criatura objetivo){
        objetivo.defender(fuerza);
        }
    @Override
    public void defender (int daño){
        salud -= daño;
    }
    
    @Override
    public void aprenderHechizo (String hechizo){
        this.hechizo = hechizo;
    }
    @Override
    public void lanzarHechizo(){
        System.out.println(nombre + "lanzar hechizo: " + hechizo);
    }
}
