package guiEnseignant;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;

public class CoursActuel {

	private JFrame mainFrame;
	private JTextField plageHeureField;
	private JTextField dateField;
	private JTextField nomCoursField;
	private JLabel plageHeureLabel;
	private JLabel dateLabel;
	private JLabel nomCoursLabel;
	private JButton buttonHome;
	private JButton buttonAppel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoursActuel window = new CoursActuel();
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
	public CoursActuel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Cours actuel");
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{91, 277, 0};
		gridBagLayout.rowHeights = new int[]{81, 20, 20, 20, 50, 23, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainFrame.getContentPane().setLayout(gridBagLayout);
		
		nomCoursLabel = new JLabel("Nom cours :");
		GridBagConstraints gridNomCoursLabel = new GridBagConstraints();
		gridNomCoursLabel.insets = new Insets(0, 0, 5, 5);
		gridNomCoursLabel.gridx = 0;
		gridNomCoursLabel.gridy = 1;
		mainFrame.getContentPane().add(nomCoursLabel, gridNomCoursLabel);
		
		nomCoursField = new JTextField();
		GridBagConstraints gridNomCoursField = new GridBagConstraints();
		gridNomCoursField.anchor = GridBagConstraints.NORTH;
		gridNomCoursField.fill = GridBagConstraints.HORIZONTAL;
		gridNomCoursField.insets = new Insets(0, 0, 5, 0);
		gridNomCoursField.gridx = 1;
		gridNomCoursField.gridy = 1;
		mainFrame.getContentPane().add(nomCoursField, gridNomCoursField);
		nomCoursField.setColumns(10);
		
		dateLabel = new JLabel("Date :");
		GridBagConstraints gridDateLabel = new GridBagConstraints();
		gridDateLabel.insets = new Insets(0, 0, 5, 5);
		gridDateLabel.gridx = 0;
		gridDateLabel.gridy = 2;
		mainFrame.getContentPane().add(dateLabel, gridDateLabel);
		
		dateField = new JTextField();
		GridBagConstraints gridDateField = new GridBagConstraints();
		gridDateField.anchor = GridBagConstraints.NORTH;
		gridDateField.fill = GridBagConstraints.HORIZONTAL;
		gridDateField.insets = new Insets(0, 0, 5, 0);
		gridDateField.gridx = 1;
		gridDateField.gridy = 2;
		mainFrame.getContentPane().add(dateField, gridDateField);
		dateField.setColumns(10);
		
		plageHeureLabel = new JLabel("Plage horaire :");
		GridBagConstraints gridPlageHeureLabel = new GridBagConstraints();
		gridPlageHeureLabel.anchor = GridBagConstraints.EAST;
		gridPlageHeureLabel.insets = new Insets(0, 0, 5, 5);
		gridPlageHeureLabel.gridx = 0;
		gridPlageHeureLabel.gridy = 3;
		mainFrame.getContentPane().add(plageHeureLabel, gridPlageHeureLabel);
		
		plageHeureField = new JTextField();
		GridBagConstraints gridPlageHeureField = new GridBagConstraints();
		gridPlageHeureField.anchor = GridBagConstraints.NORTH;
		gridPlageHeureField.fill = GridBagConstraints.HORIZONTAL;
		gridPlageHeureField.insets = new Insets(0, 0, 5, 0);
		gridPlageHeureField.gridx = 1;
		gridPlageHeureField.gridy = 3;
		mainFrame.getContentPane().add(plageHeureField, gridPlageHeureField);
		plageHeureField.setColumns(10);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnseignantGUI ens = new EnseignantGUI();
				mainFrame.dispose();
		        ens.main(null);
			}
		});
		GridBagConstraints gridButtonHome = new GridBagConstraints();
		gridButtonHome.anchor = GridBagConstraints.NORTHWEST;
		gridButtonHome.insets = new Insets(0, 0, 5, 5);
		gridButtonHome.gridx = 0;
		gridButtonHome.gridy = 5;
		mainFrame.getContentPane().add(buttonHome, gridButtonHome);
		
		buttonAppel = new JButton("Appel");
		buttonAppel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppelCoursActuel appel = new AppelCoursActuel();
				mainFrame.dispose();
		        appel.main(null);
			}
		});
		GridBagConstraints gridButtonAppel = new GridBagConstraints();
		gridButtonAppel.anchor = GridBagConstraints.NORTH;
		gridButtonAppel.fill = GridBagConstraints.HORIZONTAL;
		gridButtonAppel.insets = new Insets(0, 0, 5, 0);
		gridButtonAppel.gridx = 1;
		gridButtonAppel.gridy = 5;
		mainFrame.getContentPane().add(buttonAppel, gridButtonAppel);
	}

}
