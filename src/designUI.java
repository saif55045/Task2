import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public void designUI() {
    // Change button color scheme from blue to green
    JButton button = new JButton("Click me");
    button.setBackground(Color.GREEN);  // Changed from Color.BLUE to Color.GREEN
    
    // Adjust font size for buttons
    button.setFont(new Font("Arial", Font.PLAIN, 16));  // Example: Font size set to 16 for better visibility
    
    // Add other UI components and configurations
    // ...
}
