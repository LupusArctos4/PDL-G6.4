package guiEnseignant;

import java.awt.EventQueue;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AppelCoursActuel {

	private JFrame mainFrame;
	private JButton buttonProfil1;
	private JButton buttonProfil2;
	private JButton buttonValide;
	private JButton buttonHome;
	private JButton buttonRetour;
	private JLabel nomPrenomEtu1Label;
	private JLabel nomPrenomEtu2Label;
	private JCheckBox presentCheckBoxEtu1;
	private JCheckBox presentCheckBoxEtu2;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppelCoursActuel window = new AppelCoursActuel();
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
	public AppelCoursActuel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		buttonProfil1 = new JButton("Profil");
		GridBagConstraints gridButtonProfil1 = new GridBagConstraints();
		gridButtonProfil1.insets = new Insets(0, 0, 5, 5);
		gridButtonProfil1.fill = GridBagConstraints.BOTH;
		gridButtonProfil1.gridx = 0;
		gridButtonProfil1.gridy = 1;
		mainFrame.getContentPane().add(buttonProfil1, gridButtonProfil1);
		
		nomPrenomEtu1Label = new JLabel("Nom prenom etudiant 1");
		GridBagConstraints gridNomPrenomEtu1Label = new GridBagConstraints();
		gridNomPrenomEtu1Label.insets = new Insets(0, 0, 5, 5);
		gridNomPrenomEtu1Label.fill = GridBagConstraints.BOTH;
		gridNomPrenomEtu1Label.gridx = 2;
		gridNomPrenomEtu1Label.gridy = 1;
		mainFrame.getContentPane().add(nomPrenomEtu1Label, gridNomPrenomEtu1Label);
		
		presentCheckBoxEtu1 = new JCheckBox("Present ?");
		GridBagConstraints gridPresentCheckBoxEtu1 = new GridBagConstraints();
		gridPresentCheckBoxEtu1.insets = new Insets(0, 0, 5, 5);
		gridPresentCheckBoxEtu1.fill = GridBagConstraints.BOTH;
		gridPresentCheckBoxEtu1.gridx = 3;
		gridPresentCheckBoxEtu1.gridy = 1;
		mainFrame.getContentPane().add(presentCheckBoxEtu1, gridPresentCheckBoxEtu1);
		
		
		buttonProfil2 = new JButton("Profil");
		GridBagConstraints gridButtonProfil2 = new GridBagConstraints();
		gridButtonProfil2.insets = new Insets(0, 0, 5, 5);
		gridButtonProfil2.fill = GridBagConstraints.BOTH;
		gridButtonProfil2.gridx = 0;
		gridButtonProfil2.gridy = 2;
		mainFrame.getContentPane().add(buttonProfil2, gridButtonProfil2);
		
		nomPrenomEtu2Label = new JLabel("Nom prenom etudiant 2");
		GridBagConstraints gridNomPrenomEtu2Label = new GridBagConstraints();
		gridNomPrenomEtu2Label.insets = new Insets(0, 0, 5, 5);
		gridNomPrenomEtu2Label.fill = GridBagConstraints.BOTH;
		gridNomPrenomEtu2Label.gridx = 2;
		gridNomPrenomEtu2Label.gridy = 2;
		mainFrame.getContentPane().add(nomPrenomEtu2Label, gridNomPrenomEtu2Label);
		
		presentCheckBoxEtu2 = new JCheckBox("Present ?");
		GridBagConstraints gridPresentCheckBoxEtu2 = new GridBagConstraints();
		gridPresentCheckBoxEtu2.insets = new Insets(0, 0, 5, 5);
		gridPresentCheckBoxEtu2.fill = GridBagConstraints.BOTH;
		gridPresentCheckBoxEtu2.gridx = 3;
		gridPresentCheckBoxEtu2.gridy = 2;
		mainFrame.getContentPane().add(presentCheckBoxEtu2, gridPresentCheckBoxEtu2);
		
		buttonValide = new JButton("Valider");
		GridBagConstraints gridButtonValide = new GridBagConstraints();
		gridButtonValide.insets = new Insets(0, 0, 5, 5);
		gridButtonValide.fill = GridBagConstraints.BOTH;
		gridButtonValide.gridx = 2;
		gridButtonValide.gridy = 5;
		mainFrame.getContentPane().add(buttonValide, gridButtonValide);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnseignantGUI ens = new EnseignantGUI();
				mainFrame.dispose();
		        ens.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.insets = new Insets(0, 0, 0, 5);
		gridButtonHome.fill = GridBagConstraints.BOTH;
		gridButtonHome.gridx = 1;
		gridButtonHome.gridy = 8;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
		
		buttonRetour = new JButton("RETOUR");
		buttonRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoursActuel coursActuel = new CoursActuel();
				mainFrame.dispose();
		        coursActuel.main(null);
			}
		});
		GridBagConstraints gridButtonRetour = new GridBagConstraints();
		gridButtonRetour.gridx = 4;
		gridButtonRetour.gridy = 8;
		mainFrame.getContentPane().add(buttonRetour, gridButtonRetour);
	}
}
