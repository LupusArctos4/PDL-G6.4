package guiGestionnaire;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;


import dao.EtudiantDAO;
import model.Etudiant;


public class CreateEtudiantGest {

	private JFrame mainFrame;
	private JTextField nomField;
	private JTextField prenomField;
	private JTextField filiereField;
	private JLabel nomLabel;
	private JLabel prenomLabel;
	private JLabel filiereLabel;
	private JButton buttonAdd;
	private JButton buttonUpdate;
	private JButton buttonDelete;
	private JButton buttonHome;
	
	
	GestionnaireGUI gestGUI = new GestionnaireGUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateEtudiantGest window = new CreateEtudiantGest();
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
	public CreateEtudiantGest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Creer un etudiant");
		mainFrame.setBounds(100, 100, 874, 543);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		gridPrenomLabel.gridx = 6;
		gridPrenomLabel.gridy = 3;
		mainFrame.getContentPane().add(prenomLabel, gridPrenomLabel);
		
		nomField = new JTextField();
		GridBagConstraints gridNomField = new GridBagConstraints();
		gridNomField.insets = new Insets(0, 0, 5, 5);
		gridNomField.fill = GridBagConstraints.HORIZONTAL;
		gridNomField.gridx = 3;
		gridNomField.gridy = 4;
		mainFrame.getContentPane().add(nomField, gridNomField);
		nomField.setColumns(10);
		
		buttonAdd = new JButton("Ajouter un etudiant");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//vérifier que ce qu'il y a dans la case de la filiere c'est bien 1 ou 2
				if (nomField.getText().length() > 0) {
					String nom = nomField.getText();
					String prenom = prenomField.getText();
					String filiereStr = filiereField.getText();
					int filiere = Integer.valueOf(filiereStr);
					String email = prenom + "." + nom + "@groupe-esigelec.org";
					String login = nom.toLowerCase() + "." + prenom.toLowerCase();
					String pass = "etu" + prenom.toLowerCase() + nom.toLowerCase();
					addEtudiant(login, pass, Etudiant.utilEtu, nom, prenom, email, filiere);
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
		
		
		prenomField = new JTextField();
		GridBagConstraints gbc_prenomField = new GridBagConstraints();
		gbc_prenomField.insets = new Insets(0, 0, 5, 5);
		gbc_prenomField.fill = GridBagConstraints.HORIZONTAL;
		gbc_prenomField.gridx = 6;
		gbc_prenomField.gridy = 4;
		mainFrame.getContentPane().add(prenomField, gbc_prenomField);
		prenomField.setColumns(10);
		
		filiereLabel = new JLabel("Classique (note 1) ou Apprentissage (note 2)");
		GridBagConstraints gridFiliereLabel = new GridBagConstraints();
		gridFiliereLabel.insets = new Insets(0, 0, 5, 5);
		gridFiliereLabel.gridx = 6;
		gridFiliereLabel.gridy = 7;
		mainFrame.getContentPane().add(filiereLabel, gridFiliereLabel);
		
		filiereField = new JTextField();
		GridBagConstraints gbc_filiereField = new GridBagConstraints();
		gbc_filiereField.insets = new Insets(0, 0, 5, 5);
		gbc_filiereField.fill = GridBagConstraints.HORIZONTAL;
		gbc_filiereField.gridx = 6;
		gbc_filiereField.gridy = 8;
		mainFrame.getContentPane().add(filiereField, gbc_filiereField);
		filiereField.setColumns(10);
		
		buttonUpdate = new JButton("Modifier un etudiant");
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
			}
		});
		GridBagConstraints gridButtonUpdate = new GridBagConstraints();
		gridButtonUpdate.fill = GridBagConstraints.HORIZONTAL;
		gridButtonUpdate.insets = new Insets(0, 0, 5, 5);
		gridButtonUpdate.gridx = 6;
		gridButtonUpdate.gridy = 11;
		mainFrame.getContentPane().add(buttonUpdate, gridButtonUpdate);
		
		buttonDelete = new JButton("Supprimer un etudiant");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
			}
		});
		GridBagConstraints gridButtonDelete = new GridBagConstraints();
		gridButtonDelete.fill = GridBagConstraints.HORIZONTAL;
		gridButtonDelete.insets = new Insets(0, 0, 5, 5);
		gridButtonDelete.gridx = 9;
		gridButtonDelete.gridy = 11;
		mainFrame.getContentPane().add(buttonDelete, gridButtonDelete);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
	 * 
	 * @param login
	 * @param pass
	 * @param utilEns
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param filiere
	 */
	public void addEtudiant(String login, String pass, int utilEns, String nom, String prenom, String email, int filiere) {
		// on recupere le fournisseur en BDD
		EtudiantDAO etuDAO = new EtudiantDAO();
		Etudiant etudiant= new Etudiant(login, pass, utilEns, nom, prenom, email, filiere, 0);
		int etu = etuDAO.addEtudiant(etudiant);

		if (etu == 0) {
			JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de l\'ajout de l\'etudiant.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(new JFrame(), "L\'etudiant a bien ete ajoute.", "Dialog",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
