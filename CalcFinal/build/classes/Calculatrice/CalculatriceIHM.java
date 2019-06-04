package Calculatrice;
import Pub.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CalculatriceIHM  {
    protected static int essai =0; 
    protected static JFrame fenetre2;
    protected static javax.swing.JLabel C1;
    protected static javax.swing.JLabel C2;
    protected static javax.swing.JLabel C3;
    protected static javax.swing.JLabel C4;
    protected static javax.swing.JLabel C5;
    protected static javax.swing.JButton Genere;
    protected static javax.swing.JLabel Plus;
    protected static javax.swing.JButton Reponse;
    protected static javax.swing.JTextField Resultat;
    protected static javax.swing.JLabel VF;
    protected static javax.swing.JLabel jLabel1;
    protected static javax.swing.JLabel jLabel2;
    protected static javax.swing.JLabel C6;
    protected static javax.swing.JLabel C7;
    
    
    public CalculatriceIHM(){
        
    initComp();

    }
    public static void initComp(){
                fenetre2 = new JFrame();
                fenetre2.setTitle("Calculatrice");
                fenetre2.setSize(950, 400);
                fenetre2.setLocationRelativeTo(null);
                fenetre2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fenetre2.setVisible(true);
               
                
                
                JPanel panel = new JPanel();
                panel.setBorder(new LineBorder(SystemColor.inactiveCaption));
                panel.setBounds(10, 11, 500, 700);
                fenetre2.getContentPane().add(panel);
                panel.setLayout(null);
                
                JButton btnCrerLeChamp = new JButton("Fermer l'application");
		btnCrerLeChamp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            fenetre2.setVisible(false);
                            PubIHM.visible();                            
                        }
                });
                btnCrerLeChamp.setBounds(775, 5, 150, 35);
		panel.add(btnCrerLeChamp);
                
                JButton aide = new JButton("Aide");
		aide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(fenetre2, "Cliquez sur le bouton de génération de calcul, puis répondez , attention vous n'avez que 3 chance","Aide",JOptionPane.QUESTION_MESSAGE);                           
                        }
                });
                aide.setBounds(25, 5, 150, 35);
		panel.add(aide);
                
                
                C3 = new JLabel("");
                C3.setBounds(10, 53, 380, 60);
                panel.add(C3);
                
                VF = new JLabel("");
                VF.setBounds(350, 250, 380, 60);
                panel.add(VF);
                
                C4 = new JLabel("");
                C4.setBounds(500, 53, 380, 60);
                panel.add(C4);
                
                C7 = new JLabel("La réponse est ");
                C7.setBounds(50, 50, 450, 400);
                panel.add(C7);
                
                C6 = new JLabel("");
                C6.setBounds(420, 53, 60, 60);
                Icon plus = new ImageIcon("src/plus.png");
                CalculatriceIHM.C6.setIcon(plus);
                panel.add(C6);
                
                C1 = new JLabel("");
                C1.setBounds(100, 53, 100, 20);
                panel.add(C1);
                
                Resultat = new JTextField("");
                Resultat.setBounds(300, 150, 200, 50);
                panel.add(Resultat);
                
                C2 = new JLabel("");
                C2.setBounds(400, 53, 100, 20);
                panel.add(C2);
                
            JButton Genere = new JButton("Apprendre à compter");    
            Genere.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        GenereActionPerformed(evt);
                    }
                });
            Genere.setBounds(375, 5, 150, 35);
            panel.add(Genere);
            
            JButton Reponse = new JButton("Soumettre");    
            Reponse.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ReponseActionPerformed(evt);
                    }
                });
            Reponse.setBounds(550, 155, 100, 35);
            panel.add(Reponse);
            
  
                
    }   
    
                    
    private static void GenereActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int gen = 0;
        while(gen<1){
            int n1 = (int)(Math.random() * 11);
            int n2 = (int)(Math.random() * 11);
            if(n1+n2 <10 && n1 != 0 && n2 != 0 ){
                C1.setText(Double.toString(n1));
                C2.setText(Double.toString(n2)); 
                C1.setVisible(false);
                C2.setVisible(false);
                Calculatrice.switchUn(n1);
                Calculatrice.switchDeux(n2);
                
                VF.setIcon(null);
                Resultat.setText(null);
                gen = gen +1 ;
            }
        }
    }
    
    
        private static void ReponseActionPerformed(java.awt.event.ActionEvent evt) {                                        
        double nb1 = Double.parseDouble(C1.getText());
        double nb2 = Double.parseDouble(C2.getText());
        double res = Double.parseDouble(Resultat.getText());

        
        if(res == nb1+nb2){
            Icon correct = new ImageIcon("src/correct.png");
            VF.setIcon(correct);
                                double r = nb1+nb2;
                    String rez = Double.toString(r);
                    C7.setText(rez);
        }
        else {
            Icon faux = new ImageIcon("src/faux.png");
            VF.setIcon(faux);  
            essai = essai+1;
                if (essai ==3){
                    double r = nb1+nb2;
                    String rez = Double.toString(r);
                    C7.setText(rez);
                    
                }
                else{}

        }
    }
        


}
