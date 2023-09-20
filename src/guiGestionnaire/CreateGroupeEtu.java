package guiGestionnaire;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;


public class CreateGroupeEtu {

	private JFrame mainFrame;
	private JTextField nbrMaxEtu;
	private JButton buttonValide;
	private JButton buttonAddEtu;
	private JButton buttonModifGroupe;
	private JButton buttonHome;
	private JButton buttonCreateGroupe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateGroupeEtu window = new CreateGroupeEtu();
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
	public CreateGroupeEtu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Creer groupe etudiant");
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Nombre limite d'etudiant :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		mainFrame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		nbrMaxEtu = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		mainFrame.getContentPane().add(nbrMaxEtu, gbc_textField);
		nbrMaxEtu.setColumns(10);
		
		buttonValide = new JButton("Valider");
		GridBagConstraints gridButtonValide = new GridBagConstraints();
		gridButtonValide.insets = new Insets(0, 0, 5, 5);
		gridButtonValide.gridx = 1;
		gridButtonValide.gridy = 2;
		mainFrame.getContentPane().add(buttonValide, gridButtonValide);
		
		buttonAddEtu = new JButton("Ajouter Etudiant");
		buttonAddEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterEtudiant ajouterEtu = new AjouterEtudiant();
				mainFrame.dispose();
		        ajouterEtu.main(null);
			}
		});
		GridBagConstraints gridButtonAddEtu = new GridBagConstraints();
		gridButtonAddEtu.insets = new Insets(0, 0, 5, 5);
		gridButtonAddEtu.gridx = 1;
		gridButtonAddEtu.gridy = 6;
		mainFrame.getContentPane().add(buttonAddEtu, gridButtonAddEtu);
		
		buttonModifGroupe = new JButton("Modifier groupe");
		
		buttonModifGroupe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifierGroupeEtu modifGrpEtu = new ModifierGroupeEtu();
				mainFrame.dispose();
		        modifGrpEtu.main(null);
			}
		});
		GridBagConstraints gridButtonModifGroupe = new GridBagConstraints();
		gridButtonModifGroupe.insets = new Insets(0, 0, 5, 0);
		gridButtonModifGroupe.gridx = 2;
		gridButtonModifGroupe.gridy = 6;
		mainFrame.getContentPane().add(buttonModifGroupe, gridButtonModifGroupe);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				GestionnaireGUI.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.insets = new Insets(0, 0, 0, 5);
		gridButtonHome.gridx = 1;
		gridButtonHome.gridy = 7;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
		
		buttonCreateGroupe = new JButton("Creer groupe");
		GridBagConstraints gridButtonCreateGroupe = new GridBagConstraints();
		gridButtonCreateGroupe.gridx = 2;
		gridButtonCreateGroupe.gridy = 7;
		mainFrame.getContentPane().add(buttonCreateGroupe, gridButtonCreateGroupe);
		
	}

}
