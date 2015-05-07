package bargraphhw;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Strategy interface for managing a chart
 */
/**
 *
 * @author Miles Robson
 */
public interface Chart
{

    /**
     * Set the data point, with min and max range specified
     *
     * @param min the minimum range value
     * @param max the maximum range value
     * @param val the value
     */
    void setData(double min, double max, double val);

    /**
     * Set the data point.
     *
     * @param val the value
     */
    void setData(double val);

    /**
     * Return the data point.
     *
     * @return the current set value
     */
    double getData();

    /**
     * Draw the chart in this enclosing rectangle.
     *
     * @param where the enclosing rectangle.
     * @param g the Graphics context
     */
    public void draw(Rectangle where, Graphics2D g);
};
