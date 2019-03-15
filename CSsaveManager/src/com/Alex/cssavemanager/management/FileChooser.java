package com.Alex.cssavemanager.management;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class FileChooser extends JPanel {
	private JFileChooser chooser;
	private String choosertitle;
	private File folderPath;
	
	public FileChooser()
	{
		JOptionPane.showMessageDialog(null, "Select Saves directory", "Select Directory", JOptionPane.PLAIN_MESSAGE);
		folderPath = showFileViewer();
		System.out.println(folderPath.getPath());
	}
	
	public File showFileViewer()
	{
		chooser = new JFileChooser(); 
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle(choosertitle);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		// disable the "All files" option.
		chooser.setAcceptAllFileFilterUsed(false);
		
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			SettingsHelper.writeSetting(chooser.getSelectedFile().getParent(), "SavesPath: " + chooser.getSelectedFile().getPath());
			return chooser.getSelectedFile();
		}
		else {
			System.out.println("No Selection ");
			System.exit(0);
		}
		return null;
	}
}
