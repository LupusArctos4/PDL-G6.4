package guiGestionnaire;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;



public class Lot1GestionAbsences {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lot1GestionAbsences window = new Lot1GestionAbsences();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lot1GestionAbsences() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Gestion des absences Lot1");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnNewButton = new JButton("Gestion absence professeur");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 30, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lot1GestionAbsenceProfesseur gestAbsEns = new Lot1GestionAbsenceProfesseur();
		        frame.dispose();
		        gestAbsEns.main(null);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Gestion absence etudiant");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 113, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -33, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("HOME");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 41, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -27, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Lot1Gestionnaire.main(null);
			}
		});
	}

}
