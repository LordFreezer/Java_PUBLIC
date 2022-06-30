
import java.awt.Color;
import static java.awt.Color.RED;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.*;

public class Draw extends JFrame
{

    Font myFont = new Font("Courier New", 1, 50);
    Font myFont2 = new Font("Courier New", 1, 30);
    String word;
    private final JPanel panelN;
    private final JLabel labelN;
    private final JLabel labelM;
    private final DrawPanel panelC;
    private final JPanel panelS;
    private JButton[] b = new JButton[27];
    private String[] Words = new String[]
    {
        "gundam", "grand", "order", "excalibur", "storm", "bernie", "lancer", "rosita", "berserker", "dog"
    };
    int health;
    int strikes = 0;

    public void resetGame()
    {
        for (int i = 0; i < 26; i++)
        {
            if (i < b.length)
            {
                labelN.setForeground(Color.RED);
                b[i].setEnabled(true);
                StringBuilder ast = new StringBuilder();
                //health = 5;
                panelC.setVisible(true);
                word = Words[(int) (Math.random() * Words.length)];
                labelN.setText(word);
                for (int h = 0; h < word.length(); ++h)
                {
                    ast.append("*");
                }
                labelM.setText(ast.toString());

            }

        }
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setFont(myFont2);
        g.setColor(RED);
        g.drawString("Press <New> to Start", 75, 200);

    }

    public Draw()
    {

        labelN = new JLabel("");
        labelM = new JLabel("");
        panelC = new DrawPanel();
        panelC.setVisible(false);
        panelN = new JPanel();
        panelN.setLayout(new java.awt.GridLayout(2, 1));
        panelS = new JPanel();
        panelS.setLayout(new java.awt.GridLayout(4, 7)); //creats grid

        ButtonObserver observer = new ButtonObserver();

        for (int i = 0; i < b.length; i++)// initializes buttons
        {

            if (i == 26)
            {
                b[i] = new JButton("New Game");
                b[i].setEnabled(true);
            } else
            {
                char alpha = (char) ('a' + i);
                b[i] = new JButton(alpha + "");
                b[i].setEnabled(false);
            }

            panelS.add(b[i]);
            b[i].addActionListener(observer);

        }

        // ContentPane's default layout manager: BorderLayout
        Container contentPane = getContentPane();
        contentPane.add(panelC, "Center");
        contentPane.add(panelN, "North");
        contentPane.add(panelS, "South");
        panelN.add(labelN);
        panelN.add(labelM);
    }

    // Adding an event to the button pressed
    private class ButtonObserver implements ActionListener
    {

        /**
         * Button listener
         *
         * @param e trigger
         */
        @Override
        public void actionPerformed(ActionEvent e)// gives button's life meaing 
        {
            Object source = e.getSource();
            for (int i = 0; i < b.length; i++)
            {

                if (source == b[26])//New game
                {
                    resetGame();
                } else if (source == b[i])
                {
                    b[i].setEnabled(false);
                    check(i);
                }
            }
        }

        public void check(int guess)///help
        {
            for (int i = 0; i < word.length(); i++)
            {

                if (word.contains(String.valueOf(guess)))
                {

                } else
                {
                    health = health - (1/5);

                }
            }
        }
    }

    public class DrawPanel extends JPanel // draws stuff
    {

        private final int BALL_W = 50;
        private final int BALL_H = 50;

        @Override
        public void paintComponent(Graphics g)
        {

            health = 5;
            int x = 0;
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            g2.setColor(Color.BLUE);
            g2.setFont(myFont);
            g2.drawString("HEALTH", 140, 30);
            for (int i = 0; i < health; i++)
            {
                g2.fill(new Rectangle2D.Double(100 + x, 50, BALL_W, BALL_H));
                x = x + 60;
            }
            panelC.repaint();
        }
    }
}
