package guiGestionnaire;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AjouterEtudiant {

	private JFrame mainFrame;
	private JButton buttonValide;
	private JButton buttonAdd;
	private JButton buttonHome;
	private JButton buttonRetour;
	private JTextField nomGroupeField;
	private JLabel numGroupeLabel;
	private JComboBox etudiantBox;

	
	GestionnaireGUI gestGUI = new GestionnaireGUI();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterEtudiant window = new AjouterEtudiant();
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
	public AjouterEtudiant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Ajouter un etudiant");
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{65, 117, 139, 105, 0};
		gridBagLayout.rowHeights = new int[]{22, 34, 21, 41, 21, 0, 36, 21, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		numGroupeLabel = new JLabel("Numero du groupe :");
		GridBagConstraints gridNumGroupeLabel = new GridBagConstraints();
		gridNumGroupeLabel.fill = GridBagConstraints.BOTH;
		gridNumGroupeLabel.insets = new Insets(0, 0, 5, 5);
		gridNumGroupeLabel.gridx = 1;
		gridNumGroupeLabel.gridy = 1;
		mainFrame.getContentPane().add(numGroupeLabel, gridNumGroupeLabel);
		
		nomGroupeField = new JTextField();
		GridBagConstraints gridNomGroupeField = new GridBagConstraints();
		gridNomGroupeField.fill = GridBagConstraints.BOTH;
		gridNomGroupeField.insets = new Insets(0, 0, 5, 5);
		gridNomGroupeField.gridx = 2;
		gridNomGroupeField.gridy = 1;
		mainFrame.getContentPane().add(nomGroupeField, gridNomGroupeField);
		nomGroupeField.setColumns(10);
		
		etudiantBox = new JComboBox();
		GridBagConstraints gridEtudiantBox = new GridBagConstraints();
		gridEtudiantBox.fill = GridBagConstraints.BOTH;
		gridEtudiantBox.insets = new Insets(0, 0, 5, 5);
		gridEtudiantBox.gridx = 2;
		gridEtudiantBox.gridy = 2;
		mainFrame.getContentPane().add(etudiantBox, gridEtudiantBox);
		
		buttonAdd = new JButton("Ajouter");
		GridBagConstraints gridButtonAdd = new GridBagConstraints();
		gridButtonAdd.fill = GridBagConstraints.BOTH;
		gridButtonAdd.insets = new Insets(0, 0, 5, 5);
		gridButtonAdd.gridx = 1;
		gridButtonAdd.gridy = 4;
		mainFrame.getContentPane().add(buttonAdd, gridButtonAdd);
		
		buttonValide = new JButton("Valider");
		GridBagConstraints gridButtonValide = new GridBagConstraints();
		gridButtonValide.fill = GridBagConstraints.BOTH;
		gridButtonValide.insets = new Insets(0, 0, 5, 0);
		gridButtonValide.gridx = 3;
		gridButtonValide.gridy = 4;
		mainFrame.getContentPane().add(buttonValide, gridButtonValide);
		
		buttonHome = new JButton("Home");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				gestGUI.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.fill = GridBagConstraints.BOTH;
		gridButtonHome.insets = new Insets(0, 0, 5, 5);
		gridButtonHome.gridx = 1;
		gridButtonHome.gridy = 6;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
		
		buttonRetour = new JButton("Retour");
		GridBagConstraints gridButtonRetour = new GridBagConstraints();
		gridButtonRetour.insets = new Insets(0, 0, 5, 0);
		gridButtonRetour.fill = GridBagConstraints.BOTH;
		gridButtonRetour.gridx = 3;
		gridButtonRetour.gridy = 6;
		mainFrame.getContentPane().add(buttonRetour, gridButtonRetour);
		buttonRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				CreateGroupeEtu.main(null);
			}
		});
	}
}
