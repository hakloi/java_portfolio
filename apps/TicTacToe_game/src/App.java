import javax.swing.*; //мультиплатформенность
import java.awt.*; //abstract window toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JButton[][] buttons; // matrix
    private boolean xTurn;
    private ImageIcon xIcon = new ImageIcon("..//apps//TicTacToe_game//cat.jpg");
    // private ImageIcon oIcon = new ImageIcon("path/to/oImage.jpg");

    public App() {
        super("Cats & kittens"); // наследование от JFrame (заголовок)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null); // null - в середине
    
        xTurn = true;
        buttons = new JButton[3][3];
        JPanel panel = new JPanel(new GridLayout(4, 3));
        
        for (int i=0; i<3; i++){
            for (int j =0; j <3; j++){
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(50, 50));
                button.addActionListener(new ButtonListener(i, j));
                buttons[i][j] = button;
                // panel.setBackground(Color.WHITE);
                panel.add(button);
            }
        }
        add(panel);
        setVisible(true);
    }

    private void makeMove(int row, int col) {
        buttons[row][col].setText(xTurn ? "X" : "O");
        buttons[row][col].setEnabled(false);
        xTurn = !xTurn;
    }

    private class ButtonListener implements ActionListener {
        private int row;
        private int col;

        public ButtonListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            makeMove(row, col);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App();
        });
    }
}