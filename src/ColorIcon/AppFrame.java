package ColorIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppFrame
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // "final" since we use them in the anonymous class listener:
        final ColorIcon icon = new ColorIcon(200, Color.GREEN);
        final JLabel lbl = new JLabel(icon);

        // this is for the "loop" requirement:
        Color[] colors = new Color[]{Color.RED, Color.GREEN, Color.BLUE};
        String[] colorNames = new String[]{"RED", "GREEN", "BLUE"};
        JButton[] buttons = new JButton[colors.length];
        int i;

        for (i = 0; i < colors.length; i++) {
            final Color c = colors[i];
            buttons[i] = new JButton(colorNames[i]);

            // use anonymous class:
            ActionListener al = new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    icon.setColor(c);
                    lbl.repaint();
                }
            };

	    // ... OR could have called:
            //     ActionListener al = new ColorButtonAL(colors[i], icon, lbl);
            // OK, it's less to type with anonymous classes.
            buttons[i].addActionListener(al);
            panel.add(buttons[i]);
        }  // for loop

        frame.add(lbl, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }  // main

    /**
     * ActionListener for the three buttons implemented as a separate class.
     * Notice that is a "nested" class (inner and static). This is just for
     * convenience. Could have been a non-public class in this file, or in a
     * separate file.      *
     * THIS CLASS IS NOT USED. IT IS HERE FOR ILLUSTRATING THE CASE WHERE THE
     * ActionListener IS NOT AN ANONYMOUS CLASS.
     */
    private static class ColorButtonAL implements ActionListener
    {

        private ColorIcon icon;
        private JLabel lbl;
        private Color c;

        public ColorButtonAL(Color col, ColorIcon cci, JLabel label)
        {
            c = col;
            icon = cci;
            lbl = label;
        }

        /**
         * Called when the user clicks button.
         */
        public void actionPerformed(ActionEvent event)
        {
            icon.setColor(c);
            lbl.repaint();
        }
    };
}
