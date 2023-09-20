package guiEtudiant;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import dao.*;
import model.*;

public class DeclarerAbsence {

	private JFrame mainFrame;
	private JTextField nomField;
	private JTextField dateField;
	private JLabel nomLabel;
	private JLabel dateLabel;
	private JLabel motifLabel;
	private JButton buttonPiecesJointes;
	private JButton buttonEnvoyer;
	private JButton buttonHome;
	private JButton buttonRetour;
	private JComboBox motifBox;
	
	
	EtudiantGUI etuGUI = new EtudiantGUI();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeclarerAbsence window = new DeclarerAbsence();
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
	public DeclarerAbsence() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Declarer une absence");
		mainFrame.setBounds(100, 100, 600, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{39, 32, 102, 175, 71, 0};
		gridBagLayout.rowHeights = new int[]{45, 19, 19, 20, 21, 30, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		nomLabel = new JLabel("Nom :");
		GridBagConstraints gridNomLabel = new GridBagConstraints();
		gridNomLabel.fill = GridBagConstraints.BOTH;
		gridNomLabel.insets = new Insets(0, 0, 5, 5);
		gridNomLabel.gridx = 2;
		gridNomLabel.gridy = 1;
		mainFrame.getContentPane().add(nomLabel, gridNomLabel);
		
		nomField = new JTextField();
		GridBagConstraints gridNomField = new GridBagConstraints();
		gridNomField.anchor = GridBagConstraints.NORTH;
		gridNomField.fill = GridBagConstraints.HORIZONTAL;
		gridNomField.insets = new Insets(0, 0, 5, 5);
		gridNomField.gridx = 3;
		gridNomField.gridy = 1;
		mainFrame.getContentPane().add(nomField, gridNomField);
		nomField.setColumns(10);
		
		dateLabel = new JLabel("Date :");
		GridBagConstraints gridDateLabel = new GridBagConstraints();
		gridDateLabel.fill = GridBagConstraints.BOTH;
		gridDateLabel.insets = new Insets(0, 0, 5, 5);
		gridDateLabel.gridx = 2;
		gridDateLabel.gridy = 2;
		mainFrame.getContentPane().add(dateLabel, gridDateLabel);
		
		dateField = new JTextField();
		GridBagConstraints gridDateField = new GridBagConstraints();
		gridDateField.anchor = GridBagConstraints.NORTH;
		gridDateField.fill = GridBagConstraints.HORIZONTAL;
		gridDateField.insets = new Insets(0, 0, 5, 5);
		gridDateField.gridx = 3;
		gridDateField.gridy = 2;
		mainFrame.getContentPane().add(dateField, gridDateField);
		dateField.setColumns(10);
		
		motifLabel = new JLabel("Motif / Type d'absence :");
		GridBagConstraints gridMotifLabel = new GridBagConstraints();
		gridMotifLabel.anchor = GridBagConstraints.EAST;
		gridMotifLabel.fill = GridBagConstraints.VERTICAL;
		gridMotifLabel.insets = new Insets(0, 0, 5, 5);
		gridMotifLabel.gridx = 2;
		gridMotifLabel.gridy = 3;
		mainFrame.getContentPane().add(motifLabel, gridMotifLabel);
		
		
		
		//RecupTypeAbsDAO rtDAO = new RecupTypeAbsDAO();
		//ArrayList<TypeAbsence> typeAbsList = rtDAO.recupTypeAbsence();
		//System.out.println(typeAbsList.get(0).getNomTypeAbs());
		ArrayList<String> typeAbsList = new ArrayList<>();
		typeAbsList.add("ERROR avec la recuperation BDD");
		motifBox = new JComboBox();
		/*
		 * permet d'ajouter dans la box
		 * motifBox.addItem("test");
		 * motifBox.addItem("test test");
		 * permet de récup dans la box et le print dans la console java
		 * System.out.println(motifBox.getSelectedItem());
		 */
		for (int i = 0; i<typeAbsList.size(); i++) {
			motifBox.addItem(typeAbsList.get(i));
		}
		GridBagConstraints gridMotifBox = new GridBagConstraints();
		gridMotifBox.insets = new Insets(0, 0, 5, 5);
		gridMotifBox.fill = GridBagConstraints.BOTH;
		gridMotifBox.gridx = 3;
		gridMotifBox.gridy = 3;
		mainFrame.getContentPane().add(motifBox, gridMotifBox);
		
		buttonPiecesJointes = new JButton("Pieces jointes");
		buttonPiecesJointes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
			}
		});
		GridBagConstraints gridButtonPiecesJointes = new GridBagConstraints();
		gridButtonPiecesJointes.fill = GridBagConstraints.BOTH;
		gridButtonPiecesJointes.insets = new Insets(0, 0, 5, 5);
		gridButtonPiecesJointes.gridx = 2;
		gridButtonPiecesJointes.gridy = 4;
		mainFrame.getContentPane().add(buttonPiecesJointes, gridButtonPiecesJointes);
				
		buttonEnvoyer = new JButton("Envoyer");
		buttonEnvoyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
			}
		});
		GridBagConstraints gridButtonEnvoyer = new GridBagConstraints();
		gridButtonEnvoyer.fill = GridBagConstraints.BOTH;
		gridButtonEnvoyer.insets = new Insets(0, 0, 5, 5);
		gridButtonEnvoyer.gridx = 2;
		gridButtonEnvoyer.gridy = 5;
		mainFrame.getContentPane().add(buttonEnvoyer, gridButtonEnvoyer);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				etuGUI.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.fill = GridBagConstraints.BOTH;
		gridButtonHome.insets = new Insets(0, 0, 0, 5);
		gridButtonHome.gridx = 1;
		gridButtonHome.gridy = 7;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
		
		buttonRetour = new JButton("RETOUR");
		buttonRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbsencesEtudiant absEtu = new AbsencesEtudiant();
				mainFrame.dispose();
		        absEtu.main(null);
			}
		});
		GridBagConstraints gridButtonRetour = new GridBagConstraints();
		gridButtonRetour.fill = GridBagConstraints.BOTH;
		gridButtonRetour.insets = new Insets(0, 0, 0, 5);
		gridButtonRetour.gridx = 3;
		gridButtonRetour.gridy = 7;
		mainFrame.getContentPane().add(buttonRetour, gridButtonRetour);
	}

}
