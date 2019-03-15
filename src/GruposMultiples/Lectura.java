package GruposMultiples;

public class Lectura {
    public static void main(String[] args) {
        Cuentas documento=new Cuentas("Grupos.txt");
        System.out.println(documento.mostrarCuentas());
    }


}
