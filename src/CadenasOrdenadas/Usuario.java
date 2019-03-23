package CadenasOrdenadas;
/*-Implementa el orden natural de la clase Usuario (nombre, nombre real y contraseña). El orden
natural debe basarse en el orden alfabético del nombre de usuario. Utiliza el método compareTo
de la clase String para comparar los nombres de los usuarios.
- Declara y construye un conjunto ordenado de usuarios.
- Construye varios usuarios y añádelos al conjunto. Observa que si introducimos varios usuarios
con el mismo nombre sólo el primero que se inserte permanece en el conjunto. Un conjunto
ordenado determina que un elemento es repetido si en la comparación obtiene el valor 0. Por
tanto, es recomendable que la implementación del orden natural sea consistente con la igualdad
(equals).
- Recorre el conjunto y muestra los usuarios. Observa que el iterador retorna los elementos según
el orden natural.
- Implementa un comparador de usuarios (interfaz java.util.Comparator) que ordene los usuarios
según el orden alfabético de sus nombres reales.
- Declara y construye un conjunto ordenado de usuarios que aplique el orden implementado por el
comparador anterior. Añade usuarios a la colección (método addAll) y realiza un recorrido para
comprobar que el orden es el correcto.
- Utiliza los métodos sort de la clase Collections para ordenar la lista, según el orden natural y con
el comparador de orden inverso. Muestra el contenido de la lista tras ambas ordenaciones.
*/
public class Usuario implements Comparable<Usuario>{
    private final String nombre;
    private final String nombreReal;
    private final String contraseña;

    Usuario(String nombre,String nombreReal,String contraseña){
        this.nombre=nombre;
        this.nombreReal=nombreReal;
        this.contraseña=contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String toString(){
        return"";
    }


    @Override
    public int compareTo(Usuario o) {
        return this.nombre.compareTo(o.nombre);
    }
}
