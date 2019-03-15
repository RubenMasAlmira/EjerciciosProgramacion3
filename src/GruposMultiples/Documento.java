package GruposMultiples;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

public class Documento {
    private List<String> documento;
    private final String nombre;

    Documento(String nombre){
        this.nombre=nombre;
        try {
            documento = Files.readAllLines(Paths.get(nombre));
        }catch (NoSuchFileException nsfe){
            JOptionPane.showMessageDialog(null,"Archivo no encontrado","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch (IOException ioe){
            JOptionPane.showMessageDialog(null,"No se ha podido leer el archivo","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public String mostrarContenido(){
        String salida="";
        for(String s:documento){
            salida+=s+"\n";
        }

        return salida;
    }

    public List<String> getDocumento() {
        return documento;
    }
    @Override
    public String toString(){
        return nombre;
    }
}
