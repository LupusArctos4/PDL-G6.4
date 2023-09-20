package guiGestionnaire;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class MAJListeAbs {

	private JFrame mainFrame;
	private JTextField nomEtuField;
	private JTextField prenomEtuField;
	private JTextField quotaField;
	private JTextField numAbsField;
	private JComboBox listAbsBox;
	private JButton buttonHome;
	private JLabel prenomEtuLabel;
	private JLabel nomEtuLabel;
	private JLabel quotaLabel;
	private JLabel listAbsLabel;
	private JLabel numAbsLabel;
	private JButton buttonAbsJustifee;
	private JButton buttonAbsNONJustifee;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAJListeAbs window = new MAJListeAbs();
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
	public MAJListeAbs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Mise a jour liste des absences d'un etudiant");
		mainFrame.setBounds(100, 100, 550, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{54, 51, 20, 230, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 19, 21, 19, 21, 21, 24, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		nomEtuLabel = new JLabel("Nom etudiant :");
		GridBagConstraints gridNomEtuLabel = new GridBagConstraints();
		gridNomEtuLabel.fill = GridBagConstraints.BOTH;
		gridNomEtuLabel.insets = new Insets(0, 0, 5, 5);
		gridNomEtuLabel.gridx = 2;
		gridNomEtuLabel.gridy = 1;
		mainFrame.getContentPane().add(nomEtuLabel, gridNomEtuLabel);
		
		nomEtuField = new JTextField();
		GridBagConstraints gridNomEtuField = new GridBagConstraints();
		gridNomEtuField.fill = GridBagConstraints.BOTH;
		gridNomEtuField.insets = new Insets(0, 0, 5, 5);
		gridNomEtuField.gridx = 3;
		gridNomEtuField.gridy = 1;
		mainFrame.getContentPane().add(nomEtuField, gridNomEtuField);
		nomEtuField.setColumns(10);
		
		prenomEtuLabel = new JLabel("Prenom etudiant :");
		GridBagConstraints gridPrenomEtuLabel = new GridBagConstraints();
		gridPrenomEtuLabel.fill = GridBagConstraints.BOTH;
		gridPrenomEtuLabel.insets = new Insets(0, 0, 5, 5);
		gridPrenomEtuLabel.gridx = 2;
		gridPrenomEtuLabel.gridy = 2;
		mainFrame.getContentPane().add(prenomEtuLabel, gridPrenomEtuLabel);
		
		prenomEtuField = new JTextField();
		GridBagConstraints gridPrenomEtuField = new GridBagConstraints();
		gridPrenomEtuField.fill = GridBagConstraints.BOTH;
		gridPrenomEtuField.insets = new Insets(0, 0, 5, 5);
		gridPrenomEtuField.gridx = 3;
		gridPrenomEtuField.gridy = 2;
		mainFrame.getContentPane().add(prenomEtuField, gridPrenomEtuField);
		prenomEtuField.setColumns(10);
		
		listAbsLabel = new JLabel("Liste des absences :");
		GridBagConstraints gridListAbsLabel = new GridBagConstraints();
		gridListAbsLabel.fill = GridBagConstraints.BOTH;
		gridListAbsLabel.insets = new Insets(0, 0, 5, 5);
		gridListAbsLabel.gridx = 2;
		gridListAbsLabel.gridy = 3;
		mainFrame.getContentPane().add(listAbsLabel, gridListAbsLabel);
		
		listAbsBox = new JComboBox();
		GridBagConstraints gridListAbsBox = new GridBagConstraints();
		gridListAbsBox.fill = GridBagConstraints.BOTH;
		gridListAbsBox.insets = new Insets(0, 0, 5, 5);
		gridListAbsBox.gridx = 3;
		gridListAbsBox.gridy = 3;
		mainFrame.getContentPane().add(listAbsBox, gridListAbsBox);
		
		numAbsLabel = new JLabel("Numero de l'absence :");
		GridBagConstraints gridNumAbsLabel = new GridBagConstraints();
		gridNumAbsLabel.fill = GridBagConstraints.BOTH;
		gridNumAbsLabel.insets = new Insets(0, 0, 5, 5);
		gridNumAbsLabel.gridx = 2;
		gridNumAbsLabel.gridy = 4;
		mainFrame.getContentPane().add(numAbsLabel, gridNumAbsLabel);
		
		numAbsField = new JTextField();
		GridBagConstraints gridNumAbsField = new GridBagConstraints();
		gridNumAbsField.fill = GridBagConstraints.BOTH;
		gridNumAbsField.insets = new Insets(0, 0, 5, 5);
		gridNumAbsField.gridx = 3;
		gridNumAbsField.gridy = 4;
		mainFrame.getContentPane().add(numAbsField, gridNumAbsField);
		numAbsField.setColumns(10);
		
		buttonAbsJustifee = new JButton("Absence justifiee");
		GridBagConstraints gridButtonAbsJustifee = new GridBagConstraints();
		gridButtonAbsJustifee.fill = GridBagConstraints.BOTH;
		gridButtonAbsJustifee.insets = new Insets(0, 0, 5, 5);
		gridButtonAbsJustifee.gridx = 3;
		gridButtonAbsJustifee.gridy = 5;
		mainFrame.getContentPane().add(buttonAbsJustifee, gridButtonAbsJustifee);
		
		buttonAbsNONJustifee = new JButton("Absence non justifiee");
		GridBagConstraints gridButtonAbsNONJustifee = new GridBagConstraints();
		gridButtonAbsNONJustifee.fill = GridBagConstraints.BOTH;
		gridButtonAbsNONJustifee.insets = new Insets(0, 0, 5, 5);
		gridButtonAbsNONJustifee.gridx = 3;
		gridButtonAbsNONJustifee.gridy = 6;
		mainFrame.getContentPane().add(buttonAbsNONJustifee, gridButtonAbsNONJustifee);
		
		quotaLabel = new JLabel("Quota :");
		GridBagConstraints gridQuotaLabel = new GridBagConstraints();
		gridQuotaLabel.fill = GridBagConstraints.BOTH;
		gridQuotaLabel.insets = new Insets(0, 0, 5, 5);
		gridQuotaLabel.gridx = 2;
		gridQuotaLabel.gridy = 7;
		mainFrame.getContentPane().add(quotaLabel, gridQuotaLabel);
		
		quotaField = new JTextField();
		quotaField.setEditable(false);
		quotaField.setEnabled(false);
		GridBagConstraints gridQuotaField = new GridBagConstraints();
		gridQuotaField.anchor = GridBagConstraints.NORTH;
		gridQuotaField.fill = GridBagConstraints.HORIZONTAL;
		gridQuotaField.insets = new Insets(0, 0, 5, 5);
		gridQuotaField.gridx = 3;
		gridQuotaField.gridy = 7;
		mainFrame.getContentPane().add(quotaField, gridQuotaField);
		quotaField.setColumns(10);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				GestionnaireGUI.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.fill = GridBagConstraints.BOTH;
		gridButtonHome.insets = new Insets(0, 0, 0, 5);
		gridButtonHome.gridx = 1;
		gridButtonHome.gridy = 9;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
	}

}
