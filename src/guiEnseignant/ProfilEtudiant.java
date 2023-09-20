package guiEnseignant;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.SpringLayout;
import java.awt.event.*;

public class ProfilEtudiant {

	private JFrame mainFrame;
	private JTextField nbrAbsField;
	private JTextField prenomField;
	private JTextField nomField;
	private JLabel nomLabel;
	private JLabel prenomLabel;
	private JLabel nbrAbsLabel;
	private JButton buttonAbsence1;
	private JButton buttonAbsence2;
	private JButton buttonHome;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfilEtudiant window = new ProfilEtudiant();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProfilEtudiant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Profil etudiant");
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		mainFrame.getContentPane().setLayout(springLayout);
		
		nomLabel = new JLabel("Nom etudiant :");
		mainFrame.getContentPane().add(nomLabel);
		
		prenomLabel = new JLabel("Prenom etudiant :");
		springLayout.putConstraint(SpringLayout.WEST, prenomLabel, 22, SpringLayout.WEST, mainFrame.getContentPane());
		mainFrame.getContentPane().add(prenomLabel);
		
		nbrAbsLabel = new JLabel("Nombre absences :");
		springLayout.putConstraint(SpringLayout.EAST, nomLabel, 0, SpringLayout.EAST, nbrAbsLabel);
		springLayout.putConstraint(SpringLayout.WEST, nbrAbsLabel, 15, SpringLayout.WEST, mainFrame.getContentPane());
		mainFrame.getContentPane().add(nbrAbsLabel);
		
		nomField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, nomLabel, 3, SpringLayout.NORTH, nomField);
		springLayout.putConstraint(SpringLayout.NORTH, nomField, 51, SpringLayout.NORTH, mainFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, nomField, 131, SpringLayout.WEST, mainFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, nomField, -21, SpringLayout.EAST, mainFrame.getContentPane());
		mainFrame.getContentPane().add(nomField);
		nomField.setColumns(10);
		
		buttonAbsence1 = new JButton("Absence 1");
		springLayout.putConstraint(SpringLayout.WEST, buttonAbsence1, 12, SpringLayout.WEST, mainFrame.getContentPane());
		mainFrame.getContentPane().add(buttonAbsence1);
		
		prenomField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, prenomLabel, 3, SpringLayout.NORTH, prenomField);
		springLayout.putConstraint(SpringLayout.NORTH, prenomField, 5, SpringLayout.SOUTH, nomField);
		springLayout.putConstraint(SpringLayout.WEST, prenomField, 0, SpringLayout.WEST, nomField);
		springLayout.putConstraint(SpringLayout.EAST, prenomField, 0, SpringLayout.EAST, nomField);
		mainFrame.getContentPane().add(prenomField);
		prenomField.setColumns(10);
		
		buttonAbsence2 = new JButton("Absence 2");
		springLayout.putConstraint(SpringLayout.WEST, buttonAbsence2, 12, SpringLayout.WEST, mainFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonAbsence1, -15, SpringLayout.NORTH, buttonAbsence2);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonAbsence2, -55, SpringLayout.SOUTH, mainFrame.getContentPane());
		mainFrame.getContentPane().add(buttonAbsence2);
		
		nbrAbsField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, nbrAbsLabel, 3, SpringLayout.NORTH, nbrAbsField);
		springLayout.putConstraint(SpringLayout.WEST, nbrAbsField, 0, SpringLayout.WEST, nomField);
		springLayout.putConstraint(SpringLayout.NORTH, nbrAbsField, 104, SpringLayout.NORTH, mainFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, nbrAbsField, 413, SpringLayout.WEST, mainFrame.getContentPane());
		mainFrame.getContentPane().add(nbrAbsField);
		nbrAbsField.setColumns(10);
		
		buttonHome = new JButton("HOME");
		springLayout.putConstraint(SpringLayout.WEST, buttonHome, 0, SpringLayout.WEST, nbrAbsLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonHome, -10, SpringLayout.SOUTH, mainFrame.getContentPane());
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnseignantGUI ens = new EnseignantGUI();
				mainFrame.dispose();
		        ens.main(null);
			}
		});
		mainFrame.getContentPane().add(buttonHome);
	}

}
