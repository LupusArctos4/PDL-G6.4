package guiGestionnaire;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;


public class MajAbsEtudiantGest {

	private JFrame mainFrame;
	private JTextField nomPrenomField;
	private JTextField numAbsenceField;
	private JLabel nomPrenomLabel;
	private JLabel numAbsLabel;
	private JLabel quotaLabel;
	private JButton buttonListAbs ;
	private JButton buttonAbsJustifiee;
	private JButton buttonAbsNONJustifiee;
	private JButton buttonHome;
	
	
	GestionnaireGUI gestGUI = new GestionnaireGUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MajAbsEtudiantGest window = new MajAbsEtudiantGest();
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
	public MajAbsEtudiantGest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Mettre a jour la liste des absences");
		mainFrame.setBounds(100, 100, 600, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		nomPrenomLabel = new JLabel("Nom Prenom");
		GridBagConstraints gridNomPrenomLabel = new GridBagConstraints();
		gridNomPrenomLabel.insets = new Insets(0, 0, 5, 5);
		gridNomPrenomLabel.gridx = 1;
		gridNomPrenomLabel.gridy = 4;
		mainFrame.getContentPane().add(nomPrenomLabel, gridNomPrenomLabel);
		
		numAbsLabel = new JLabel("Numero de l'absence");
		GridBagConstraints gridumAbsLabel = new GridBagConstraints();
		gridumAbsLabel.insets = new Insets(0, 0, 5, 5);
		gridumAbsLabel.gridx = 4;
		gridumAbsLabel.gridy = 4;
		mainFrame.getContentPane().add(numAbsLabel, gridumAbsLabel);
		
		quotaLabel = new JLabel("Quota");
		GridBagConstraints gridQuotaLabel = new GridBagConstraints();
		gridQuotaLabel.insets = new Insets(0, 0, 5, 5);
		gridQuotaLabel.gridx = 6;
		gridQuotaLabel.gridy = 4;
		mainFrame.getContentPane().add(quotaLabel, gridQuotaLabel);
		
		nomPrenomField = new JTextField();
		GridBagConstraints gridNomPrenomField = new GridBagConstraints();
		gridNomPrenomField.insets = new Insets(0, 0, 5, 5);
		gridNomPrenomField.fill = GridBagConstraints.HORIZONTAL;
		gridNomPrenomField.gridx = 1;
		gridNomPrenomField.gridy = 5;
		mainFrame.getContentPane().add(nomPrenomField, gridNomPrenomField);
		nomPrenomField.setColumns(10);
		
		numAbsenceField = new JTextField();
		GridBagConstraints gridNumAbsenceField = new GridBagConstraints();
		gridNumAbsenceField.insets = new Insets(0, 0, 5, 5);
		gridNumAbsenceField.fill = GridBagConstraints.HORIZONTAL;
		gridNumAbsenceField.gridx = 4;
		gridNumAbsenceField.gridy = 5;
		mainFrame.getContentPane().add(numAbsenceField, gridNumAbsenceField);
		numAbsenceField.setColumns(10);
		
		buttonListAbs = new JButton("Liste des Absences");
		GridBagConstraints gridButtonListAbs = new GridBagConstraints();
		gridButtonListAbs.fill = GridBagConstraints.HORIZONTAL;
		gridButtonListAbs.insets = new Insets(0, 0, 5, 5);
		gridButtonListAbs.gridx = 1;
		gridButtonListAbs.gridy = 7;
		mainFrame.getContentPane().add(buttonListAbs, gridButtonListAbs);
		
		buttonAbsJustifiee = new JButton("Absence Justifiee");
		GridBagConstraints gridButtonAbsJustifiee = new GridBagConstraints();
		gridButtonAbsJustifiee.fill = GridBagConstraints.HORIZONTAL;
		gridButtonAbsJustifiee.insets = new Insets(0, 0, 5, 5);
		gridButtonAbsJustifiee.gridx = 4;
		gridButtonAbsJustifiee.gridy = 7;
		mainFrame.getContentPane().add(buttonAbsJustifiee, gridButtonAbsJustifiee);
		
		buttonAbsNONJustifiee = new JButton("Absence NON Justifiee");
		GridBagConstraints gridButtonAbsNONJustifiee = new GridBagConstraints();
		gridButtonAbsNONJustifiee.fill = GridBagConstraints.HORIZONTAL;
		gridButtonAbsNONJustifiee.insets = new Insets(0, 0, 5, 5);
		gridButtonAbsNONJustifiee.gridx = 4;
		gridButtonAbsNONJustifiee.gridy = 9;
		mainFrame.getContentPane().add(buttonAbsNONJustifiee, gridButtonAbsNONJustifiee);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				gestGUI.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.insets = new Insets(0, 0, 0, 5);
		gridButtonHome.gridx = 1;
		gridButtonHome.gridy = 11;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
	}

}
