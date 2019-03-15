package com.Alex.cssavemanager;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Alex.cssavemanager.management.FileChooser;

public class Driver extends JFrame implements ActionListener {

	//components
	private JPanel contentPane;
	private JPanel panel;
	private JComboBox comboBox;
	private JButton btnNewButton;
	
	//file manager
	private FileChooser chooser;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver frame = new Driver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void init() {
		chooser = new FileChooser();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 442, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(50, 112, 341, 20);
		panel.add(comboBox);
		
		btnNewButton = new JButton("Set as Save Point");
		btnNewButton.setBounds(176, 192, 89, 23);
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		//pack();
	}
	
	/**
	 * Create the frame.
	 */
	public Driver() {
		init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
