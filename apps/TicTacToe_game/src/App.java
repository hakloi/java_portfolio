import javax.swing.*; //мультиплатформенность
import java.awt.*; //abstract window toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JButton[][] buttons; // matrix
    private JButton restartButton;
    private JLabel statusLabel;
    private boolean xTurn;
    private ImageIcon xIcon = new ImageIcon("../TicTacToe_game/images/cat.png");
    private ImageIcon oIcon = new ImageIcon("../TicTacToe_game/images/kitten.png");
    ImageIcon logo = new ImageIcon("../TicTacToe_game/images/logo.png");

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
        statusLabel.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(statusLabel);
        setVisible(true);
    }
    // game logic
    private void makeMove(int row, int col, ImageIcon xIcon, ImageIcon oIcon) {
        buttons[row][col].setIcon(xTurn ? xIcon : oIcon);
        buttons[row][col].setEnabled(false);
        xTurn = !xTurn;
        if (checkWin()) { //закончилась ли игра
            statusLabel.setText((xTurn ? "Cats" : "Kittens") + " win!");
        } else if (checkDraw()) {
            statusLabel.setText("Draw! Cats and kittens have made peace");
        } else {
            statusLabel.setText(xTurn ? "Cat's Turn" : "Kitten's Turn");
        }
    }

    private boolean checkDraw(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                if (buttons[i][j].isEnabled()) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean checkWin() {
        // горизонталь
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getIcon() != null &&
                    buttons[i][0].getIcon().equals(buttons[i][1].getIcon()) &&
                    buttons[i][1].getIcon().equals(buttons[i][2].getIcon())) {
                disableButtons();
                return true;
            }
        }
        // вертикаль
        for (int i = 0; i < 3; i++) {
            if (buttons[0][i].getIcon() != null &&
                    buttons[0][i].getIcon().equals(buttons[1][i].getIcon()) &&
                    buttons[1][i].getIcon().equals(buttons[2][i].getIcon())) {
                disableButtons();
                return true;
            }
        }
        // диагональ
        if (buttons[0][0].getIcon() != null &&
                buttons[0][0].getIcon().equals(buttons[1][1].getIcon()) &&
                buttons[1][1].getIcon().equals(buttons[2][2].getIcon())) {
            disableButtons();
            return true;
        }
        if (buttons[0][2].getIcon() != null &&
                buttons[0][2].getIcon().equals(buttons[1][1].getIcon()) &&
                buttons[1][1].getIcon().equals(buttons[2][0].getIcon())) {
            disableButtons();
            return true;
        }
        return false;
    }
    // buttons main & optional
    private class ButtonListener implements ActionListener {
        private int row;
        private int col;

        public ButtonListener(int row2, int col) {
            this.row = row2;
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
            for (int i =0; i<3; i++){
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