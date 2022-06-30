
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Draw extends JFrame
{

    private final JLabel labelN;
    private final DrawPanel panelC;
    private final JPanel panelS;
    private JButton[] b = new JButton[12];

    int balls;
    int strikes;
    int x, y, z;

    public Draw()
    {
        labelN = new JLabel();
        labelN.setText("Play Ball!!!");

        panelC = new DrawPanel();
        panelC.setVisible(false);

        panelS = new JPanel();
        panelS.setLayout(new java.awt.GridLayout(3, 4)); // 3 x 4 grid
        ButtonObserver observer = new ButtonObserver();
        for (int i = 0; i < b.length; i++)
        {
            if (i == 10)
            {
                b[i] = new JButton("New Game");
                b[i].setEnabled(true);
            } else if (i == 11)
            {
                b[i] = new JButton("Clear");
                b[i].setEnabled(false);
            } else
            {
                b[i] = new JButton("" + i);
                b[i].setEnabled(false);
            }

            panelS.add(b[i]);
            b[i].addActionListener(observer);
        }

        // ContentPane's default layout manager: BorderLayout
        Container contentPane = getContentPane();
        contentPane.add(panelC, "Center");
        contentPane.add(labelN, "North");
        contentPane.add(panelS, "South");
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
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();
            for (int i = 0; i < b.length; i++)
            {

                if (source == b[10])//New game
                {
                    balls = 0;
                    strikes = 0;
                    panelC.setVisible(false);
                    for (int k = 0; k < 10; k++)
                    {
                        b[k].setEnabled(true);
                    }

                    do
                    {
                        x = (int) (Math.random() * 10);
                        y = (int) (Math.random() * 10);
                        z = (int) (Math.random() * 10);
                    } while (x == y || y == z || x == z);
                    labelN.setText("key = " + x + y + z);
                    break;
                } else if (source == b[11]) // clear
                {
                    b[11].setEnabled(false);
                    balls = 0;
                    strikes = 0;
                    panelC.setVisible(false);
                    for (int k = 0; k < 10; k++)
                    {
                        b[k].setEnabled(true);
                    }
                     labelN.setText("key = " + x + y + z);
                    break;
                } else if (source == b[i])//all game keys
                {
                    b[i].setEnabled(false);
                    check(i);

                    if (labelN.getText().length() == 9)
                    {
                        labelN.setText(labelN.getText() + " | Guess = " + i);    
                    }
                    else if (labelN.getText().length() == 21)
                    {
                        labelN.setText(labelN.getText() + i);
                    }
                    else if (labelN.getText().length() == 22)
                    {
                        
                        labelN.setText(labelN.getText() + i + " | B = "+ balls+ " S = "+ strikes);
                        panelC.setVisible(true);
                        b[0].setEnabled(false);
                        b[1].setEnabled(false);
                        b[2].setEnabled(false);
                        b[3].setEnabled(false);
                        b[4].setEnabled(false);
                        b[5].setEnabled(false);
                        b[6].setEnabled(false);
                        b[7].setEnabled(false);
                        b[8].setEnabled(false);
                        b[9].setEnabled(false);
                        b[11].setEnabled(true);
                        
                    }
                    
                    break;
                }
            }
        }
        
        public void check(int guess)
        {
            if(guess==x||guess==y||guess==z)
        {
            if(guess == x && labelN.getText().length()==9)
            {
                ++strikes;
            }
            else if(guess == y && labelN.getText().length()==21)
            {
                ++strikes;
            }
            else if(guess == z && labelN.getText().length()==22)
            {
                ++strikes;
            }
            else
            {
                ++balls;
            }
            
        }
        }
    }

    public class DrawPanel extends JPanel
    {

        private final int BALL_W = 50;
        private final int BALL_H = 50;

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            g2.setColor(Color.GREEN);
            g2.drawString("Ball(s)", 20, 70);
            int X = 0;
            for (int i = 0; i < balls; i++)
            {
                g2.fill(new Ellipse2D.Double(100 + X, 50, BALL_W, BALL_H));
                X = X + BALL_W;
            }
            g2.setColor(Color.RED);
            g2.drawString("Strike(s)", 20, 170);
            int Y = 0;
            for (int i = 0; i < strikes; i++)
            {
                g2.fill(new Ellipse2D.Double(100 + Y, 150, BALL_W, BALL_H));
                Y = Y + BALL_W;
            }
            panelC.repaint();
        }
    }
}
