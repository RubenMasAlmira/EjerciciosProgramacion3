import javax.swing.*;
import java.util.Deque;
import java.util.LinkedList;

public class prueba {
    public static void main(String[] args) {
        Deque<Character> pila=new LinkedList<>();
        pila.push('c');
        System.out.println(pila);
        pila.push('b');
        pila.push('a');
        pila.push('c');
        pila.push('v');
        pila.push('n');
        pila.push('m');
        pila.push('q');
        pila.push('q');
        System.out.println(pila);
        System.out.println(pila.getFirst());
        String prueba= JOptionPane.showInputDialog(null,"Introduce un mensaje");

        if(prueba.charAt(0)==pila.getFirst()){
            System.out.println("funciona");
        }

    }
}
