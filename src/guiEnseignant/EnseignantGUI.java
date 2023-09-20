package guiEnseignant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.*;


import gui.ConnectionGUI;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class EnseignantGUI {

	private JFrame mainFrame;
	private JButton buttonPlanning;
	private JButton buttonCoursActuel;
	private JButton buttonOff;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnseignantGUI window = new EnseignantGUI();
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
	public EnseignantGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Enseignant");
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{226, 144, 1, 0};
		gridBagLayout.rowHeights = new int[]{56, 43, 68, 30, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		buttonCoursActuel = new JButton("Cours actuel");
		buttonCoursActuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoursActuel coursActuel = new CoursActuel();
				mainFrame.dispose();
		        coursActuel.main(null);
			}
		});
		GridBagConstraints gridButtonCoursActuel = new GridBagConstraints();
		gridButtonCoursActuel.fill = GridBagConstraints.BOTH;
		gridButtonCoursActuel.insets = new Insets(0, 0, 5, 5);
		gridButtonCoursActuel.gridx = 1;
		gridButtonCoursActuel.gridy = 1;
		mainFrame.getContentPane().add(buttonCoursActuel, gridButtonCoursActuel);
		
		buttonPlanning = new JButton("Planning");
		buttonPlanning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlanningEnseignant planning = new PlanningEnseignant();
				mainFrame.dispose();
		        planning.main(null);
			}
		});
		GridBagConstraints gridButtonPlanning = new GridBagConstraints();
		gridButtonPlanning.fill = GridBagConstraints.BOTH;
		gridButtonPlanning.insets = new Insets(0, 0, 5, 5);
		gridButtonPlanning.gridx = 0;
		gridButtonPlanning.gridy = 1;
		mainFrame.getContentPane().add(buttonPlanning, gridButtonPlanning);
		
		
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
		gridButtonOff.insets = new Insets(0, 0, 0, 5);
		gridButtonOff.gridx = 0;
		gridButtonOff.gridy = 3;
		mainFrame.getContentPane().add(buttonOff, gridButtonOff);
	}

}
