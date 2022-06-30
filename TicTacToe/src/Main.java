
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new TicTac();

        frame.setSize(500, 500);
        frame.setLocation(500, 100);
        frame.setTitle("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
