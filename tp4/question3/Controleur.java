package question3;

import question3.tp3.PileI;
import question3.tp3.PilePleineException;
import question3.tp3.PileVideException;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Décrivez votre classe Controleur ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Controleur extends JPanel {

    private JButton push, add, sub, mul, div, clear;
    private PileModele<Integer> pile;
    private JTextField donnee;

    public Controleur(PileModele<Integer> pile) {
        super();
        this.pile = pile;
        this.donnee = new JTextField(8);
        
        this.push = new JButton("push");
        this.add = new JButton("+");
        this.sub = new JButton("-");
        this.mul = new JButton("*");
        this.div = new JButton("/");
        this.clear = new JButton("[]");

        setLayout(new GridLayout(2, 1));
        add(donnee);
        
        donnee.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                      //     pile.empiler();
                     // int d =  Integer.parseInt(donnee.getText());
                      try {
                          
                      } catch (Exception  e){
                          donnee.setText("Error");
                        }
                    }
                });
        JPanel boutons = new JPanel();
        boutons.setLayout(new FlowLayout());
        
        boutons.add(push);  push.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                      //     pile.empiler();
                     // int d =  Integer.parseInt(donnee.getText());
                      try {
                      pile.empiler(Integer.parseInt(donnee.getText()));
                      actualiserInterface(); 
                      } catch (Exception  e){
                          donnee.setText("Error");
                        }
                    }
                });
        boutons.add(add);   add.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                      //     pile.empiler();
                     // int d =  Integer.parseInt(donnee.getText());
                      try {
                        int a =   pile.depiler();
                        int b = pile.depiler();
                        int sum =a +b;
                      pile.empiler(sum);
                     
                         actualiserInterface(); 
                      } catch (Exception  e){
                          donnee.setText("Error");
                        }
                    }
                });
        boutons.add(sub);   sub.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                      //     pile.empiler();
                     // int d =  Integer.parseInt(donnee.getText());
                      try {
                        int a =   pile.depiler();
                        int b = pile.depiler();
                        int dif =b  - a;
                      pile.empiler(dif);
                        actualiserInterface(); 
                      } catch (Exception  e){
                          donnee.setText("Error");
                        }
                    }
                });
        boutons.add(mul);   mul.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                      //     pile.empiler();
                     // int d =  Integer.parseInt(donnee.getText());
                      try {
                        int a =   pile.depiler();
                        int b = pile.depiler();
                        int m =a *b;
                      pile.empiler(m);
                     // pile.taille();
                    actualiserInterface(); 
                       
                      } catch (Exception  e){
                          donnee.setText("Error");
                        }
                    }
                });
        boutons.add(div);   div.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                      //     pile.empiler();
                     // int d =  Integer.parseInt(donnee.getText());
                      try {
                        int a =   pile.depiler();
                        int b = pile.depiler();
                        int d =b / a;
                      pile.empiler(d);
                        actualiserInterface(); 
                      } catch (Exception  e){
                          donnee.setText("Error");
                        }
                    }
                });
        boutons.add(clear); clear.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                         
                            for (int i=pile.taille()-1;i>=0;i--){
                             try {  
                                 pile.depiler();   
                                  actualiserInterface(); 
                                }
                             catch (Exception e){
                                donnee.setText("Error");
                                }
                            }
                            //                       pile.empiler(this.donnee.to);
                    }
                });
        add(boutons);
        boutons.setBackground(Color.red);
        actualiserInterface();
    }

    public void actualiserInterface() {
        // à compléter
        
    if(this.pile.taille() >=2){ 
      this.add.setEnabled(true);
      this.sub.setEnabled(true);
      this.mul.setEnabled(true);
      this.div.setEnabled(true);
    }else{
      this.add.setEnabled(false);
      this.sub.setEnabled(false);
      this.mul.setEnabled(false);
      this.div.setEnabled(false);
    }
    
      
    }

    private Integer operande() throws NumberFormatException {
        return Integer.parseInt(donnee.getText());
    }

    // à compléter
    // en cas d'exception comme division par zéro, 
    // mauvais format de nombre suite à l'appel de la méthode operande
    // la pile reste en l'état (intacte)

}
