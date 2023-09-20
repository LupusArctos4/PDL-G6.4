package gui;

import java.awt.EventQueue;

import javax.swing.*;

import java.awt.event.*;
import java.awt.FlowLayout;


import dao.*;
import model.*;

public class SuperAdminGUI {
	
	private JFrame mainFrame;
	private JTextField prenom1Field;
	private JTextField nom1Field;
	private JTextField motdepasse1Field;
	private JTextField prenom2Field;
	private JTextField nom2Field;
	private JTextField motdepasse2Field;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperAdminGUI window = new SuperAdminGUI();
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
	public SuperAdminGUI() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Panneau de controle Super Admin");
		mainFrame.setBounds(100, 100, 800, 300);
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
		JLabel connectionChoiceLbl = new JLabel("Panneau de controle Super Admin");
		connectionPnl1.add(connectionChoiceLbl);
		JButton btnNewButton_2 = new JButton("Deconnexion");
		connectionPnl1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionGUI conGUI = new ConnectionGUI();
		        mainFrame.dispose();
		        conGUI.main(null);
			}
		});
		
		/**
		 * label milieu
		 */
		// creer le panel milieu (2)
		JPanel connectionPnl2 = new JPanel();
		mainFrame.getContentPane().add(connectionPnl2);
		// ecrire PRENOM
		JLabel prenom1Lbl = new JLabel("Prenom : ");
		connectionPnl2.add(prenom1Lbl);
		// mettre une case pour remplir le PRENOM
		prenom1Field = new JTextField();
		connectionPnl2.add(prenom1Field);
		prenom1Field.setColumns(10);
		// ecrire NOM
		JLabel nom1Lbl = new JLabel("Nom : ");
		connectionPnl2.add(nom1Lbl);
		// mettre une case pour remplire le NOM
		nom1Field = new JTextField();
		connectionPnl2.add(nom1Field);
		nom1Field.setColumns(10);
		// ecrire MOTDEPASSE
		JLabel motdepasse1Lbl = new JLabel("Mot de passe : ");
		connectionPnl2.add(motdepasse1Lbl);
		// mettre une case pour remplire le MOTDEPASSE
		motdepasse1Field = new JTextField();
		connectionPnl2.add(motdepasse1Field);
		motdepasse1Field.setColumns(10);
		
		// bouton pour se connecter
		JButton btnNewButton = new JButton("Ajouter un gestionnaire");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nom1Field.getText().length() > 0) {
					String nom = nom1Field.getText();
					String prenom = prenom1Field.getText();
					String motdepasse = motdepasse1Field.getText();
					String login = nom.toLowerCase() + "." + prenom.toLowerCase();
					String pass = motdepasse;
					String email = prenom + "." + nom + "@esigelec.fr";
					addGest(login, pass, Gestionnaire.utilGest, nom, prenom, email);
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Une erreur est survenue !", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		connectionPnl2.add(btnNewButton);
		
		/**
		 * label inferieur
		 */
		JPanel connectionPnl3 = new JPanel();
		mainFrame.getContentPane().add(connectionPnl3);
		connectionPnl3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		// ecrire PRENOM
		JLabel prenom2Lbl = new JLabel("Prenom : ");
		connectionPnl3.add(prenom2Lbl);
		// mettre une case pour remplir le PRENOM
		prenom2Field = new JTextField();
		connectionPnl3.add(prenom2Field);
		prenom2Field.setColumns(10);
		// ecrire NOM
		JLabel nom2Lbl = new JLabel("Nom : ");
		connectionPnl3.add(nom2Lbl);
		// mettre une case pour remplire le NOM
		nom2Field = new JTextField();
		connectionPnl3.add(nom2Field);
		nom2Field.setColumns(10);
		// ecrire MOTDEPASSE
		JLabel motdepasse2Lbl = new JLabel("Mot de passe : ");
		connectionPnl3.add(motdepasse2Lbl);
		// mettre une case pour remplire le MOTDEPASSE
		motdepasse2Field = new JTextField();
		connectionPnl3.add(motdepasse2Field);
		motdepasse2Field.setColumns(10);
		
		// bouton pour se connecter
		JButton btn2NewButton = new JButton("Ajouter un administrateur");
		btn2NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nom1Field.getText().length() > 0) {
					String nom = nom2Field.getText();
					String prenom = prenom2Field.getText();
					String motdepasse = motdepasse2Field.getText();
					String login = nom.toLowerCase() + "." + prenom.toLowerCase();
					String pass = motdepasse;
					String email = prenom + "." + nom + "@esigelec.fr";
					addAdmin(login, pass, Administration.utilAdmin, nom, prenom, email);
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Une erreur est survenue !", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		connectionPnl3.add(btn2NewButton);
	}
	
	
	/**
	 * Ajoute un Gestionnaire
	 * @param login
	 * @param pass
	 * @param utilEns
	 * @param nom
	 * @param prenom
	 * @param numTelProf
	 * @param matiere
	 */
	public void addGest(String login, String pass, int utilEns, String nom, String prenom, String email) {
		// on recupere le fournisseur en BDD
		SuperAdminDAO saDAO = new SuperAdminDAO();
		Gestionnaire gestionnaire= new Gestionnaire(login, pass, utilEns, nom, prenom, email);
		int sa = saDAO.addGestionnaire(gestionnaire);

		if (sa == 0) {
			JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de l\'ajout du gestionnaire.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(new JFrame(), "Le gestionnaire a bien ete ajoute.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Ajoute une personne de l'Administration
	 * @param login
	 * @param pass
	 * @param utilEns
	 * @param nom
	 * @param prenom
	 * @param numTelProf
	 * @param matiere
	 */
	public void addAdmin(String login, String pass, int utilEns, String nom, String prenom, String email) {
		// on recupere le fournisseur en BDD
		SuperAdminDAO saDAO = new SuperAdminDAO();
		Administration administration= new Administration(login, pass, utilEns, nom, prenom, email);
		int sa = saDAO.addAdministration(administration);

		if (sa == 0) {
			JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de l\'ajout du gestionnaire.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(new JFrame(), "Le gestionnaire a bien ete ajoute.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
