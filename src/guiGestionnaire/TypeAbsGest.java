package guiGestionnaire;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;;


public class TypeAbsGest {

	private JFrame mainFrame;
	private JTextField typeAbsField;
	private JTextField quotaField;
	private JTextField penaliteField;
	private JTextField filiereField;
	private JLabel typeAbsLabel;
	private JLabel quotaLabel;
	private JLabel penaliteLabel;
	private JLabel filiereLabel;
	private JButton buttonAddTypeAbs;
	private JButton buttonUpdateTypeAbs;
	private JButton buttonDeleteTypeAbs;
	private JButton buttonAddQuota;
	private JButton buttonHome;
	private JButton buttonUpdateQuota;
	
	
	GestionnaireGUI gestGUI = new GestionnaireGUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TypeAbsGest window = new TypeAbsGest();
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
	public TypeAbsGest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Creer un Type d'absence");
		mainFrame.setBounds(100, 100, 800, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 199, -29, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		typeAbsLabel = new JLabel("Type d'absence");
		GridBagConstraints gridTypeAbsLabel = new GridBagConstraints();
		gridTypeAbsLabel.insets = new Insets(0, 0, 5, 5);
		gridTypeAbsLabel.gridx = 4;
		gridTypeAbsLabel.gridy = 1;
		mainFrame.getContentPane().add(typeAbsLabel, gridTypeAbsLabel);
		
		typeAbsField = new JTextField();
		GridBagConstraints gridTypeAbsField = new GridBagConstraints();
		gridTypeAbsField.insets = new Insets(0, 0, 5, 5);
		gridTypeAbsField.fill = GridBagConstraints.HORIZONTAL;
		gridTypeAbsField.gridx = 4;
		gridTypeAbsField.gridy = 2;
		mainFrame.getContentPane().add(typeAbsField, gridTypeAbsField);
		typeAbsField.setColumns(10);
		
		buttonAddTypeAbs = new JButton("Ajouter un type d'absence");
		buttonAddTypeAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonAddTypeAbs = new GridBagConstraints();
		gridButtonAddTypeAbs.fill = GridBagConstraints.BOTH;
		gridButtonAddTypeAbs.insets = new Insets(0, 0, 5, 5);
		gridButtonAddTypeAbs.gridx = 2;
		gridButtonAddTypeAbs.gridy = 4;
		mainFrame.getContentPane().add(buttonAddTypeAbs, gridButtonAddTypeAbs);
		
		buttonUpdateTypeAbs = new JButton("Modifier un type d'absence");
		buttonUpdateTypeAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonUpdateTypeAbs = new GridBagConstraints();
		gridButtonUpdateTypeAbs.insets = new Insets(0, 0, 5, 5);
		gridButtonUpdateTypeAbs.gridx = 4;
		gridButtonUpdateTypeAbs.gridy = 4;
		mainFrame.getContentPane().add(buttonUpdateTypeAbs, gridButtonUpdateTypeAbs);
		
		buttonDeleteTypeAbs = new JButton("Supprimer un type d'absence");
		buttonDeleteTypeAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonDeleteTypeAbs = new GridBagConstraints();
		gridButtonDeleteTypeAbs.insets = new Insets(0, 0, 5, 5);
		gridButtonDeleteTypeAbs.gridx = 6;
		gridButtonDeleteTypeAbs.gridy = 4;
		mainFrame.getContentPane().add(buttonDeleteTypeAbs, gridButtonDeleteTypeAbs);
		
		buttonAddQuota = new JButton("Ajouter un quota d'absence");
		buttonAddQuota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonAddQuota = new GridBagConstraints();
		gridButtonAddQuota.insets = new Insets(0, 0, 5, 5);
		gridButtonAddQuota.gridx = 6;
		gridButtonAddQuota.gridy = 6;
		mainFrame.getContentPane().add(buttonAddQuota, gridButtonAddQuota);
		
		quotaLabel = new JLabel("Quota d'absence");
		GridBagConstraints gridQuotaLabel = new GridBagConstraints();
		gridQuotaLabel.insets = new Insets(0, 0, 5, 5);
		gridQuotaLabel.gridx = 2;
		gridQuotaLabel.gridy = 6;
		mainFrame.getContentPane().add(quotaLabel, gridQuotaLabel);
		
		quotaField = new JTextField();
		GridBagConstraints gridQuotaField = new GridBagConstraints();
		gridQuotaField.fill = GridBagConstraints.HORIZONTAL;
		gridQuotaField.insets = new Insets(0, 0, 5, 5);
		gridQuotaField.gridx = 4;
		gridQuotaField.gridy = 6;
		mainFrame.getContentPane().add(quotaField, gridQuotaField);
		quotaField.setColumns(10);
				
		penaliteLabel = new JLabel("Penalite");
		GridBagConstraints gridPenaliteLabel = new GridBagConstraints();
		gridPenaliteLabel.insets = new Insets(0, 0, 5, 5);
		gridPenaliteLabel.gridx = 2;
		gridPenaliteLabel.gridy = 7;
		mainFrame.getContentPane().add(penaliteLabel, gridPenaliteLabel);
		
		penaliteField = new JTextField();
		GridBagConstraints gridPenaliteField = new GridBagConstraints();
		gridPenaliteField.insets = new Insets(0, 0, 5, 5);
		gridPenaliteField.fill = GridBagConstraints.HORIZONTAL;
		gridPenaliteField.gridx = 4;
		gridPenaliteField.gridy = 7;
		mainFrame.getContentPane().add(penaliteField, gridPenaliteField);
		penaliteField.setColumns(10);
		
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
		gridButtonHome.gridy = 9;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
		
		buttonUpdateQuota = new JButton("Modifier un quota d'absence");
		GridBagConstraints gridButtonUpdateQuota = new GridBagConstraints();
		gridButtonUpdateQuota.insets = new Insets(0, 0, 5, 5);
		gridButtonUpdateQuota.gridx = 6;
		gridButtonUpdateQuota.gridy = 7;
		mainFrame.getContentPane().add(buttonUpdateQuota, gridButtonUpdateQuota);
		
		filiereLabel = new JLabel("1 = Classique & 2 = Apprentissage");
		GridBagConstraints gridFiliereLabel = new GridBagConstraints();
		gridFiliereLabel.insets = new Insets(0, 0, 5, 5);
		gridFiliereLabel.gridx = 2;
		gridFiliereLabel.gridy = 8;
		mainFrame.getContentPane().add(filiereLabel, gridFiliereLabel);
		
		filiereField = new JTextField();
		GridBagConstraints gridFiliereField = new GridBagConstraints();
		gridFiliereField.insets = new Insets(0, 0, 5, 5);
		gridFiliereField.fill = GridBagConstraints.HORIZONTAL;
		gridFiliereField.gridx = 4;
		gridFiliereField.gridy = 8;
		mainFrame.getContentPane().add(filiereField, gridFiliereField);
		filiereField.setColumns(10);
	}

}
