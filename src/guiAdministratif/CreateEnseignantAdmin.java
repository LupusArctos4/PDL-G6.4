package guiAdministratif;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class CreateEnseignantAdmin {

	private JFrame mainFrame;
	private JTextField nomField;
	private JTextField prenomField;
	private JTextField numTelField;
	private JTextField matiereField;
	private JLabel matiereLabel;
	private JLabel nomLabel;
	private JLabel prenomLabel;
	private JLabel numTelLabel;
	private JButton buttonAddEns;
	private JButton buttonSupprEns;
	private JButton buttonModEns;
	private JButton buttonHome;
	
	AdministratifGUI adminGUI = new AdministratifGUI();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateEnseignantAdmin window = new CreateEnseignantAdmin();
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
	public CreateEnseignantAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Creer un enseignant");
		mainFrame.setBounds(100, 100, 874, 543);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		numTelLabel = new JLabel("Numero de telephone");
		GridBagConstraints gridNumTelLabel = new GridBagConstraints();
		gridNumTelLabel.insets = new Insets(0, 0, 5, 5);
		gridNumTelLabel.gridx = 9;
		gridNumTelLabel.gridy = 3;
		mainFrame.getContentPane().add(numTelLabel, gridNumTelLabel);
		
		matiereLabel = new JLabel("Matiere");
		GridBagConstraints gridMatiereLabel = new GridBagConstraints();
		gridMatiereLabel.insets = new Insets(0, 0, 5, 5);
		gridMatiereLabel.gridx = 11;
		gridMatiereLabel.gridy = 3;
		mainFrame.getContentPane().add(matiereLabel, gridMatiereLabel);
		
		nomField = new JTextField();
		GridBagConstraints gridNomField = new GridBagConstraints();
		gridNomField.insets = new Insets(0, 0, 5, 5);
		gridNomField.fill = GridBagConstraints.HORIZONTAL;
		gridNomField.gridx = 3;
		gridNomField.gridy = 4;
		mainFrame.getContentPane().add(nomField, gridNomField);
		nomField.setColumns(10);
		
		buttonAddEns = new JButton("Ajouter un enseignant");
		buttonAddEns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gridButtonAddEns = new GridBagConstraints();
		gridButtonAddEns.fill = GridBagConstraints.HORIZONTAL;
		gridButtonAddEns.insets = new Insets(0, 0, 5, 5);
		gridButtonAddEns.gridx = 3;
		gridButtonAddEns.gridy = 10;
		mainFrame.getContentPane().add(buttonAddEns, gridButtonAddEns);
		
		matiereField = new JTextField();
		matiereField.setColumns(10);
		GridBagConstraints gridMatiereField = new GridBagConstraints();
		gridMatiereField.insets = new Insets(0, 0, 5, 5);
		gridMatiereField.fill = GridBagConstraints.HORIZONTAL;
		gridMatiereField.gridx = 11;
		gridMatiereField.gridy = 4;
		mainFrame.getContentPane().add(matiereField, gridMatiereField);
		
		prenomField = new JTextField();
		GridBagConstraints gridPrenomField = new GridBagConstraints();
		gridPrenomField.insets = new Insets(0, 0, 5, 5);
		gridPrenomField.fill = GridBagConstraints.HORIZONTAL;
		gridPrenomField.gridx = 6;
		gridPrenomField.gridy = 4;
		mainFrame.getContentPane().add(prenomField, gridPrenomField);
		prenomField.setColumns(10);
		
		numTelField = new JTextField();
		GridBagConstraints gridNumTelField = new GridBagConstraints();
		gridNumTelField.insets = new Insets(0, 0, 5, 5);
		gridNumTelField.fill = GridBagConstraints.HORIZONTAL;
		gridNumTelField.gridx = 9;
		gridNumTelField.gridy = 4;
		mainFrame.getContentPane().add(numTelField, gridNumTelField);
		numTelField.setColumns(10);
		
		buttonModEns = new JButton("Modifier un enseignant");
		GridBagConstraints gridButtonModEns = new GridBagConstraints();
		gridButtonModEns.fill = GridBagConstraints.HORIZONTAL;
		gridButtonModEns.insets = new Insets(0, 0, 5, 5);
		gridButtonModEns.gridx = 6;
		gridButtonModEns.gridy = 10;
		mainFrame.getContentPane().add(buttonModEns, gridButtonModEns);
		
		buttonSupprEns = new JButton("Supprimer un enseignant");
		GridBagConstraints gridButtonSupprEns = new GridBagConstraints();
		gridButtonSupprEns.fill = GridBagConstraints.HORIZONTAL;
		gridButtonSupprEns.insets = new Insets(0, 0, 5, 5);
		gridButtonSupprEns.gridx = 9;
		gridButtonSupprEns.gridy = 10;
		mainFrame.getContentPane().add(buttonSupprEns, gridButtonSupprEns);
		
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
		gridButtonHome.gridy = 13;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
	}
}
