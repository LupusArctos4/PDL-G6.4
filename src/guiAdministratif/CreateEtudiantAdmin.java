package guiAdministratif;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import dao.EtudiantDAO;
import model.Etudiant;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class CreateEtudiantAdmin {

	private JFrame mainFrame;
	private JTextField nomField;
	private JTextField prenomField;
	private JTextField filiereField;
	private JLabel nomLabel;
	private JLabel prenomLabel;
	private JLabel filiereLabel;
	private JButton buttonHome;
	private JButton buttonSupprEtu;
	private JButton buttonModEtu;
	private JButton buttonAddEtu;

	AdministratifGUI adminGUI = new AdministratifGUI();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateEtudiantAdmin window = new CreateEtudiantAdmin();
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
	public CreateEtudiantAdmin() {
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
		
		filiereLabel = new JLabel("Classique ou Apprentissage");
		GridBagConstraints gridFiliereLabel = new GridBagConstraints();
		gridFiliereLabel.insets = new Insets(0, 0, 5, 5);
		gridFiliereLabel.gridx = 9;
		gridFiliereLabel.gridy = 3;
		mainFrame.getContentPane().add(filiereLabel, gridFiliereLabel);
		
		nomField = new JTextField();
		GridBagConstraints gridNomField = new GridBagConstraints();
		gridNomField.insets = new Insets(0, 0, 5, 5);
		gridNomField.fill = GridBagConstraints.HORIZONTAL;
		gridNomField.gridx = 3;
		gridNomField.gridy = 4;
		mainFrame.getContentPane().add(nomField, gridNomField);
		nomField.setColumns(10);
		
		buttonAddEtu = new JButton("Ajouter un etudiant");
		buttonAddEtu.addActionListener(new ActionListener() {
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
		GridBagConstraints gridButtonAddEtu = new GridBagConstraints();
		gridButtonAddEtu.fill = GridBagConstraints.HORIZONTAL;
		gridButtonAddEtu.insets = new Insets(0, 0, 5, 5);
		gridButtonAddEtu.gridx = 3;
		gridButtonAddEtu.gridy = 11;
		mainFrame.getContentPane().add(buttonAddEtu, gridButtonAddEtu);
		
		filiereField = new JTextField();
		GridBagConstraints gridFiliereField = new GridBagConstraints();
		gridFiliereField.insets = new Insets(0, 0, 5, 5);
		gridFiliereField.fill = GridBagConstraints.HORIZONTAL;
		gridFiliereField.gridx = 9;
		gridFiliereField.gridy = 4;
		mainFrame.getContentPane().add(filiereField, gridFiliereField);
		filiereField.setColumns(10);
		
		prenomField = new JTextField();
		GridBagConstraints gridPrenomField = new GridBagConstraints();
		gridPrenomField.insets = new Insets(0, 0, 5, 5);
		gridPrenomField.fill = GridBagConstraints.HORIZONTAL;
		gridPrenomField.gridx = 6;
		gridPrenomField.gridy = 4;
		mainFrame.getContentPane().add(prenomField, gridPrenomField);
		prenomField.setColumns(10);
		
		
		buttonModEtu = new JButton("Modifier un etudiant");
		buttonModEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
			}
		});
		GridBagConstraints gridButtonModEtu = new GridBagConstraints();
		gridButtonModEtu.fill = GridBagConstraints.HORIZONTAL;
		gridButtonModEtu.insets = new Insets(0, 0, 5, 5);
		gridButtonModEtu.gridx = 6;
		gridButtonModEtu.gridy = 11;
		mainFrame.getContentPane().add(buttonModEtu, gridButtonModEtu);
		
		buttonSupprEtu = new JButton("Supprimer un etudiant");
		buttonSupprEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
			}
		});
		GridBagConstraints gridButtonSupprEtu = new GridBagConstraints();
		gridButtonSupprEtu.fill = GridBagConstraints.HORIZONTAL;
		gridButtonSupprEtu.insets = new Insets(0, 0, 5, 5);
		gridButtonSupprEtu.gridx = 9;
		gridButtonSupprEtu.gridy = 11;
		mainFrame.getContentPane().add(buttonSupprEtu, gridButtonSupprEtu);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				adminGUI.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.insets = new Insets(0, 0, 5, 5);
		gridButtonHome.gridx = 1;
		gridButtonHome.gridy = 14;
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
