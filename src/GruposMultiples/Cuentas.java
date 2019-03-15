package GruposMultiples;

import java.util.ArrayList;

public class Cuentas {
    ArrayList<Grupo> cuentas;
    Documento documento;

    Cuentas(String nombreDocumento){
        this.documento=new Documento(nombreDocumento);
        cuentas=getCuentas();
    }

    public ArrayList<Grupo> getCuentas(){
        ArrayList<Grupo>cuentas=new ArrayList<>();
        Grupo grupoActual;
        try {
            cuentas.add(new Grupo(documento.getDocumento().get(0)));
            grupoActual=cuentas.get(0);
        for (int i=1;i<documento.getDocumento().size();i++) {
            boolean nuevoGrupo=false;
            try{
                Integer.parseInt(documento.getDocumento().get(i).trim());
            }catch (NumberFormatException nfe){
                nuevoGrupo=true;
            }
            if(nuevoGrupo){
                grupoActual=new Grupo(documento.getDocumento().get(i).trim());
                cuentas.add(grupoActual);
            }else{
                grupoActual.anadirALaCuenta(Integer.parseInt(documento.getDocumento().get(i).trim()));
            }
            }
        }catch (RuntimeException re){
        }
        return cuentas;

    }

    public String mostrarCuentas(){
        String salida="";
        for(Grupo g:cuentas){
            salida+=g+"\n";
        }
        return salida;
    }
}
