package guiEtudiant;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

import gui.ConnectionGUI;

public class EtudiantGUI {

	private JFrame mainFrame;
	private JButton buttonPlanning;
	private JButton buttonAbsence;
	private JButton buttonOff;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EtudiantGUI window = new EtudiantGUI();
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
	public EtudiantGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Etudiant");
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		
		buttonPlanning = new JButton("Planning");
		buttonPlanning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Planning_etudiant planning = new Planning_etudiant();
				mainFrame.dispose();
		        Planning_etudiant.main(null);
			}
		});
		mainFrame.getContentPane().add(buttonPlanning);
		
		buttonAbsence = new JButton("Absences");
		buttonAbsence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbsencesEtudiant absEtu = new AbsencesEtudiant();
				mainFrame.dispose();
		        absEtu.main(null);
			}
		});
		mainFrame.getContentPane().add(buttonAbsence);
		
		buttonOff = new JButton("Deconnexion");
		buttonOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionGUI conGUI = new ConnectionGUI();
				mainFrame.dispose();
		        conGUI.main(null);
			}
		});
		mainFrame.getContentPane().add(buttonOff);
	}

}
