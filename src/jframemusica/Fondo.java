
package jframemusica;

import javax.swing.JFrame;
public class Fondo extends JFrame {
  
    
    public static void main (String[]args){
        Fondo f = new Fondo();
        f.setSize(800,600);
        f.setVisible(true);
        Panel p=new Panel("cosmos.jpg");
        f.add(p);
        
        
    }
}
