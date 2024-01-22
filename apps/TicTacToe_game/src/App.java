import javax.swing.*; //мультиплатформенность
import java.awt.*; //abstract window toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JButton[][] buttons; // matrix
    private JButton restartButton;
    private JLabel statusLabel;
    private boolean xTurn;
    private ImageIcon xIcon = new ImageIcon("C:/Users/HP/Desktop/portfolio/java_portfolio/apps/TicTacToe_game/images/cat.png");
    private ImageIcon oIcon = new ImageIcon("C:/Users/HP/Desktop/portfolio/java_portfolio/apps/TicTacToe_game/images/kitten.png");
    ImageIcon logo = new ImageIcon("C:/Users/HP/Desktop/portfolio/java_portfolio/apps/TicTacToe_game/images/logo.png");

    public App() {
        super("Cats & kittens"); // наследование от JFrame (заголовок)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null); // null - в середине
        setIconImage(logo.getImage());
    
        xTurn = true;
        buttons = new JButton[3][3];
        JPanel panel = new JPanel(new GridLayout(4, 3));
        
        for (int i=0; i<3; i++){
            for (int j =0; j <3; j++){
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(50, 50));
                button.addActionListener(new ButtonListener(i, j));
                buttons[i][j] = button;
                panel.add(button);
            }
        }
        add(panel);

        restartButton = new JButton("Restart");
        restartButton.setPreferredSize(new Dimension(20, 20));
        restartButton.addActionListener(new RestartButtonListening());
        panel.add(restartButton);

        statusLabel = new JLabel("Cat's Turn");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setPreferredSize(new Dimension(100, 50));
        statusLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(statusLabel);
        setVisible(true);
    }

    // game logic
    private void makeMove(int row, int col, ImageIcon xIcon, ImageIcon oIcon) {
        buttons[row][col].setIcon(xTurn ? xIcon : oIcon);
        buttons[row][col].setEnabled(false);
        xTurn = !xTurn;
        checkWin();
    }

    private void checkWin(){
        for (int i = 0; i < 3;){
            //горизонтально
            if (buttons[i][0].getIcon() == buttons[i][1].getIcon() &&
            buttons[i][1].getIcon() == buttons[i][2].getIcon()  &&
            buttons[i][0].getIcon() !=  null);
            statusLabel.setText((xTurn ? "Cats" : "Kittens" ) + " win!");
            disableButtons();
            return;
        }
    }
    // buttons main & optional
    private class ButtonListener implements ActionListener {
        private int row;
        private int col;

        public ButtonListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            makeMove(row, col, xIcon,oIcon);
        }
    }

    private void disableButtons(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                buttons[i][j].setEnabled(false);
            }
        }
    }
    private class RestartButtonListening implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i =0; i<0; i++){
                for (int j= 0; j < 3; j++) {
                    buttons[i][j].setIcon(null);
                    buttons[i][j].setEnabled(true);
                }
            }
            
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App();
        });
    }
}