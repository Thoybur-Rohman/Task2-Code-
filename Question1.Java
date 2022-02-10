

package program1;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class SpongeBob extends JFrame {
    
    // Private data about SpongeBob's state, position, size
    private boolean smiling = true;
    private int x,y;
    private int width, height;
    
    // Constructors: Create a new instance of SpongeBob
    
    // Default constructor
    public SpongeBob() {
         
        super("Program 1: Sponge Bob!");
        
        x = 250;
        y = 250;
        width = 40;
        height = 70;
        
        setSize(new Dimension(500,500));
        setResizable(false);
        setBackground(Color.pink);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setVisible(true);
        repaint();
    }
     
    // Accessors...
    
     // Is SpongeBob smiling?
     public boolean isSmiling()
     {
         return smiling;
     }

     // Mutators...
 
     // Make SpongeBob smile
     public void smile()
     {
         smiling = true;
         repaint();
     }
     
     // Make SpongeBob frown
     public void frown()
     {
         smiling = false;
         repaint();
     }

     // Set position
     public void setPosition(int newX, int newY)
     {
         x = newX;
         y = newY;
         repaint();
     }
     
     // Set dimensions
    public void setDimensions(int newWidth, int newHeight)
    {
        width = newWidth;
        height = newHeight;
        repaint();
    }
    
    public void output()
    {
        if(isSmiling())
            System.out.println("SpongeBob is smiling.");
        else
            System.out.println("SpongeBob is frowning.");
            
        System.out.println("Width = " + width + ", Height = " + height);
        System.out.println("(X,Y) location = (" + x + "," + y +")");
    }
     // Draw SpongeBob!
     public void paint(Graphics g)
     {     
         g.setColor(Color.yellow);
         
         g.fillRect(x,y,width,height);
         g.setColor(Color.white);
         g.fillOval(x + (int)(0.2*width),y + (int)(0.2*height),
                 (int)(0.2*width), (int)(0.2*width));
         g.fillOval(x + (int)(0.6*width),y + (int)(0.2*height),
                 (int)(0.2*width), (int)(0.2*width));
    
         g.setColor(Color.blue);
         g.fillOval(x + (int)(0.2325*width),y + (int)(0.2*height+0.0325*width),
                 (int)(0.125*width), (int)(0.125*width));
         g.fillOval(x + (int)(0.6325*width),y + (int)(0.2*height+0.0325*width),
                 (int)(0.125*width), (int)(0.125*width));
         
         g.setColor(Color.black);
         if(smiling)
             g.drawArc(x+(int)(0.2*width),y+(int)(0.5*height),
                     (int)(0.6*width), (int)(0.3*height), 0, -180);
         else
              g.drawArc(x+(int)(0.2*width),y+(int)(0.5*height),
                     (int)(0.6*width), (int)(0.3*height), 0, 180);
     }
     
     
}
