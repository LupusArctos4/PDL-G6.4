package guiEtudiant;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import model.*;
import gui.*;

public class JustifierAbsenceGUI {

	private JFrame mainFrame;
	private JTextField motifField;
	private JLabel motifAbsLabel;
	private JButton buttonPiecesJointes;
	private JButton buttonHome;
	private JButton buttonRetour;
	private JButton buttonEnvoyer;
	
	ConnectionGUI conGUI = new ConnectionGUI();
	EtudiantGUI etuGUI = new EtudiantGUI();
	AbsenceGUI absGUI = new AbsenceGUI();
	private TraiterJustificatifAbs  tjAbs = new TraiterJustificatifAbs(null,null);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JustifierAbsenceGUI window = new JustifierAbsenceGUI();
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
	public JustifierAbsenceGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Jusifier absence 1");
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{70, 78, 201, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{68, 20, 31, 21, 41, 21, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		motifAbsLabel = new JLabel("Motif :");
		GridBagConstraints gridMotifAbsLabel = new GridBagConstraints();
		gridMotifAbsLabel.fill = GridBagConstraints.BOTH;
		gridMotifAbsLabel.insets = new Insets(0, 0, 5, 5);
		gridMotifAbsLabel.gridx = 1;
		gridMotifAbsLabel.gridy = 1;
		mainFrame.getContentPane().add(motifAbsLabel, gridMotifAbsLabel);
		
		motifField = new JTextField();
		GridBagConstraints gridMotifField = new GridBagConstraints();
		gridMotifField.fill = GridBagConstraints.BOTH;
		gridMotifField.insets = new Insets(0, 0, 5, 5);
		gridMotifField.gridx = 2;
		gridMotifField.gridy = 1;
		mainFrame.getContentPane().add(motifField, gridMotifField);
		motifField.setColumns(10);
		
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
		gridButtonHome.gridy = 5;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
		
		buttonPiecesJointes = new JButton("Pieces jointes");
		buttonPiecesJointes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
			}
		});
		GridBagConstraints gridButtonPiecesJointes = new GridBagConstraints();
		gridButtonPiecesJointes.fill = GridBagConstraints.BOTH;
		gridButtonPiecesJointes.insets = new Insets(0, 0, 5, 5);
		gridButtonPiecesJointes.gridx = 2;
		gridButtonPiecesJointes.gridy = 2;
		mainFrame.getContentPane().add(buttonPiecesJointes, gridButtonPiecesJointes);
		
		buttonEnvoyer = new JButton("Envoyer");
		buttonEnvoyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),"Cette fonctionnalité n'est pas fonctionnel !", "Dialog", JOptionPane.ERROR_MESSAGE);
				Absence abs = absGUI.getAbs();
				SuperAdmin sa = conGUI.getSuperAdmin();
				tjAbs.setAbs(abs);
				tjAbs.setSA(sa);
			}
		});
		GridBagConstraints gridButtonEnvoyer = new GridBagConstraints();
		gridButtonEnvoyer.fill = GridBagConstraints.BOTH;
		gridButtonEnvoyer.insets = new Insets(0, 0, 5, 5);
		gridButtonEnvoyer.gridx = 2;
		gridButtonEnvoyer.gridy = 3;
		mainFrame.getContentPane().add(buttonEnvoyer, gridButtonEnvoyer);
		
		
		buttonRetour = new JButton("RETOUR");
		buttonRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbsenceGUI abs = new AbsenceGUI();
				mainFrame.dispose();
				abs.main(null);
			}
		});
		GridBagConstraints gridButtonRetour = new GridBagConstraints();
		gridButtonRetour.insets = new Insets(0, 0, 0, 5);
		gridButtonRetour.fill = GridBagConstraints.BOTH;
		gridButtonRetour.gridx = 3;
		gridButtonRetour.gridy = 5;
		mainFrame.getContentPane().add(buttonRetour, gridButtonRetour);
	}
}
