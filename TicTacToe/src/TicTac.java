
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class TicTac extends JFrame
{

    private final JLabel labelN;
    private final JPanel panelC;
    private final JPanel panelS;
    private JButton[] b = new JButton[10]; // array of buttons
    private String WhoseTurn = "X";
    Font font1 = new Font("Courier New", Font.BOLD, 56);// fonts for further use
    Font font2 = new Font("Courier New", Font.BOLD, 18);

    public TicTac()
    {
        labelN = new JLabel();
        labelN.setText("Play Ball!!!");
        panelC = new JPanel();
        panelS = new JPanel();
        panelC.setLayout(new java.awt.GridLayout(3, 3));
        ButtonObserver observer = new ButtonObserver();
        for (int i = 0; i < 9; i++)// every other button
        {
            if (i < 10)
            {
                b[i] = new JButton("");
                b[i].setEnabled(true);
            }
            panelC.add(b[i]);
            b[i].addActionListener(observer);
            b[i].setFont(font1);
        }
        b[9] = new JButton("New Game");// new game
        b[9].setEnabled(true);
        panelS.add(b[9]);
        b[9].addActionListener(observer);
        b[9].setFont(font2);
        Container contentPane = getContentPane();// creating content pane
        contentPane.add(labelN, "North");// content pane holding my label and 2 panels
        contentPane.add(panelC, "Center");
        contentPane.add(panelS, "South");
    }

    private void FindWhoseTurn()
    {
        if (WhoseTurn.equalsIgnoreCase("X"))
        {
            WhoseTurn = "O";
            labelN.setText("O's turn");
        } else
        {
            WhoseTurn = "X";
            labelN.setText("X's turn");
        }
    }

    private void xwins()
    {
        labelN.setText("X Wins!");
        for (int i = 0; i < 9; i++)
        {
            b[i].setEnabled(false);
        }

    }

    private void owins()
    {
        labelN.setText("O Wins!");
        for (int i = 0; i < 9; i++)
        {
            b[i].setEnabled(false);
        }
    }

    private void resetGame()// method to be used with new game
    {
        for (int i = 0; i < 9; i++)
        {
            if (i < 10)
            {
                b[i].setText("");
                b[i].setEnabled(true);
            }

        }
    }

    private void FindWinner()// complete cancer
    {
        if (b[0].getText().equals("X") && b[1].getText().equals("X") && b[2].getText().equals("X")// conditions for x
                || b[3].getText().equals("X") && b[4].getText().equals("X") && b[5].getText().equals("X")
                || b[6].getText().equals("X") && b[7].getText().equals("X") && b[8].getText().equals("X")
                || b[0].getText().equals("X") && b[3].getText().equals("X") && b[6].getText().equals("X")
                || b[1].getText().equals("X") && b[4].getText().equals("X") && b[7].getText().equals("X")
                || b[2].getText().equals("X") && b[5].getText().equals("X") && b[8].getText().equals("X")
                || b[6].getText().equals("X") && b[4].getText().equals("X") && b[2].getText().equals("X")
                || b[0].getText().equals("X") && b[4].getText().equals("X") && b[8].getText().equals("X"))
        {
            xwins();
        } else if (b[0].getText().equals("O") && b[1].getText().equals("O") && b[2].getText().equals("O")// conditions for o
                || b[3].getText().equals("O") && b[4].getText().equals("O") && b[5].getText().equals("O")
                || b[6].getText().equals("O") && b[7].getText().equals("O") && b[8].getText().equals("O")
                || b[0].getText().equals("O") && b[3].getText().equals("O") && b[6].getText().equals("O")
                || b[1].getText().equals("O") && b[4].getText().equals("O") && b[7].getText().equals("O")
                || b[2].getText().equals("O") && b[5].getText().equals("O") && b[8].getText().equals("O")
                || b[6].getText().equals("O") && b[4].getText().equals("O") && b[2].getText().equals("O")
                || b[0].getText().equals("O") && b[4].getText().equals("O") && b[8].getText().equals("O"))
        {
            owins();
        } else if (!b[0].getText().equals("") && !b[1].getText().equals("") && !b[2].getText().equals("")// conditions for tie
                && !b[3].getText().equals("") && !b[4].getText().equals("") && !b[5].getText().equals("")
                && !b[6].getText().equals("") && !b[7].getText().equals("") && !b[8].getText().equals(""))
        {
            labelN.setText("Tie Game... No one wins");
            for (int i = 0; i < 8; i++)
            {
                b[i].setEnabled(false);
            }
        }
    }

    private class ButtonObserver implements ActionListener// butt stuff
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();
            for (int i = 0; i < 9; i++)// for all other buttons
            {
                if (source == b[i])
                {
                    b[i].setText(WhoseTurn);
                    if (WhoseTurn.equalsIgnoreCase("X"))
                    {
                        b[i].setForeground(Color.red);
                    } else
                    {
                        b[i].setForeground(Color.blue);
                    }
                    b[i].setEnabled(false);
                    FindWhoseTurn();
                    FindWinner();
                } else if (source == b[9])// for new game
                {
                    resetGame();
                    WhoseTurn = "O";
                    labelN.setText("O's turn");
                }
            }
        }
    }
}
