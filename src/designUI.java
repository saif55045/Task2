import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class designUI {

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Design UI Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Call designUI method to set up the UI
        designUI(frame);

        // Set frame visibility
        frame.setVisible(true);
    }

    public static void designUI(JFrame frame) {
        // Change button color scheme from blue to green
        JButton button = new JButton("Click me");
        button.setBackground(Color.GREEN);  // Changed from Color.BLUE to Color.GREEN

        // Adjust font size for buttons
        button.setFont(new Font("Arial", Font.PLAIN, 16));  // Example: Font size set to 16 for better visibility

        // Add button to frame
        frame.add(button);

        // Add other UI components and configurations
        // ...
    }
}
