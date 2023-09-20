/**
 * 
 */
package gui;


import javax.swing.*;
import java.awt.event.*;

public class test2 extends JFrame {
    
    private JTextField loginField;
    private JPasswordField passField;
    
    public test2() {
        // Set window properties
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create UI components
        JLabel loginLabel = new JLabel("Login:");
        JLabel passLabel = new JLabel("Password:");
        loginField = new JTextField(20);
        passField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        
        // Create panel and add components to it
        JPanel panel = new JPanel();
        panel.add(loginLabel);
        panel.add(loginField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        
        // Add panel to window
        add(panel);
        
        // Set action for login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                String pass = new String(passField.getPassword());
                
                // Check if login and password are correct
                if (login.equals("gest") && pass.equals("covid")) {
                    // Close login window and open new window
                    dispose();
                    new MainWindow().setVisible(true);
                } else {
                    // Show error message
                    JOptionPane.showMessageDialog(test2.this, "Invalid login or password.");
                }
            }
        });
    }
    
    public static void main(String[] args) {
        // Create and show login window
        test2 loginWindow = new test2();
        loginWindow.setVisible(true);
    }
}

/*
 * class MainWindow extends JFrame {
 * 
 * public MainWindow() { // Set window properties setTitle("Main"); setSize(300,
 * 150); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * 
 * // Create UI components JLabel welcomeLabel = new JLabel("Welcome!");
 * 
 * // Create panel and add components to it JPanel panel = new JPanel();
 * panel.add(welcomeLabel);
 * 
 * // Add panel to window add(panel); } }
 */


/**
 * fonction de test pour afficher une fenetre de test
 * @author faucq
 *
 */
class MainWindow extends JFrame{
	public MainWindow() {
		// Set window properties
        setTitle("Main");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create UI components
        JLabel welcomeLabel = new JLabel("Welcome!");
        
        // Create panel and add components to it
        JPanel panel = new JPanel();
        panel.add(welcomeLabel);
        
        // Add panel to window
        add(panel);
	}
}
