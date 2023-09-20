package guiEtudiant;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AbsencesEtudiant {

	private JFrame mainFrame;
	private JTextField nbrAbsField;
	private JLabel nbrAbsLabel;
	private JLabel declarerNewAbsLabel;
	private JLabel listeAbsLabel;
	private JButton buttonDeclarerAbs;
	private JButton buttonAbsence1;
	private JButton buttonAbsence2;
	private JButton buttonAbsence3;
	private JButton buttonHome;

	
	EtudiantGUI etuGUI = new EtudiantGUI();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbsencesEtudiant window = new AbsencesEtudiant();
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
	public AbsencesEtudiant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Absences Etudiant");
		mainFrame.setBounds(100, 100, 500, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{51, 30, 198, 0};
		gridBagLayout.rowHeights = new int[]{34, 19, 21, 21, 21, 21, 30, 21, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		buttonDeclarerAbs = new JButton("Declarer absence");
		buttonDeclarerAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeclarerAbsence declarerAbs = new DeclarerAbsence();
				mainFrame.dispose();
		        declarerAbs.main(null);
			}
		});
		GridBagConstraints gridButtonDeclarerAbs = new GridBagConstraints();
		gridButtonDeclarerAbs.fill = GridBagConstraints.BOTH;
		gridButtonDeclarerAbs.insets = new Insets(0, 0, 5, 0);
		gridButtonDeclarerAbs.gridx = 2;
		gridButtonDeclarerAbs.gridy = 2;
		mainFrame.getContentPane().add(buttonDeclarerAbs, gridButtonDeclarerAbs);
		
		nbrAbsLabel = new JLabel("Nombre d'absences :");
		GridBagConstraints gridNbrAbsLabel = new GridBagConstraints();
		gridNbrAbsLabel.fill = GridBagConstraints.BOTH;
		gridNbrAbsLabel.insets = new Insets(0, 0, 5, 5);
		gridNbrAbsLabel.gridx = 1;
		gridNbrAbsLabel.gridy = 1;
		mainFrame.getContentPane().add(nbrAbsLabel, gridNbrAbsLabel);
		
		nbrAbsField = new JTextField();
		GridBagConstraints gridNbrAbsField = new GridBagConstraints();
		gridNbrAbsField.fill = GridBagConstraints.BOTH;
		gridNbrAbsField.insets = new Insets(0, 0, 5, 0);
		gridNbrAbsField.gridx = 2;
		gridNbrAbsField.gridy = 1;
		mainFrame.getContentPane().add(nbrAbsField, gridNbrAbsField);
		nbrAbsField.setColumns(10);
		
		declarerNewAbsLabel = new JLabel("Declarer une nouvelle absence :");
		GridBagConstraints gridDeclarerNewAbsLabel = new GridBagConstraints();
		gridDeclarerNewAbsLabel.fill = GridBagConstraints.BOTH;
		gridDeclarerNewAbsLabel.insets = new Insets(0, 0, 5, 5);
		gridDeclarerNewAbsLabel.gridx = 1;
		gridDeclarerNewAbsLabel.gridy = 2;
		mainFrame.getContentPane().add(declarerNewAbsLabel, gridDeclarerNewAbsLabel);
				
		buttonAbsence1 = new JButton("Absence 1");
		buttonAbsence1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbsenceGUI abs = new AbsenceGUI();
				mainFrame.dispose();
		        abs.main(null);
			}
		});
		GridBagConstraints gridButtonAbsence1 = new GridBagConstraints();
		gridButtonAbsence1.fill = GridBagConstraints.BOTH;
		gridButtonAbsence1.insets = new Insets(0, 0, 5, 0);
		gridButtonAbsence1.gridx = 2;
		gridButtonAbsence1.gridy = 3;
		mainFrame.getContentPane().add(buttonAbsence1, gridButtonAbsence1);
		
		listeAbsLabel = new JLabel("Liste des absences");
		GridBagConstraints gridListeAbsLabel = new GridBagConstraints();
		gridListeAbsLabel.fill = GridBagConstraints.BOTH;
		gridListeAbsLabel.insets = new Insets(0, 0, 5, 5);
		gridListeAbsLabel.gridx = 1;
		gridListeAbsLabel.gridy = 3;
		mainFrame.getContentPane().add(listeAbsLabel, gridListeAbsLabel);
				
		buttonAbsence2 = new JButton("Absence 2");
		buttonAbsence2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbsenceGUI abs = new AbsenceGUI();
				mainFrame.dispose();
		        abs.main(null);
			}
		});
		GridBagConstraints gridButtonAbsence2 = new GridBagConstraints();
		gridButtonAbsence2.fill = GridBagConstraints.BOTH;
		gridButtonAbsence2.insets = new Insets(0, 0, 5, 0);
		gridButtonAbsence2.gridx = 2;
		gridButtonAbsence2.gridy = 4;
		mainFrame.getContentPane().add(buttonAbsence2, gridButtonAbsence2);
		
		buttonAbsence3 = new JButton("Absence 3");
		buttonAbsence3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbsenceGUI abs = new AbsenceGUI();
				mainFrame.dispose();
		        abs.main(null);
			}
		});
		GridBagConstraints gridButtonAbsence3 = new GridBagConstraints();
		gridButtonAbsence3.fill = GridBagConstraints.BOTH;
		gridButtonAbsence3.insets = new Insets(0, 0, 5, 0);
		gridButtonAbsence3.gridx = 2;
		gridButtonAbsence3.gridy = 5;
		mainFrame.getContentPane().add(buttonAbsence3, gridButtonAbsence3);
		
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
	}

}
