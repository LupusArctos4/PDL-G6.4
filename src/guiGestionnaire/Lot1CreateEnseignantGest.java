package guiGestionnaire;

import java.awt.EventQueue;


import dao.*;
import model.Enseignant;

import java.awt.GridLayout;
import javax.swing.*;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;


public class Lot1CreateEnseignantGest {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lot1CreateEnseignantGest window = new Lot1CreateEnseignantGest();
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
	public Lot1CreateEnseignantGest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Lot 1 Create Enseignant");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prenom");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Numero de telephone");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 1;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Matiere enseignee");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 2;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 2;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 2;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Ajouter enseignant");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 4;
		frame.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_1.getText().length() > 0) {
					String nom = textField_1.getText();
					String prenom = textField_2.getText();
					String numTel = textField_3.getText();
					String matiere = textField.getText();
					String login = nom.toLowerCase() + "." + prenom.toLowerCase();
					String pass = "ens" + numTel;
					int absence = 0;
					addLot1Ens(login, pass, Enseignant.utilEns, nom, prenom, numTel, matiere, absence);
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Une erreur est survenue !", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JButton btnNewButton = new JButton("HOME");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 4;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Lot1Gestionnaire.main(null);
			}
		});
		
		JButton btnNewButton_2 = new JButton("Modifier enseignant");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 4;
		frame.getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Supprimer enseignant");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 4;
		frame.getContentPane().add(btnNewButton_3, gbc_btnNewButton_3);
		// supprimer un enseignant
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
				if (textField_1.getText().length() > 0) {
					String nom = textField_1.getText();
					String prenom = textField_2.getText();
					String numTel = textField_3.getText();
					String loginAuth = nom.toLowerCase() + "." + prenom.toLowerCase();
					String passAuth = "ens" + numTel;
					delEnseignant(loginAuth,passAuth);
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Une erreur est survenue !", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
	/**
	 * Ajoute un enseignant
	 * @param login
	 * @param pass
	 * @param utilEns
	 * @param nom
	 * @param prenom
	 * @param numTelProf
	 * @param matiere
	 * @param absence
	 */
	public void addLot1Ens(String login, String pass, int utilEns, String nom, String prenom, String numTelProf, String matiere, int absence) {
		// on recupere le fournisseur en BDD
		Lot1EnseignantDAO ensDAO = new Lot1EnseignantDAO();
		Enseignant lot1Enseignant = new Enseignant(login, pass, utilEns, nom, prenom, numTelProf, matiere, absence);
		int ens = ensDAO.addLot1Enseignant(lot1Enseignant);

		if (ens == 0) {
			JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de l\'ajout de l\'enseignant.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(new JFrame(), "L\'enseignant a bien ete ajoute.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	/**
	 * CETTE FONCTIONNALITE N'EST PAS DISPONIBLE
	 * @param loginAuth
	 */
	public void delEnseignant(String loginAuth, String passAuth) {
		Lot1EnseignantDAO ensDAO = new Lot1EnseignantDAO();
		int ens = ensDAO.delete(loginAuth,passAuth);
		
		if (ens == 0) {
			JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de la suppression de l\'enseignant.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(new JFrame(), "L\'enseignant a bien ete supprime.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
