package ColorIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
   Icon class that displays a colored circle.
*/
public class ColorIcon implements Icon
{
    /**
       Constructor.
       @param width the icon width
       @param c the circle color
    */
    public ColorIcon(int width, Color c)
    {
	w = width;
	color = c;
    }
    
    /**
       @return the icon width
    */
    public int getIconWidth()
    {
	return w;
    }
    
    /**
       @return the icon height
    */
    public int getIconHeight()
    {
	return w;
    }
    
    /**
       Method called to draw the icon.
    */
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
	Graphics2D g2 = (Graphics2D)g;
	double r = 100;       // radius

	Rectangle2D el = new Rectangle2D.Double(x + w/2 - r, y + w/2 - r, w/2, w/2);
	g2.setColor(color);
	g2.fill(el);
    }
    
    /**
       Set icon circle color.
       @param c the new color
    */
    public void setColor(Color c)
    {
	color = c;
    }
    
    private Color color;
    private int w;
}


