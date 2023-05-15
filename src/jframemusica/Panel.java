package jframemusica;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Panel extends JPanel {
    ImageIcon image;
    String nombre;
    
    public Panel(String nombre){
      this.nombre = nombre;  
          }
    
    public void paint (Graphics g){
        Dimension tamano = getSize();
        image = new ImageIcon(getClass().getResource(nombre));
        g.drawImage(image.getImage(), 0, 0,tamano.width,tamano.height, null);
        setOpaque(false);
        super.paint(g);
    }
    
}
