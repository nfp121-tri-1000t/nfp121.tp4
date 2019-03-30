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
        
        donnee.addActionListener(null);
        JPanel boutons = new JPanel();
        boutons.setLayout(new FlowLayout());
        
        boutons.add(push);  push.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                      //     pile.empiler();
                     // int d =  Integer.parseInt(donnee.getText());
                      try {
                      pile.empiler(Integer.parseInt(donnee.getText()));
                       
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
                      pile.empiler(a + b);
                       donnee.setText(Integer.toString(sum));
                      } catch (Exception  e){
                          donnee.setText("Error");
                        }
                    }
                });
        boutons.add(sub);   sub.addActionListener(null /* null est à remplacer */);
        boutons.add(mul);   mul.addActionListener(null /* null est à remplacer */);
        boutons.add(div);   div.addActionListener(null /* null est à remplacer */);
        boutons.add(clear); clear.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                            pile.taille();
                                    //                       pile.empiler(this.donnee.to);
                    }
                });
        add(boutons);
        boutons.setBackground(Color.red);
        actualiserInterface();
    }

    public void actualiserInterface() {
        // à compléter
       //  new Controleur(pile);
    }

    private Integer operande() throws NumberFormatException {
        return Integer.parseInt(donnee.getText());
    }

    // à compléter
    // en cas d'exception comme division par zéro, 
    // mauvais format de nombre suite à l'appel de la méthode operande
    // la pile reste en l'état (intacte)

}
