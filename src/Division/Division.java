package Division;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
/*Enhance the DivisionPractice program from the chapter:
Put in a loop so that the user is repeatedly asked for the numerator and the divisor. For each set of data, the program
prints out the result, or an informative error message if there is a problem (division by zero or poor input data).
The program continues looping, even if there is a problem
Exit the loop when data entered for the numerator start with characters "q" or "Q". Don't print out an error message in
this case.
Don't ask for the divisor if the user just asked to quit.*/

public class Division {
    public static void main(String[] args) {
        String resultados="";
        do {
            try {

                String salida = JOptionPane.showInputDialog("Introduce el divisor:");
                if(salida.toUpperCase().charAt(0)=='Q'){
                    break;
                }
                int divisor = Integer.parseInt(salida);
                int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
                System.out.println(dividendo/divisor);
            }catch (NullPointerException npe){
                JOptionPane.showMessageDialog(null,"No has introducido nada","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Información introducida erroneamente","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(StringIndexOutOfBoundsException SIOBE){
                JOptionPane.showMessageDialog(null,"Información introducida erroneamente","Error",JOptionPane.ERROR_MESSAGE);

            }
        } while (true);

    }
}
