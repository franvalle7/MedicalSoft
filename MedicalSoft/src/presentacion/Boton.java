package presentacion;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.Color; 
import javax.swing.JButton;
import javax.swing.JFrame;

public class Boton extends JButton{


	private int f;
	private int f1;
	private boolean round;
	private Color colorFondo;
	private Color colorPresionado;

	public Boton(String rotulo, Color fon, Color pre, int i, int i1) {
		super(rotulo); 
        f=i; 
        f1=i1; 
        round = false; 
        colorFondo = fon; 
        colorPresionado = pre; 
        setContentAreaFilled(false); 
	}

	
	@ Override 
    protected void paintComponent(Graphics g) { 
        if (getModel().isArmed()) { 
            g.setColor(colorPresionado); 
        } else { 
            g.setColor(colorFondo); 
        } 
        if (round) { 
            g.fillOval(0, 0, getSize().width - 1, getSize().height - 1); 
        } else { 
            g.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, f, f1); 
        } 
        super.paintComponent(g); 
    }  
	@ Override 
    protected void paintBorder(Graphics g) { 
        g.setColor(Color.black); 

        if (round) { 
            g.drawOval(0, 0, getSize().width - 1, getSize().height - 1); 
        } else { 
            g.drawRoundRect(0, 0, getSize().width - 1, getSize().height - 1, f, f1); 
        } 
    } 
 Shape figura; 

    @ Override 
    public boolean contains(int x, int y) { 
        if (round) { 
            figura = new Ellipse2D.Float(0, 0, getWidth(), getHeight()); 
        }else{ 
            figura = new RoundRectangle2D.Double(0, 0,getWidth(),getHeight(), f, f1); 

        } 
        return (figura.contains(x, y)); 
    } 
}
