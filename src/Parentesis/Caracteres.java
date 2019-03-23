package Parentesis;

import com.sun.javafx.collections.MappingChange;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Caracteres {
    Map<Character,Character> caracteres;

    Caracteres(String documento){
        this.caracteres=obtenerMapa(documento);

    }

    private static Map<Character,Character> obtenerMapa(String documento){
        try {
            List<String> listaCaracteres = Files.readAllLines(Paths.get("Caracteres.txt"));

            Map<Character,Character> mapaDeCaracteres=new HashMap<>();
            for (String s:listaCaracteres){
                mapaDeCaracteres.put(s.trim().charAt(0),s.trim().charAt(1));
            }
            return mapaDeCaracteres;

        }catch (IOException ioe){
            JOptionPane.showMessageDialog(null,"Error al leer el fichero","Error",JOptionPane.ERROR_MESSAGE);
        }

        return null;

    }

    public Map<Character, Character> getCaracteres() {
        return caracteres;
    }

}
