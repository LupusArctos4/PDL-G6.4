package guiGestionnaire;

import java.awt.EventQueue;

import javax.swing.*;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;

import gui.ConnectionGUI;


public class GestionnaireGUI{
	
	private JFrame mainFrame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JButton buttonCreateCours;
	private JButton buttonCreateEns;
	private JButton buttonCreateEtu;
	private JButton buttonCreateTypeAbs;
	private JButton buttonQuota;
	private JButton buttonTraiterAbs;
	private JButton buttonMAJAbsence;
	private JButton buttonAttribuerZero;
	private JButton buttonCreateGroupe;
	private JButton buttonPenalites;
	private JButton buttonDeclencherRattrapages;
	private JButton buttonDeclencherMail;
	private JButton buttonOff;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionnaireGUI window = new GestionnaireGUI();
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
	public GestionnaireGUI() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		mainFrame = new JFrame("Gestionnaire");
		mainFrame.setBounds(100, 100, 629, 381);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 5;
		gbc_panel_1.gridy = 0;
		mainFrame.getContentPane().add(panel_1, gbc_panel_1);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 7;
		gbc_panel.gridy = 1;
		mainFrame.getContentPane().add(panel, gbc_panel);
		
		buttonCreateTypeAbs = new JButton("Creer les types d'absences");
		buttonCreateTypeAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TypeAbsGest typeAbs = new TypeAbsGest();
				mainFrame.dispose();
		        typeAbs.main(null);
			}
		});
		GridBagConstraints gridButtonCreateTypeAbs = new GridBagConstraints();
		gridButtonCreateTypeAbs.fill = GridBagConstraints.HORIZONTAL;
		gridButtonCreateTypeAbs.insets = new Insets(0, 0, 5, 5);
		gridButtonCreateTypeAbs.gridx = 7;
		gridButtonCreateTypeAbs.gridy = 2;
		mainFrame.getContentPane().add(buttonCreateTypeAbs, gridButtonCreateTypeAbs);
				
		buttonCreateCours = new JButton("Creer un cours");
		buttonCreateCours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonCreateCours = new GridBagConstraints();
		gridButtonCreateCours.fill = GridBagConstraints.BOTH;
		gridButtonCreateCours.insets = new Insets(0, 0, 5, 5);
		gridButtonCreateCours.gridx = 2;
		gridButtonCreateCours.gridy = 2;
		mainFrame.getContentPane().add(buttonCreateCours, gridButtonCreateCours);
		
		buttonQuota = new JButton("Definir les quotas d'absences");
		buttonQuota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonQuota = new GridBagConstraints();
		gridButtonQuota.fill = GridBagConstraints.HORIZONTAL;
		gridButtonQuota.insets = new Insets(0, 0, 5, 5);
		gridButtonQuota.gridx = 9;
		gridButtonQuota.gridy = 2;
		mainFrame.getContentPane().add(buttonQuota, gridButtonQuota);
		
		buttonTraiterAbs = new JButton("Traiter les absences");
		buttonTraiterAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonTraiterAbs = new GridBagConstraints();
		gridButtonTraiterAbs.fill = GridBagConstraints.HORIZONTAL;
		gridButtonTraiterAbs.insets = new Insets(0, 0, 5, 5);
		gridButtonTraiterAbs.gridx = 7;
		gridButtonTraiterAbs.gridy = 4;
		mainFrame.getContentPane().add(buttonTraiterAbs, gridButtonTraiterAbs);
		
		buttonCreateEtu = new JButton("Creer un etudiant");
		buttonCreateEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateEtudiantGest createEtudiant = new CreateEtudiantGest();
				mainFrame.dispose();
		        createEtudiant.main(null);
			}
		});
		GridBagConstraints gridButtonCreateEtu = new GridBagConstraints();
		gridButtonCreateEtu.fill = GridBagConstraints.BOTH;
		gridButtonCreateEtu.insets = new Insets(0, 0, 5, 5);
		gridButtonCreateEtu.gridx = 2;
		gridButtonCreateEtu.gridy = 4;
		mainFrame.getContentPane().add(buttonCreateEtu, gridButtonCreateEtu);
				
		buttonMAJAbsence = new JButton("Mettre a jour la liste des absences");
		buttonMAJAbsence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MAJListeAbs majListeAbsences = new MAJListeAbs();
				mainFrame.dispose();
		        majListeAbsences.main(null);
			}
		});
		GridBagConstraints gridButtonMAJAbsence = new GridBagConstraints();
		gridButtonMAJAbsence.fill = GridBagConstraints.HORIZONTAL;
		gridButtonMAJAbsence.insets = new Insets(0, 0, 5, 5);
		gridButtonMAJAbsence.gridx = 9;
		gridButtonMAJAbsence.gridy = 4;
		mainFrame.getContentPane().add(buttonMAJAbsence, gridButtonMAJAbsence);
		
		panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 5;
		mainFrame.getContentPane().add(panel_3, gbc_panel_3);
		
		panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 10;
		gbc_panel_4.gridy = 5;
		mainFrame.getContentPane().add(panel_4, gbc_panel_4);
		
		buttonAttribuerZero = new JButton("Attribuer la note ZERO");
		buttonAttribuerZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonAttribuerZero = new GridBagConstraints();
		gridButtonAttribuerZero.fill = GridBagConstraints.HORIZONTAL;
		gridButtonAttribuerZero.insets = new Insets(0, 0, 5, 5);
		gridButtonAttribuerZero.gridx = 7;
		gridButtonAttribuerZero.gridy = 6;
		mainFrame.getContentPane().add(buttonAttribuerZero, gridButtonAttribuerZero);
				
		buttonCreateGroupe = new JButton("Creer un groupe d'etudiant");
		buttonCreateGroupe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateGroupeEtu createGrpEtu = new CreateGroupeEtu();
				mainFrame.dispose();
		        createGrpEtu.main(null);
			}
		});
		GridBagConstraints gridButtonCreateGroupe = new GridBagConstraints();
		gridButtonCreateGroupe.fill = GridBagConstraints.VERTICAL;
		gridButtonCreateGroupe.insets = new Insets(0, 0, 5, 5);
		gridButtonCreateGroupe.gridx = 2;
		gridButtonCreateGroupe.gridy = 6;
		mainFrame.getContentPane().add(buttonCreateGroupe, gridButtonCreateGroupe);
		
		buttonDeclencherRattrapages = new JButton("Declencher les rattrapages");
		buttonDeclencherRattrapages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonDeclencherRattrapages = new GridBagConstraints();
		gridButtonDeclencherRattrapages.fill = GridBagConstraints.HORIZONTAL;
		gridButtonDeclencherRattrapages.insets = new Insets(0, 0, 5, 5);
		gridButtonDeclencherRattrapages.gridx = 9;
		gridButtonDeclencherRattrapages.gridy = 6;
		mainFrame.getContentPane().add(buttonDeclencherRattrapages, gridButtonDeclencherRattrapages);
		
		buttonPenalites = new JButton("Attribuer les penalites");
		buttonPenalites.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonPenalites = new GridBagConstraints();
		gridButtonPenalites.fill = GridBagConstraints.HORIZONTAL;
		gridButtonPenalites.insets = new Insets(0, 0, 5, 5);
		gridButtonPenalites.gridx = 7;
		gridButtonPenalites.gridy = 8;
		mainFrame.getContentPane().add(buttonPenalites, gridButtonPenalites);
		
		buttonCreateEns = new JButton("Creer un enseignant");
		buttonCreateEns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateEnseignantGest createEnseignant = new CreateEnseignantGest();
				mainFrame.dispose();
		        createEnseignant.main(null);
			}
		});
		GridBagConstraints gridButtonCreateEns = new GridBagConstraints();
		gridButtonCreateEns.fill = GridBagConstraints.HORIZONTAL;
		gridButtonCreateEns.insets = new Insets(0, 0, 5, 5);
		gridButtonCreateEns.gridx = 2;
		gridButtonCreateEns.gridy = 8;
		mainFrame.getContentPane().add(buttonCreateEns, gridButtonCreateEns);
		
		buttonDeclencherMail = new JButton("Declencher un courrier");
		buttonDeclencherMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonDeclencherMail = new GridBagConstraints();
		gridButtonDeclencherMail.fill = GridBagConstraints.HORIZONTAL;
		gridButtonDeclencherMail.insets = new Insets(0, 0, 5, 5);
		gridButtonDeclencherMail.gridx = 9;
		gridButtonDeclencherMail.gridy = 8;
		mainFrame.getContentPane().add(buttonDeclencherMail, gridButtonDeclencherMail);
		
		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 8;
		gbc_panel_2.gridy = 9;
		mainFrame.getContentPane().add(panel_2, gbc_panel_2);
		
		buttonOff = new JButton("Deconnexion");
		buttonOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionGUI conGUI = new ConnectionGUI();
				mainFrame.dispose();
		        conGUI.main(null);
			}
		});
		GridBagConstraints gridButtonOff = new GridBagConstraints();
		gridButtonOff.fill = GridBagConstraints.BOTH;
		gridButtonOff.insets = new Insets(0, 0, 5, 5);
		gridButtonOff.gridx = 9;
		gridButtonOff.gridy = 10;
		mainFrame.getContentPane().add(buttonOff, gridButtonOff);
	}
}
