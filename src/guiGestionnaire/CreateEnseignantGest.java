package guiGestionnaire;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;


import dao.*;
import model.*;


public class CreateEnseignantGest {

	private JFrame mainFrame;
	private JTextField nomField;
	private JTextField prenomField;
	private JTextField numTelField;
	private JTextField matiereField;
	private JLabel nomLabel;
	private JLabel prenomLabel;
	private JLabel numTelLabel;
	private JLabel matiereLabel;
	private JButton buttonAdd;
	private JButton buttonUpdate;
	private JButton buttonDelete;
	private JButton buttonHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateEnseignantGest window = new CreateEnseignantGest();
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
	public CreateEnseignantGest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Creer un enseignant");
		mainFrame.setBounds(100, 100, 800, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 135, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		nomLabel = new JLabel("Nom");
		GridBagConstraints gridNomLabel = new GridBagConstraints();
		gridNomLabel.insets = new Insets(0, 0, 5, 5);
		gridNomLabel.gridx = 3;
		gridNomLabel.gridy = 3;
		mainFrame.getContentPane().add(nomLabel, gridNomLabel);
		
		prenomLabel = new JLabel("Prenom");
		GridBagConstraints gridPrenomLabel = new GridBagConstraints();
		gridPrenomLabel.insets = new Insets(0, 0, 5, 5);
		gridPrenomLabel.gridx = 5;
		gridPrenomLabel.gridy = 3;
		mainFrame.getContentPane().add(prenomLabel, gridPrenomLabel);
		
		numTelLabel = new JLabel("Numero de telephone");
		GridBagConstraints gridNumTelLabel = new GridBagConstraints();
		gridNumTelLabel.insets = new Insets(0, 0, 5, 5);
		gridNumTelLabel.gridx = 7;
		gridNumTelLabel.gridy = 3;
		mainFrame.getContentPane().add(numTelLabel, gridNumTelLabel);
		
		matiereLabel = new JLabel("Matiere enseignee");
		GridBagConstraints gridMatiereLabel = new GridBagConstraints();
		gridMatiereLabel.insets = new Insets(0, 0, 5, 5);
		gridMatiereLabel.gridx = 9;
		gridMatiereLabel.gridy = 3;
		mainFrame.getContentPane().add(matiereLabel, gridMatiereLabel);
		
		buttonAdd = new JButton("Ajouter un enseignant");
		// ajouter un enseignant
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((nomField.getText().length() + prenomField.getText().length() + numTelField.getText().length()
						+ matiereField.getText().length()) > 4) {
					String nom = nomField.getText();
					String prenom = prenomField.getText();
					String numTel = numTelField.getText();
					String matiere = matiereField.getText();
					String login = nom.toLowerCase() + "." + prenom.toLowerCase();
					String pass = "ens" + numTel;
					addEnseignant(login, pass, Enseignant.utilEns, nom, prenom, numTel, matiere);
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Une erreur est survenue !", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		GridBagConstraints gridButtonAdd = new GridBagConstraints();
		gridButtonAdd.fill = GridBagConstraints.HORIZONTAL;
		gridButtonAdd.insets = new Insets(0, 0, 5, 5);
		gridButtonAdd.gridx = 3;
		gridButtonAdd.gridy = 11;
		mainFrame.getContentPane().add(buttonAdd, gridButtonAdd);
		
		nomField = new JTextField();
		GridBagConstraints gridNomField = new GridBagConstraints();
		gridNomField.insets = new Insets(0, 0, 5, 5);
		gridNomField.fill = GridBagConstraints.BOTH;
		gridNomField.gridx = 3;
		gridNomField.gridy = 4;
		mainFrame.getContentPane().add(nomField, gridNomField);
		nomField.setColumns(10);
		
		prenomField = new JTextField();
		GridBagConstraints gridPrenomField = new GridBagConstraints();
		gridPrenomField.insets = new Insets(0, 0, 5, 5);
		gridPrenomField.fill = GridBagConstraints.BOTH;
		gridPrenomField.gridx = 5;
		gridPrenomField.gridy = 4;
		mainFrame.getContentPane().add(prenomField, gridPrenomField);
		prenomField.setColumns(10);
		
		numTelField = new JTextField();
		GridBagConstraints gridNumTelField = new GridBagConstraints();
		gridNumTelField.insets = new Insets(0, 0, 5, 5);
		gridNumTelField.fill = GridBagConstraints.BOTH;
		gridNumTelField.gridx = 7;
		gridNumTelField.gridy = 4;
		mainFrame.getContentPane().add(numTelField, gridNumTelField);
		numTelField.setColumns(10);
		
		matiereField = new JTextField();
		matiereField.setColumns(10);
		GridBagConstraints gridMatiereField = new GridBagConstraints();
		gridMatiereField.insets = new Insets(0, 0, 5, 5);
		gridMatiereField.fill = GridBagConstraints.BOTH;
		gridMatiereField.gridx = 9;
		gridMatiereField.gridy = 4;
		mainFrame.getContentPane().add(matiereField, gridMatiereField);
		
		
		buttonUpdate = new JButton("Modifier un enseignant");
		// modifier un enseignant
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
//				if ((nomField.getText().length() + prenomField.getText().length() + numTelField.getText().length() 
//					+ matiereField.getText().length()) > 4) { String nom = nomField.getText();
//				  	String prenom = prenomField.getText(); String numTel = numTelField.getText();
//				  	String matiere = matiereField.getText(); String login = nom.toLowerCase() +
//				  			"." + prenom.toLowerCase(); String pass = "ens" + numTel; 
//				  	//deleteEnseignant; PAS FINI addEnseignant(login, pass, Enseignant.utilEns, nom, prenom, numTel, matiere); 
//				}
//				else {
//					JOptionPane.showMessageDialog(new JFrame(),"Une erreur est survenue !", "Dialog",
//							JOptionPane.ERROR_MESSAGE);
//				}
			}
		});
		GridBagConstraints gridButtonUpdate = new GridBagConstraints();
		gridButtonUpdate.fill = GridBagConstraints.HORIZONTAL;
		gridButtonUpdate.insets = new Insets(0, 0, 5, 5);
		gridButtonUpdate.gridx = 5;
		gridButtonUpdate.gridy = 11;
		mainFrame.getContentPane().add(buttonUpdate, gridButtonUpdate);
		
		buttonDelete = new JButton("Supprimer un enseignant");
		// supprimer un enseignant
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
				if ((nomField.getText().length() + prenomField.getText().length() + numTelField.getText().length() 
						+ matiereField.getText().length()) > 4) {
					String nom = nomField.getText();
					String prenom = prenomField.getText();
					String numTel = numTelField.getText();
					String loginAuth = nom.toLowerCase() + "." + prenom.toLowerCase();
					String passAuth = "ens" + numTel;
					delEnseignant(loginAuth, passAuth);
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Une erreur est survenue !", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		GridBagConstraints gridButtonDelete = new GridBagConstraints();
		gridButtonDelete.fill = GridBagConstraints.HORIZONTAL;
		gridButtonDelete.insets = new Insets(0, 0, 5, 5);
		gridButtonDelete.gridx = 7;
		gridButtonDelete.gridy = 11;
		mainFrame.getContentPane().add(buttonDelete, gridButtonDelete);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionnaireGUI gestGUI = new GestionnaireGUI();
				mainFrame.dispose();
				gestGUI.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.insets = new Insets(0, 0, 5, 5);
		gridButtonHome.gridx = 1;
		gridButtonHome.gridy = 13;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
	}

	
	/**
	 * Ajoute un enseignant
	 * @param login
	 * @param pass
	 * @param utilEns
	 * @param nom
	 * @param prenom
	 * @param numTelProf
	 * @param matiere
	 */
	public void addEnseignant(String login, String pass, int utilEns, String nom, String prenom, String numTelProf, String matiere) {
		// on recupere le fournisseur en BDD
		EnseignantDAO ensDAO = new EnseignantDAO();
		Enseignant enseignant = new Enseignant(login, pass, utilEns, nom, prenom, numTelProf, matiere);
		int ens = ensDAO.addEnseignant(enseignant);

		if (ens == 0) {
			JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de l\'ajout de l\'enseignant.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(new JFrame(), "L\'enseignant a bien ete ajoute.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * CETTE FONCTIONNALITE N'EST PAS DISPONIBLE
	 * @param loginAuth
	 */
	public void delEnseignant(String loginAuth, String passAuth) {
		EnseignantDAO ensDAO = new EnseignantDAO();
		int ens = ensDAO.delete(loginAuth, passAuth);
		
		if (ens == 0) {
			JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de la suppression de l\'enseignant.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(new JFrame(), "L\'enseignant a bien ete supprime.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
