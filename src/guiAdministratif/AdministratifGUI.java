package guiAdministratif;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;


import gui.ConnectionGUI;


public class AdministratifGUI{
	
	private JFrame mainFrame;
	private JPanel panel0;
	private JPanel panel1;
	private JButton buttonCreateCours;
	private JButton buttonQuotaAbs;
	private JButton buttonCreateEtu;
	private JButton buttonMAJListAbs;
	private JButton buttonTraiterAbs;
	private JButton buttonCreateGroupeEtu;
	private JButton buttonDeclencherRattrapage;
	private JButton buttonZero;
	private JButton buttonDeclencherCourrier;
	private JButton buttonPenalites;
	private JButton buttonCreateEns;
	private JPanel panel2;
	private JButton buttonOff;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratifGUI window = new AdministratifGUI();
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
	public AdministratifGUI() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		mainFrame = new JFrame("Administratif");
		mainFrame.setBounds(100, 100, 629, 381);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		panel0 = new JPanel();
		GridBagConstraints panelGridBag0 = new GridBagConstraints();
		panelGridBag0.insets = new Insets(0, 0, 5, 5);
		panelGridBag0.fill = GridBagConstraints.BOTH;
		panelGridBag0.gridx = 5;
		panelGridBag0.gridy = 0;
		mainFrame.getContentPane().add(panel0, panelGridBag0);
		
		panel1 = new JPanel();
		GridBagConstraints panelGridBag1 = new GridBagConstraints();
		panelGridBag1.insets = new Insets(0, 0, 5, 5);
		panelGridBag1.fill = GridBagConstraints.BOTH;
		panelGridBag1.gridx = 7;
		panelGridBag1.gridy = 1;
		mainFrame.getContentPane().add(panel1, panelGridBag1);
		
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
		
		buttonQuotaAbs = new JButton("Definir les quotas d'absences");
		buttonQuotaAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonQuotaAbs = new GridBagConstraints();
		gridButtonQuotaAbs.fill = GridBagConstraints.HORIZONTAL;
		gridButtonQuotaAbs.insets = new Insets(0, 0, 5, 5);
		gridButtonQuotaAbs.gridx = 9;
		gridButtonQuotaAbs.gridy = 2;
		mainFrame.getContentPane().add(buttonQuotaAbs, gridButtonQuotaAbs);
		
