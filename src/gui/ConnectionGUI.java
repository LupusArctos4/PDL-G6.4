package gui;

import java.awt.EventQueue;

import javax.swing.*;

import java.awt.event.*;
import java.awt.FlowLayout;


import dao.*;
import guiAdministratif.*;
import guiEnseignant.*;
import guiEtudiant.*;
import guiGestionnaire.*;
import model.*;

 /**
  * Connection a la base de donnee
  * @author faucq
  * @version 1.0
  */
public class ConnectionGUI {

	private JFrame mainFrame;
	private JTextField loginField;
	private JTextField passField;
	private SuperAdmin sa = new SuperAdmin(); 
	// permet d'avoir le login et le pass de l'utilisateur connecte
	// il peut etre utilise pour les absences des etudiants

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConnectionGUI window = new ConnectionGUI();
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
	public ConnectionGUI() {
		this.sa=null;
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Connection");
		mainFrame.setBounds(100, 100, 500, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.Y_AXIS));
		
		/**
		 * label supperieur
		 */
		// creer le panel superieur (1)
		JPanel connectionPnl1 = new JPanel();
		mainFrame.getContentPane().add(connectionPnl1);
		connectionPnl1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		// ecrire Connection dans le panel 1
		JLabel connectionChoiceLbl = new JLabel("Connection");
		connectionPnl1.add(connectionChoiceLbl);
		
		/**
		 * label inferieur
		 */
		// creer le panel inferieur (2)
		JPanel connectionPnl2 = new JPanel();
		mainFrame.getContentPane().add(connectionPnl2);
		// ecrire LOGIN
		JLabel loginLbl = new JLabel("LOGIN : ");
		connectionPnl2.add(loginLbl);
		// mettre une case pour remplir le LOGIN
		loginField = new JTextField();
		connectionPnl2.add(loginField);
		loginField.setColumns(10);
		// ecrire PASS
		JLabel passLbl = new JLabel("PASS : ");
		connectionPnl2.add(passLbl);
		// mettre une case pour remplire le PASS
		passField = new JTextField();
		connectionPnl2.add(passField);
		passField.setColumns(10);
		
		// bouton pour se connecter
		JButton btnNewButton = new JButton("CONNECTION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// recup les info des box
				String login = loginField.getText();
				String pass = passField.getText();
				
				try {
					/*
					 *  verifier les identifiants
					 */
					
					// verif des id
					int puissance = verifID(login, pass);
					if (puissance > 0) {
						System.out.println("open new IHM");
						// fermeture de la fenetre
						mainFrame.dispose();
						switchGUI(puissance);
						//new MainWindow().setVisible(true); //fonction de test
					}
					else {
						JOptionPane.showMessageDialog(new JFrame(), "LOGIN et/ou PASS invalide", "Dialog",JOptionPane.ERROR_MESSAGE);
					}
				}
				catch (Exception ignore){
					JOptionPane.showMessageDialog(new JFrame(),"Veuiller remplir les champs de saisie !", "Dialog", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		connectionPnl2.add(btnNewButton);
	}
	
	/**
	 * verifID verifie les ID en fonction des donnees rentrees
	 * @param login
	 * @param pass
	 * @return la puissance de 0 à 4
	 * 0 = super admin
	 * 1 = gestionnaire
	 * 2 = administration
	 * 3 = enseignant
	 * 4 = etudiant
	 */
	public int verifID(String login, String pass) {
		
		int erreur = 0;
		
		ConnectionDAO conDao = new ConnectionDAO();
		sa = conDao.get(login);
		
		if (login.equals(sa.getLogin())) {
			if (pass.equals(sa.getPass())) {
				return sa.getUtil();
			}
		} 
		return erreur;
	}
	
	public void switchGUI(int puissance) {
		
		GestionnaireGUI gestGUI = new GestionnaireGUI();
		AdministratifGUI adminGUI = new AdministratifGUI();
		EnseignantGUI ensGUI = new EnseignantGUI();
		EtudiantGUI etuGUI = new EtudiantGUI();
		SuperAdminGUI superGUI = new SuperAdminGUI();
		
		// lot
		Lot1Gestionnaire gestLot1 = new Lot1Gestionnaire();
		
		switch(puissance) {
		case 0 :
			System.out.println("0");
			superGUI.main(null);
			break;
		case 1 :
			System.out.println("1");
			//gestGUI.main(null);-
			gestLot1.main(null);
			break;
		case 2 :
			System.out.println("2");
			adminGUI.main(null);
			break;
		case 3 :
			System.out.println("3");
			ensGUI.main(null);
			break;
		case 4 :
			System.out.println("4");
			etuGUI.main(null);
			break;
		}
	}
	
	/**
	 * GETTER of super admin
	 * @return
	 */
	public SuperAdmin getSuperAdmin() {
		return this.sa;
	}
	/**
	 * SETTER of super admin
	 * @param sa
	 */
	public void setSuperAdmin(SuperAdmin sa) {
		this.sa = sa;
	}
}