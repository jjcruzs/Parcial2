package parcial2;
public class Guerrero extends Criatura{
   
    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        objetivo.defender(fuerza);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }

    void equiparArma(Arma espada) {
        
    }

    
}

    

