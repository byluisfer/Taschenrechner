/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taschenrechner;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author luisfer
 */
public class Calculator {
     private JTextField result;

    public Calculator() {
        // Initialisierung des result-Feldes und der Buttons
        result = new JTextField();

        JButton piButton = new JButton("Pi");
        piButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton25ActionPerformed();
            }
        });

        // Hinzufügen der Komponenten zum Frame (nicht vollständig)
        // ...
    }

    private void jButton25ActionPerformed() {
        String zt = result.getText();
        if (!zt.isEmpty() && Character.isDigit(zt.charAt(zt.length() - 1)) && !zt.contains("3.141")) {
            String z = zt + "3.141";
            result.setText(z);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().result);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
