package Pub;
import Calculatrice.*;


public class Pub {
    
    public static void chrono(int seconde)throws InterruptedException{
            for(int i=0 ; i<seconde ; i++){
           System.out.println(System.currentTimeMillis());
           Thread.currentThread().sleep(1);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 CalculatriceIHM calc = new CalculatriceIHM() ;                 
                }
            });
            PubIHM.invisible();
        }


    
}