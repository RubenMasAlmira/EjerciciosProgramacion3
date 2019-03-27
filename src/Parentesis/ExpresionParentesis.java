package Parentesis;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ExpresionParentesis {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Expresiones");

        PanelPropio miPanel=new PanelPropio();

        //Comprobar lo del tamaño

        ventana.add(miPanel.getPanel());
        ventana.setResizable(true);
        ventana.setBounds(40,40,350,100);
        ventana.setLocationRelativeTo(null);

        ventana.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
               // System.out.println(ventana.getWidth());
                //System.out.println(ventana.getHeight());
            }
        });


        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

class PanelPropio{
    JLabel etiqueta=new JLabel("Expresion:");
    JTextField texto=new JTextField(20);
    JButton comprobar=new JButton("comprobar");
    JLabel salida=new JLabel("Cadena vacía");

    JPanel panel=new JPanel();

    public PanelPropio() {
        this.panel.add(etiqueta);
        this.panel.add(texto);
//        this.panel.add(comprobar);
        this.panel.add(salida);

        texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                pulsadoBoton();
            }
        });
        texto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsadoBoton();
            }
        });

        comprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsadoBoton();
            }
        });


    }

    private void pulsadoBoton() {
        String salida=valida(texto.getText())?"Es válida":"No es válida";
//        JOptionPane.showMessageDialog(null,salida);
        this.salida.setText(salida);
    }

    private static boolean valida(String expresion) {
        Deque<Character> pila = new LinkedList<>();
        Caracteres caracteres=new Caracteres("Caracteres.txt");
        for(int i=0;i<expresion.length();i++){
            if(caracteres.getCaracteres().containsKey(expresion.charAt(i))){
                pila.push(expresion.charAt(i));


            }else if(caracteres.getCaracteres().containsValue(expresion.charAt(i))){
                try {
                    if(caracteres.getCaracteres().get(pila.getFirst())==expresion.charAt(i)) {
                        pila.pop();
                    }

                }catch (NoSuchElementException nsee){
                    return false;
                }
        }
        }
        return pila.isEmpty();
    }

    public JTextField getTexto() {
        return texto;
    }

    public JPanel getPanel() {
        return panel;
    }
}
