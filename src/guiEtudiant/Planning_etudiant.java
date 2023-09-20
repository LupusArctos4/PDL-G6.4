package guiEtudiant;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class Planning_etudiant {

	private JFrame mainFrame;
	private JTable planningTable;
	private JButton buttonHome;
	
	
	EtudiantGUI etuGUI = new EtudiantGUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planning_etudiant window = new Planning_etudiant();
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
	public Planning_etudiant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Planning");
		mainFrame.setBounds(100, 100, 620, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		planningTable = new JTable();
		planningTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Horaire", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"},
				{"8h-9h", null, null, null, null, null, null, null},
				{"9h-10h", null, null, null, null, null, null, null},
				{"10h-11h", null, null, null, null, null, null, null},
				{"11h-12h", null, null, null, null, null, null, null},
				{"12h-13h", null, null, null, null, null, null, null},
				{"13h-14h", null, null, null, null, null, null, null},
				{"14h-15h", null, null, null, null, null, null, null},
				{"15h-16h", null, null, null, null, null, null, null},
				{"16h-17h", null, null, null, null, null, null, null},
				{"17h-18h", null, null, null, null, null, null, null},
			},
			new String[] {
				"Horaire", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"
			}
		));
		mainFrame.getContentPane().add(planningTable, BorderLayout.NORTH);
		
		buttonHome = new JButton("HOME");
		buttonHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				etuGUI.main(null);
			}
		});
		mainFrame.getContentPane().add(buttonHome, BorderLayout.SOUTH);
	}

}