		buttonCreateEtu = new JButton("Creer un etudiant");
		buttonCreateEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateEtudiantAdmin creerEtud = new CreateEtudiantAdmin();
				mainFrame.dispose();
		        creerEtud.main(null);
				}
		});
		GridBagConstraints gridButtonCreateEtu = new GridBagConstraints();
		gridButtonCreateEtu.fill = GridBagConstraints.BOTH;
		gridButtonCreateEtu.insets = new Insets(0, 0, 5, 5);
		gridButtonCreateEtu.gridx = 2;
		gridButtonCreateEtu.gridy = 4;
		mainFrame.getContentPane().add(buttonCreateEtu, gridButtonCreateEtu);
		
		buttonMAJListAbs = new JButton("Mettre a jour la liste des absences");
		buttonMAJListAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonMAJListAbs = new GridBagConstraints();
		gridButtonMAJListAbs.fill = GridBagConstraints.HORIZONTAL;
		gridButtonMAJListAbs.insets = new Insets(0, 0, 5, 5);
		gridButtonMAJListAbs.gridx = 9;
		gridButtonMAJListAbs.gridy = 4;
		mainFrame.getContentPane().add(buttonMAJListAbs, gridButtonMAJListAbs);
		
		buttonTraiterAbs = new JButton("Traiter les absences");
		buttonTraiterAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonTraiterAbs = new GridBagConstraints();
		gridButtonTraiterAbs.fill = GridBagConstraints.HORIZONTAL;
		gridButtonTraiterAbs.insets = new Insets(0, 0, 5, 5);
		gridButtonTraiterAbs.gridx = 4;
		gridButtonTraiterAbs.gridy = 4;
		mainFrame.getContentPane().add(buttonTraiterAbs, gridButtonTraiterAbs);
		
		buttonCreateGroupeEtu = new JButton("Creer un groupe d'etudiant");
		buttonCreateGroupeEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonCreateGroupeEtu = new GridBagConstraints();
		gridButtonCreateGroupeEtu.fill = GridBagConstraints.VERTICAL;
		gridButtonCreateGroupeEtu.insets = new Insets(0, 0, 5, 5);
		gridButtonCreateGroupeEtu.gridx = 2;
		gridButtonCreateGroupeEtu.gridy = 6;
		mainFrame.getContentPane().add(buttonCreateGroupeEtu, gridButtonCreateGroupeEtu);
		
		buttonDeclencherRattrapage = new JButton("Declencher les rattrapages");
		buttonDeclencherRattrapage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonDeclencherRattrapage = new GridBagConstraints();
		gridButtonDeclencherRattrapage.fill = GridBagConstraints.HORIZONTAL;
		gridButtonDeclencherRattrapage.insets = new Insets(0, 0, 5, 5);
		gridButtonDeclencherRattrapage.gridx = 9;
		gridButtonDeclencherRattrapage.gridy = 6;
		mainFrame.getContentPane().add(buttonDeclencherRattrapage, gridButtonDeclencherRattrapage);
		
		buttonZero = new JButton("Attribuer la note ZERO");
		buttonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonZero = new GridBagConstraints();
		gridButtonZero.fill = GridBagConstraints.HORIZONTAL;
		gridButtonZero.insets = new Insets(0, 0, 5, 5);
		gridButtonZero.gridx = 4;
		gridButtonZero.gridy = 6;
		mainFrame.getContentPane().add(buttonZero, gridButtonZero);
		
		
		buttonDeclencherCourrier = new JButton("Declencher un courrier");
		buttonDeclencherCourrier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonDeclencherCourrier = new GridBagConstraints();
		gridButtonDeclencherCourrier.fill = GridBagConstraints.HORIZONTAL;
		gridButtonDeclencherCourrier.insets = new Insets(0, 0, 5, 5);
		gridButtonDeclencherCourrier.gridx = 9;
		gridButtonDeclencherCourrier.gridy = 8;
		mainFrame.getContentPane().add(buttonDeclencherCourrier, gridButtonDeclencherCourrier);
		
		buttonPenalites = new JButton("Attribuer les penalites");
		buttonPenalites.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonPenalites = new GridBagConstraints();
		gridButtonPenalites.fill = GridBagConstraints.HORIZONTAL;
		gridButtonPenalites.insets = new Insets(0, 0, 5, 5);
		gridButtonPenalites.gridx = 4;
		gridButtonPenalites.gridy = 8;
		mainFrame.getContentPane().add(buttonPenalites, gridButtonPenalites);
		
		buttonCreateEns = new JButton("Creer un enseignant");
		buttonCreateEns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateEnseignantAdmin creerEns = new CreateEnseignantAdmin();
				mainFrame.dispose();
		        creerEns.main(null);
			}
		});
		GridBagConstraints gridButtonCreateEns = new GridBagConstraints();
		gridButtonCreateEns.fill = GridBagConstraints.HORIZONTAL;
		gridButtonCreateEns.insets = new Insets(0, 0, 5, 5);
		gridButtonCreateEns.gridx = 2;
		gridButtonCreateEns.gridy = 8;
		mainFrame.getContentPane().add(buttonCreateEns, gridButtonCreateEns);
		
		panel2 = new JPanel();
		GridBagConstraints panelGridBag2 = new GridBagConstraints();
		panelGridBag2.insets = new Insets(0, 0, 5, 5);
		panelGridBag2.fill = GridBagConstraints.BOTH;
		panelGridBag2.gridx = 8;
		panelGridBag2.gridy = 9;
		mainFrame.getContentPane().add(panel2, panelGridBag2);
		
		buttonOff = new JButton("Deconnexion");
		buttonOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionGUI conGUI = new ConnectionGUI();
				mainFrame.dispose();
		        conGUI.main(null);
			}
		});
		GridBagConstraints gridButtonOff = new GridBagConstraints();
		gridButtonOff.insets = new Insets(0, 0, 0, 5);
		gridButtonOff.gridx = 9;
		gridButtonOff.gridy = 11;
		mainFrame.getContentPane().add(buttonOff, gridButtonOff);
	}
}
