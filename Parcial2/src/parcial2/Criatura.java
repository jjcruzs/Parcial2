package parcial2;
public abstract class Criatura {
    
    String nombre;
    int salud;
    int fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }
    
    public abstract void atacar (Criatura objetivo);
    
    public abstract void defender (int daño);
    
    public boolean estaViva (){
        return salud > 0;
    }
    
    
}
