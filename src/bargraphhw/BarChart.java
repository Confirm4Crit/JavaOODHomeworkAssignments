package bargraphhw;

import java.awt.*;
import java.awt.geom.*;

/**
 * Implements a bar chart. This object handles one bar.
 *
 *
 */
/**
 *
 * @author Miles Robson
 */
public class BarChart implements Chart, Cloneable
{

    public BarChart(Color col, double min, double max, double val)
    {
        color = col;
        setData(min, max, val);
    }

    public void setData(double min, double max, double val)
    {
        this.min = min;
        this.max = max;
        this.value = val;
    }

    public void setData(double val)
    {
        this.value = val;
    }

    /**
     * Return the current data point.
     */
    public double getData()
    {
        return value;
    }

    /**
     * @return the minimum of the acceptable range
     */
    public double getMin()
    {
        return min;
    }

    /**
     * @return the maximum
     */
    public double getMax()
    {
        return max;
    }

    /**
     * @return the bar color
     */
    Color getColor()
    {
        return color;
    }

    /* (non-Javadoc)
     * @see Chart#draw(java.awt.Rectangle, java.awt.Graphics2D)
     */
    public void draw(Rectangle where, Graphics2D g)
    {
        double relwidth = (value - min) / (max - min);
        double barwidth = relwidth * where.getWidth();
        Rectangle2D.Double re = new Rectangle2D.Double(where.getX(), where.getY(),
                barwidth, where.getHeight());

        g.setColor(color);
        g.fill(re);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    public BarChart clone()
    {
        return new BarChart(color, min, max, value);
    }

    private Color color;
    private double min;
    private double max;
    private double value;
}
