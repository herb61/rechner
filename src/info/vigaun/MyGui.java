/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.vigaun;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Herbert
 */
public class MyGui {
    
    private JFrame myFrame = new JFrame("Währungsrechner");
    
    public void generateGui(){
        //Größe definieren
       myFrame.setSize(300, 200);

       //Programm beenden bei x
       myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //Layout setzen
       myFrame.setLayout(new GridLayout(5,2));
       
       //Einfügen von Label und Textfeld
        JLabel euroL = new JLabel("Betrag in Euro");
        JTextField euroF = new JTextField("Betrag eingeben",8);
        euroF.selectAll();
        myFrame.add(euroL);
        myFrame.add(euroF);
        JLabel leer = new JLabel();
        myFrame.add(leer);
        myFrame.add(leer);
        JLabel usdL = new JLabel("Betrag in USD");
        JLabel usdE = new JLabel("Betrag in USD");
        myFrame.add(usdL);
        myFrame.add(usdE);
        myFrame.add(leer);
        myFrame.add(leer);
        JButton clacB = new JButton("Berechnen");
        myFrame.add(clacB);
        //berechnen
        clacB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            usdE.setText(calc(euroF.getText())+ " USD");

         }
        });
        //myFrame.pack();
       //sichtbar machen
       myFrame.setVisible(true);
             
    }
    
           
      private String calc(String euroS){
          
        double euro = 0.0;
        double usd = 1.2345;
        try{
        euro = Double.parseDouble(euroS);

        }catch(NumberFormatException e){
            return "Keine Zahl eingegeben";
        }
        catch(NullPointerException e){
            return "nichts EIngegeben";
        }
        
        return Double.toString(usd * euro);   
      }
    
}
