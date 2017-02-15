/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Laura
 */
public class Accueil extends JFrame {
    
    
    public Accueil(){
             
setSize(800,600);
setLocationRelativeTo(null);
JPanel panelNord = new JPanel();
panelNord.setLayout(new GridLayout(1, 2)); // 1 ligne, 2 colonnes
JPanel panelBarre = new JPanel();
BoxLayout layoutBarre = new BoxLayout(panelBarre, BoxLayout.X_AXIS);
panelBarre.add(new JLabel("Manager : Test ... "));
panelNord.add(panelBarre);

JPanel panelWest = new JPanel(new FlowLayout());
panelWest.setPreferredSize(new Dimension(300, 200));
panelWest.setBorder(new TitledBorder("Listes des informations sur le véhicule : "));
panelWest.add(new JLabel("Identifiant du véhicule :"));
JTextField id = new JTextField(10);
JButton search = new JButton("Rechercher");
panelWest.add(id);
panelWest.add(search);

JPanel panelSouth =  new JPanel(new GridLayout(1,2));
panelSouth.setPreferredSize(new Dimension(300,400));
panelSouth.setBorder(new TitledBorder("Informations sur le véhicule : "));
panelSouth.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

JPanel southLeft =  new JPanel();
BoxLayout layoutSouthLeft = new BoxLayout(southLeft, BoxLayout.Y_AXIS);
southLeft.setLayout(layoutSouthLeft);

southLeft.add(new JLabel("Modèle : "));
southLeft.add(Box.createGlue());
southLeft.add(new JLabel("Année : "));
southLeft.add(Box.createGlue());
southLeft.add(new JLabel("Marque : "));
southLeft.add(Box.createGlue());
southLeft.add(new JLabel("Type : "));
southLeft.add(Box.createGlue());
panelSouth.add(southLeft);

JPanel southRight = new JPanel(); 
southRight.add(Box.createGlue());

southRight.add(Box.createGlue());
int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED; 
JScrollPane jsp=new JScrollPane(southRight,v,h);
jsp.setBorder(new TitledBorder("Historique des réparations : "));
BoxLayout layoutSouthRight = new BoxLayout(southRight, BoxLayout.Y_AXIS);
southRight.setLayout(layoutSouthRight);

for(int i=0; i<30; i++){
    southRight.add(new JLabel("      - Test histo numero "+i));
    southRight.add(Box.createVerticalGlue());
}  
panelSouth.add(jsp);







 
JPanel panelPrincipal = new JPanel();
panelPrincipal.setLayout(new BorderLayout());
panelPrincipal.add(panelNord, BorderLayout.NORTH);
panelPrincipal.add(panelWest, BorderLayout.WEST);
panelPrincipal.add(panelSouth, BorderLayout.SOUTH);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 


 
 
setContentPane(panelPrincipal);

 
setVisible(true);
     
    } 
    }
