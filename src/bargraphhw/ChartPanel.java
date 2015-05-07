package bargraphhw;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * This class implements a panel that displays one bar.
 */
/**
 *
 * @author Miles Robson
 */
/**
 *
 * @author Miles Robson
 */
public class ChartPanel extends JPanel
{

    /**
     * Constructor. Saves the chart object.
     *
     * @param chart the chart object.
     */
    public ChartPanel(Chart chart)
    {
        super(true);  // JPanel(true) constructor enables double buffering
        this.chart = chart;
    }

    /* (non-Javadoc)
     * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);   // this erases the background
        Rectangle rect = new Rectangle();

        getBounds(rect);

        Rectangle chartBounds = new Rectangle(0 + horGap, 0 + verGap,
                (int) rect.getWidth() - 2 * horGap, (int) rect.getHeight() - 2 * verGap);

        chart.draw(chartBounds, (Graphics2D) g);
    }

    /**
     * Sets the data for the bar.
     *
     * @param val
     */
    public void setData(double val)
    {
        chart.setData(val);
    }

    private Chart chart;
    private final static int horGap = 8;
    private final static int verGap = 8;
}
