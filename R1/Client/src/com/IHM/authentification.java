/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;


/**
 *
 * @author Laura
 */
public class authentification extends JFrame {

    public authentification(){
      /*  WindowListener w = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        addWindowListener(w);*/
      
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimEcran = tk.getScreenSize();
        setSize(dimEcran.width, dimEcran.height); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        getContentPane().setLayout(new FlowLayout());
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JPanel panneau = new JPanel();
        panneau.setBorder(new TitledBorder("Authentifiez vous"));

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(panneau);
        
        JLabel profil = new JLabel();
        profil.setText("Vous êtes :");
        panneau.add(profil);
        ButtonGroup groupe = new ButtonGroup();
        JCheckBox bouton1 = new JCheckBox("Manager");
        groupe.add(bouton1);
        panneau.add(bouton1);
        JCheckBox bouton2 = new JCheckBox("Réparateur");
        groupe.add(bouton2);
        panneau.add(bouton2);
        System.getProperty("line.separator");
        JLabel mdp = new JLabel();
        mdp.setText("Mot de passe :");
        JTextField entre = new JTextField("Entrez votre mot de passe", 20);
        panneau.add(mdp);
        panneau.add(entre);
        setContentPane(panneau);
        setVisible(true);
        
    }   
    
 
    
    
    
    public static void main(String[] args) {
       JFrame frame = new authentification();
    }
    

}