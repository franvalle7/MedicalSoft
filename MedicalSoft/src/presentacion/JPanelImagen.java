package presentacion;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class JPanelImagen extends JPanel  {
	 
    private BufferedImage imagen;
   
 
    public JPanelImagen(BufferedImage imagenInicial) {
    	setLayout(null);
    	 if (imagenInicial != null) {
             imagen = imagenInicial;
         }
    	
    }
    
    public JPanelImagen() {
    	setLayout(null);
    	setBackground(Color.BLACK);
    }
 
    public void setImagen(BufferedImage nuevaImagen) {
        imagen = nuevaImagen;
 
        repaint();
    }
 
    @Override
    public void paint(Graphics g) {
      
            g.drawImage(imagen, 0, 0,this);
            setOpaque(false);
            super.paint(g);
    }

	
}
