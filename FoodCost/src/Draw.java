
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Draw extends JFrame
{

    private final JLabel labelN, labelM, labelF, labelO, WARNING;
    private JTextField textFieldN, textFieldM, textFieldO;
    private final JPanel panelS, panelM;
    private JButton[] b = new JButton[3];
    Double foodDouble, drinkDouble, desertDouble, tipDouble, salesTax;
    String tip;

    public Draw()
    {

        WARNING = new JLabel("Be sure to hit the enter key after each entry");
        labelN = new JLabel("What is the price of the food?..");
        labelM = new JLabel("What is the price of the drink?..");
        labelO = new JLabel("WHat is the price of the desert?..");
        labelF = new JLabel();
        textFieldN = new JTextField(10);
        textFieldM = new JTextField(10);
        textFieldO = new JTextField(10);
        panelS = new JPanel();
        panelM = new JPanel();

        panelS.add(WARNING);
        panelS.add(labelN);
        panelS.add(textFieldN);
        panelS.add(labelM);
        panelS.add(textFieldM);
        panelS.add(labelO);
        panelS.add(textFieldO);
        panelS.add(labelF);

        panelS.setLayout(new java.awt.GridLayout(8, 1));
        panelM.setLayout(new java.awt.GridLayout(1, 3));

        ButtonObserver observer = new ButtonObserver();
        for (int i = 0; i < b.length; i++)
        {
            b[i] = new JButton(i + "%");
            //    b[i].setEnabled(false);    for nutsandbolts
            //  b[i].setVisible(false);
            panelM.add(b[i]);
            b[i].addActionListener(observer);

        }
        //   NutsAndBolts();
        textFieldN.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                String food = textFieldN.getText();
                foodDouble = Double.parseDouble(food);
            }

        });
        textFieldM.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String food = textFieldM.getText();
                drinkDouble = Double.parseDouble(food);
            }

        });
        textFieldO.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String food = textFieldO.getText();
                desertDouble = Double.parseDouble(food);
            }

        });

        Container contentPane = getContentPane();
        contentPane.add(panelS, "North");
        contentPane.add(panelM, "South");

        // for loop goes here
        b[0].setText("0.15");
        b[1].setText("0.20");
        b[2].setText("0.25");

    }

    /* public void NutsAndBolts()
    {// math stuff
        for (int i = 0; i < b.length; i++)
        {
            if (textFieldN.getText().isEmpty() == false&& 
                textFieldM.getText().isEmpty() == false && 
                textFieldO.getText().isEmpty() == false)
            {
                b[i].setEnabled(true);
                b[i].setVisible(true);
            }
         
        }
    }*/
    private class ButtonObserver implements ActionListener// button stuff
    {

        @Override
        public void actionPerformed(ActionEvent e)// gives button's life meaing 
        {

            Object source = e.getSource();
            for (int i = 0; i < b.length; i++)
            {
                // more button stuff
                if (source == b[i])
                {
                    b[i].setEnabled(false);
                    tip = b[i].getText();
                    tipDouble = Double.parseDouble(tip);
                    labelF.setEnabled(true);
                    DecimalFormat df = new DecimalFormat("###.##");
                    double meal = foodDouble + drinkDouble + desertDouble;
                    salesTax = meal * 0.10;
                    labelF.setText("The price of the food including the drink and desert is $"
                            + df.format(foodDouble) + ", the sales tax is $"
                            + df.format(salesTax) + ", the tip is $"
                            + df.format(tipDouble) + ". The entire meal cost $"
                            + df.format(meal + salesTax + tipDouble));
                }
                b[i].setEnabled(false);
            }
        }
    }
}
