package gui;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.BorderLayout;

public class InitialisationWindowBuilder {

	private JFrame mainF;
	private JTextField textField;

	public InitialisationWindowBuilder() {
		initialize();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitialisationWindowBuilder window = new InitialisationWindowBuilder();
					window.mainF.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void initialize() {
		
		mainF = new JFrame("test");
		mainF.setBounds(100, 100, 629, 381);
		mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
