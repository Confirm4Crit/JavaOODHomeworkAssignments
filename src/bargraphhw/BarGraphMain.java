package bargraphhw;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class BarGraphMain
{

    /**
     * @param args
     */
    /**
     *
     * @author Miles Robson
     */
    public static void main(String[] args)
    {

        double min = 0;
        double max = 100;
        double val = 50;

        // create 3 bar charts with these colors
        Color[] chartColors = new Color[]{Color.red, Color.yellow, Color.blue};
        int ncharts = chartColors.length;

        Chart[] charts = new Chart[ncharts];
        int i;

        // first half are regular bar charts
        for (i = 0; i < ncharts; ++i) {
            charts[i] = new BarChart(chartColors[i], min, max, val);
        }

        ChartPanelFrame charFrame = new ChartPanelFrame(charts);
        charFrame.setPreferredSize(new Dimension(600, 200));
        charFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        charFrame.pack();
        charFrame.setVisible(true);
    }

}
