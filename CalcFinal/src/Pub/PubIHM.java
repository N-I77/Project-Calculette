package Pub;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PubIHM {
    
    protected static JFrame fenetre;
    
    public PubIHM(){
        fenetre = new JFrame();
    
    }
    
    public static void initComp(){
                fenetre = new JFrame();
                fenetre.setTitle("Pub Yop");
                fenetre.setSize(830, 400);
                fenetre.setLocationRelativeTo(null);
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Icon yop = new ImageIcon("src/yop.jpg");
                JLabel yopPub = new JLabel();
                yopPub.setIcon(yop); 
                fenetre.add(yopPub);
                fenetre.setVisible(true);
    
    }    
    
    public static void invisible(){
                fenetre.setVisible(false);
    
    }    
    
        public static void visible(){
                fenetre.setVisible(true);
    
    } 
    
}

