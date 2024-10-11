import javax.swing.*;
import java.awt.*;

public class designUI {

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Enhanced UI Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Call designUI method to set up the UI
        designUI(frame);

        // Set frame visibility
        frame.setVisible(true);
    }

    public static void designUI(JFrame frame) {
        // Create a panel to hold the buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, with spacing

        // Define font for buttons
        Font buttonFont = new Font("Arial", Font.PLAIN, 16);

        // Create buttons with different color schemes
        JButton btnGreen = new JButton("Green");
        btnGreen.setBackground(Color.GREEN);
        btnGreen.setForeground(Color.WHITE);
        btnGreen.setFont(buttonFont);

        JButton btnRed = new JButton("Red");
        btnRed.setBackground(Color.RED);
        btnRed.setForeground(Color.WHITE);
        btnRed.setFont(buttonFont);

        JButton btnBlue = new JButton("Blue");
        btnBlue.setBackground(Color.BLUE);
        btnBlue.setForeground(Color.WHITE);
        btnBlue.setFont(buttonFont);

        JButton btnYellow = new JButton("Yellow");
        btnYellow.setBackground(Color.YELLOW);
        btnYellow.setForeground(Color.BLACK);
        btnYellow.setFont(buttonFont);

        JButton btnCyan = new JButton("Cyan");
        btnCyan.setBackground(Color.CYAN);
        btnCyan.setForeground(Color.BLACK);
        btnCyan.setFont(buttonFont);

        JButton btnMagenta = new JButton("Magenta");
        btnMagenta.setBackground(Color.MAGENTA);
        btnMagenta.setForeground(Color.WHITE);
        btnMagenta.setFont(buttonFont);

        // Add buttons to the panel
        panel.add(btnGreen);
        panel.add(btnRed);
        panel.add(btnBlue);
        panel.add(btnYellow);
        panel.add(btnCyan);
        panel.add(btnMagenta);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);
    }
}