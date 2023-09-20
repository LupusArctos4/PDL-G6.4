package gui;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class test4 {
    static JFrame frame;
    static JComboBox combobox;
    static JLabel l1, l2;

    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test4 window = new test4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()  {
		frame = new JFrame("Declarer une absence");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test4 obj = new test4();
        frame.setLayout(new FlowLayout());
        String s1[] = { "Java", "PHP", "Python", "C++", "Ruby" };
        combobox = new JComboBox(s1);
        combobox.addItemListener((ItemListener) obj);
        l1 = new JLabel("Quel est votre langage prefere? ");
        l2 = new JLabel("[Java]");
        l2.setForeground(Color.blue);
        JPanel p = new JPanel();
        p.add(l1);
        p.add(combobox);
        //p.add(l2);
        frame.add(p);
        frame.setSize(400, 200);
        //frame.show();
        System.out.println(l2.getText());    
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combobox) {
            l2.setText(" ["+combobox.getSelectedItem()+"]");
            
        }
    }
}

