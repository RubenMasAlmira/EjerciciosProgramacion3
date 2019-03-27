package CadenasOrdenadas;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GrupoDeUsuarios {
    public static void main(String[] args) {
        Set<Usuario> grupo=new TreeSet<>();
        grupo.add(new Usuario("Orsuc","Oscar","123"));
        grupo.add(new Usuario("Descom","Manuel","123"));
        grupo.add(new Usuario("HIU","Lad","123"));
        grupo.add(new Usuario("Pedrito","Pedro","123"));
        grupo.add(new Usuario("Pedreto","Pedro","123"));


        Iterator<Usuario> iterator=grupo.iterator();
        do{
            System.out.println(iterator.next());
        }while(iterator.hasNext());

    }
}
