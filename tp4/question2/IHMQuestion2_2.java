package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);
        

        // à compléter à l'identique de la question 2_1, (du copier/coller)...
        // le bouton A a 3 observateurs jbo1, jbo2 et jbo3
  boutonA.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                        contenu.append("observateur jbo3: clic du bouton A\n");
                    }
                });
               boutonA.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                        contenu.append("observateur jbo2: clic du bouton A\n");
                    }
                });
                 boutonA.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                        contenu.append("observateur jbo1: clic du bouton A\n");
                    }
                });
        // ActionListener obj1 = new EcouteurDeBouton();
         
        // le bouton B a 2 observateurs jbo1 et jbo2
                boutonB.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                        contenu.append("observateur jbo2: clic du bouton B\n");
                    }
                });
                 boutonB.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                        contenu.append("observateur jbo1: clic du bouton B\n");
                    }
                });
        // le bouton C a 1 observateur jbo1
                   boutonC.addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent ae){
                        contenu.append("observateur jbo1: clic du bouton C\n");
                    }
                });

        // à compléter pour la question 2_2 (JMouseObserver)
            // le bouton A a 1 observateur jmo1

          boutonA.addMouseListener(new MouseListener() {
                 public void mousePressed(MouseEvent me) { 
                  
                }
                public void mouseReleased(MouseEvent me) { 
                
                }
                public void mouseEntered(MouseEvent me) { 
                  contenu.append("observateur jmo1 : souris entree en (" + me.getX() + "," + me.getY() +")\n");
                } 
                public void mouseExited(MouseEvent me) { 
             
                }
                public void mouseClicked(MouseEvent me) { 
                 
                }
                     
            });
 
            
            // le bouton B a 1 observateur jmo2
                 boutonB.addMouseListener(new MouseListener() {
                 public void mousePressed(MouseEvent me) { 
                  
                }
                public void mouseReleased(MouseEvent me) { 
                
                }
                public void mouseEntered(MouseEvent me) { 
                  contenu.append("observateur jmo2 : souris entree en (" + me.getX() + "," + me.getY() +")\n");
                } 
                public void mouseExited(MouseEvent me) { 
             
                }
                public void mouseClicked(MouseEvent me) { 
                 
                }
                     
            });
 
            // le bouton C a 1 observateur jmo3
                      boutonC.addMouseListener(new MouseListener() {
                 public void mousePressed(MouseEvent me) { 
                  
                }
                public void mouseReleased(MouseEvent me) { 
                
                }
                public void mouseEntered(MouseEvent me) { 
                  contenu.append("observateur jmo3 : souris entree en (" + me.getX() + "," + me.getY() +")\n");
                } 
                public void mouseExited(MouseEvent me) { 
             
                }
                public void mouseClicked(MouseEvent me) { 
                 
                }
                     
            });
        
    }
    
     public static void main(String[] args){
        new IHMQuestion2_1();
        new IHMQuestion2_2();
    }


}
