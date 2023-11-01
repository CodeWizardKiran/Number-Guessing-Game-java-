import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuessingGame extends JFrame {
    private int targetNumber;
    private int currentPlayer;
    private JTextField guessField;
    private JTextArea gameLog;
    private JButton submitButton;
    private JLabel currentPlayerLabel;

    public GuessingGame() {
        setTitle("Two-Player Guessing Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        targetNumber = generateRandomNumber();
        currentPlayer = 1;

        currentPlayerLabel = new JLabel("Current Player: Player " + currentPlayer);
        guessField = new JTextField(10);
        submitButton = new JButton("Submit Guess");
        gameLog = new JTextArea(10, 30);
        gameLog.setEditable(false);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(guessField.getText());
                checkGuess(guess);
            }
        });

        setLayout(new FlowLayout());
        add(currentPlayerLabel);
        add(new JLabel("Enter your guess:"));
        add(guessField);
        add(submitButton);
        add(new JScrollPane(gameLog));

        setVisible(true);
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    private void checkGuess(int guess) {
        String guessResult = "Player " + currentPlayer + " guessed: " + guess + "\n";
        if (guess < targetNumber) {
            guessResult += "Too low! Try again.";
        } else if (guess > targetNumber) {
            guessResult += "Too high! Try again.";
        } else {
            guessResult += "Congratulations! Player " + currentPlayer + " guessed the correct number: " + targetNumber;
            submitButton.setEnabled(false);
        }
        gameLog.append(guessResult + "\n");

        currentPlayer = 3 - currentPlayer; // Switch players (1 -> 2, 2 -> 1)
        currentPlayerLabel.setText("Current Player: Player " + currentPlayer);
        guessField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessingGame();
            }
        });
    }
}
