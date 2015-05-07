package bargraphhw;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

/**
 * This class manages an array of Chart objects.
 */
/**
 *
 * @author Miles Robson
 */
public class ChartPanelFrame extends JFrame
{

    public ChartPanelFrame(Chart[] charts)
    {
        int i;
        int nPanels = charts.length;

        JPanel chartPanel = new JPanel();
        chartPanel.setLayout(new BoxLayout(chartPanel, BoxLayout.Y_AXIS));

        ChartPanel[] panels = new ChartPanel[nPanels];
        for (i = 0; i < nPanels; i++) {
            panels[i] = new ChartPanel(charts[i]);
            chartPanel.add(panels[i]);
        }

        JPanel jpNumbers = new JPanel();
        jpNumbers.setLayout(new BoxLayout(jpNumbers, BoxLayout.Y_AXIS));

        for (i = 0; i < nPanels; i++) {
            double val = charts[i].getData();

            // create the textview for number edit
            JTextField number = new JTextField("" + val, 6);

            // add the observer:
            number.addKeyListener(new NumberKeyListener(number, panels[i]));
            jpNumbers.add(number);
        }

        setLayout(new BorderLayout());
        add(jpNumbers, BorderLayout.WEST);
        add(chartPanel, BorderLayout.CENTER);

        add(new JLabel("Keep numbers in [0,100]"), BorderLayout.NORTH);
    }

    private class NumberKeyListener implements KeyListener
    {

        public NumberKeyListener(JTextField text, ChartPanel chartPanel)
        {
            this.jtfNumber = text;
            this.chartPanel = chartPanel;
        }

        public void keyPressed(KeyEvent e)
        {
        }

        public void keyReleased(KeyEvent e)
        {
            try {
                // get the number from the textfield
                double val = Double.parseDouble(jtfNumber.getText());

                // set the data and repaint
                chartPanel.setData(val);
                chartPanel.repaint();
            } catch (Exception ex) {
                // ignore event if not a number
                jtfNumber.selectAll();
            }
        }

        public void keyTyped(KeyEvent e)
        {
        }

        private JTextField jtfNumber;
        private ChartPanel chartPanel;
    }
}
