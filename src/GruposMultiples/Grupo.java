package GruposMultiples;

public class Grupo {
    private final String nombre;
    private int cuenta;

    Grupo(String nombre){
        this.nombre=nombre;
        this.cuenta=0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void anadirALaCuenta(int numeroAAnyadir){
        cuenta+=numeroAAnyadir;
    }

    @Override
    public String toString() {
        return nombre+":"+cuenta;
    }
}
