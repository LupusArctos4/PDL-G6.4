package guiGestionnaire;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class ModifierGroupeEtu {

	private JFrame mainFrame;
	private JTextField numGroupeField;
	private JLabel numGroupeLabel;
	private JComboBox etudiantBox;
	private JButton buttonSuppr;
	private JButton buttonRetour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierGroupeEtu window = new ModifierGroupeEtu();
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
	public ModifierGroupeEtu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Modifier Groupe Etudiant");
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 93, 304, 0};
		gridBagLayout.rowHeights = new int[]{32, 19, 46, 21, 40, 21, 21, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		numGroupeLabel = new JLabel("Numero du groupe :");
		GridBagConstraints gridNumGroupeLabel = new GridBagConstraints();
		gridNumGroupeLabel.anchor = GridBagConstraints.WEST;
		gridNumGroupeLabel.insets = new Insets(0, 0, 5, 5);
		gridNumGroupeLabel.gridx = 1;
		gridNumGroupeLabel.gridy = 1;
		mainFrame.getContentPane().add(numGroupeLabel, gridNumGroupeLabel);
		
		numGroupeField = new JTextField();
		GridBagConstraints gridNumGroupeField = new GridBagConstraints();
		gridNumGroupeField.anchor = GridBagConstraints.NORTH;
		gridNumGroupeField.fill = GridBagConstraints.HORIZONTAL;
		gridNumGroupeField.insets = new Insets(0, 0, 5, 0);
		gridNumGroupeField.gridx = 2;
		gridNumGroupeField.gridy = 1;
		mainFrame.getContentPane().add(numGroupeField, gridNumGroupeField);
		numGroupeField.setColumns(10);
		
		etudiantBox = new JComboBox();
		GridBagConstraints gridEtudiantBox = new GridBagConstraints();
		gridEtudiantBox.anchor = GridBagConstraints.NORTH;
		gridEtudiantBox.fill = GridBagConstraints.HORIZONTAL;
		gridEtudiantBox.insets = new Insets(0, 0, 5, 0);
		gridEtudiantBox.gridx = 2;
		gridEtudiantBox.gridy = 3;
		mainFrame.getContentPane().add(etudiantBox, gridEtudiantBox);
		
		buttonSuppr = new JButton("Supprimer");
		GridBagConstraints gridButtonSuppr = new GridBagConstraints();
		gridButtonSuppr.anchor = GridBagConstraints.NORTH;
		gridButtonSuppr.fill = GridBagConstraints.HORIZONTAL;
		gridButtonSuppr.insets = new Insets(0, 0, 5, 0);
		gridButtonSuppr.gridx = 2;
		gridButtonSuppr.gridy = 5;
		mainFrame.getContentPane().add(buttonSuppr, gridButtonSuppr);
		
		buttonRetour = new JButton("Retour");
		buttonRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				CreateGroupeEtu.main(null);
			}
		});
		GridBagConstraints gridButtonRetour = new GridBagConstraints();
		gridButtonRetour.insets = new Insets(0, 0, 0, 5);
		gridButtonRetour.anchor = GridBagConstraints.NORTH;
		gridButtonRetour.fill = GridBagConstraints.HORIZONTAL;
		gridButtonRetour.gridx = 1;
		gridButtonRetour.gridy = 6;
		mainFrame.getContentPane().add(buttonRetour, gridButtonRetour);
		
	}

}
