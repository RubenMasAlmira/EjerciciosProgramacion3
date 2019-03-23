package CadenasOrdenadas;

import java.util.Set;
import java.util.TreeSet;

/*Conjuntos ordenados:
- Declara y construye un conjunto ordenado (TreeSet) que almacene cadenas (String).
- Introduce varias cadenas en el conjunto.
- Realiza un recorrido (for each) del conjunto y comprueba que el iterador retorna los elementos
ordenados según el orden lexicográfico de las cadenas (orden alfabético). Este comportamiento se
debe a que las cadenas implementan la interfaz Comparable, es decir, tienen un orden natural.
*/
public class CadenaOrdenada {
    public static void main(String[] args) {
        Set<String> grupo=new TreeSet();

        grupo.add("Hola");
        grupo.add("Buenas");
        grupo.add("Tardes");
        grupo.add("Que tal");
        grupo.add("Estas");

        for ( String s:grupo) {
            System.out.println(s);

        }

    }
}
