package guiEtudiant;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import model.*;
import gui.*;

public class AbsenceGUI {

	private JFrame mainFrame;
	private JTextField dateField;
	private JTextField nomField;
	private JLabel nomLabel;
	private JLabel dateLabel;
	private JButton buttonJustifier;
	private JButton buttonRetour;
	private JButton buttonHome;
	
	EtudiantGUI etuGUI = new EtudiantGUI();
	ConnectionGUI conGUI = new ConnectionGUI();
	private Absence absence = new Absence();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbsenceGUI window = new AbsenceGUI();
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
	public AbsenceGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Absence");
		mainFrame.setBounds(100, 100, 550, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{56, 63, 253, 71, 0};
		gridBagLayout.rowHeights = new int[]{56, 20, 0, 31, 20, 42, 33, 40, 21, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		nomLabel = new JLabel("Nom de l'absence :");
		GridBagConstraints gridNomLabel = new GridBagConstraints();
		gridNomLabel.fill = GridBagConstraints.BOTH;
		gridNomLabel.insets = new Insets(0, 0, 5, 5);
		gridNomLabel.gridx = 1;
		gridNomLabel.gridy = 2;
		mainFrame.getContentPane().add(nomLabel, gridNomLabel);
		
		nomField = new JTextField();
		GridBagConstraints gridNomField = new GridBagConstraints();
		gridNomField.fill = GridBagConstraints.BOTH;
		gridNomField.insets = new Insets(0, 0, 5, 5);
		gridNomField.gridx = 2;
		gridNomField.gridy = 2;
		mainFrame.getContentPane().add(nomField, gridNomField);
		nomField.setColumns(10);
		
		buttonJustifier = new JButton("Justifier");
		buttonJustifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				absence.setSA(conGUI.getSuperAdmin());
				absence.setNomAbs(nomField.getText());
				absence.setDateAbs(dateField.getText());
				JustifierAbsenceGUI justifierAbsGUI = new JustifierAbsenceGUI();
				mainFrame.dispose();
		        justifierAbsGUI.main(null);
			}
		});
		GridBagConstraints gridButtonJustifier = new GridBagConstraints();
		gridButtonJustifier.fill = GridBagConstraints.BOTH;
		gridButtonJustifier.insets = new Insets(0, 0, 5, 0);
		gridButtonJustifier.gridx = 3;
		gridButtonJustifier.gridy = 3;
		mainFrame.getContentPane().add(buttonJustifier, gridButtonJustifier);
		
		dateLabel = new JLabel("Date :");
		GridBagConstraints gridDateLabel = new GridBagConstraints();
		gridDateLabel.fill = GridBagConstraints.BOTH;
		gridDateLabel.insets = new Insets(0, 0, 5, 5);
		gridDateLabel.gridx = 1;
		gridDateLabel.gridy = 4;
		mainFrame.getContentPane().add(dateLabel, gridDateLabel);
		
		dateField = new JTextField();
		GridBagConstraints gridDateField = new GridBagConstraints();
		gridDateField.fill = GridBagConstraints.BOTH;
		gridDateField.insets = new Insets(0, 0, 5, 5);
		gridDateField.gridx = 2;
		gridDateField.gridy = 4;
		mainFrame.getContentPane().add(dateField, gridDateField);
		dateField.setColumns(10);
		
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
		gridButtonRetour.insets = new Insets(0, 0, 5, 0);
		gridButtonRetour.gridx = 3;
		gridButtonRetour.gridy = 7;
		mainFrame.getContentPane().add(buttonRetour, gridButtonRetour);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				etuGUI.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.fill = GridBagConstraints.BOTH;
		gridButtonHome.insets = new Insets(0, 0, 5, 5);
		gridButtonHome.gridx = 1;
		gridButtonHome.gridy = 7;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
	}
	
	
	/**
	 * GETTER
	 */
	public Absence getAbs() {
		return absence;
	}
}
