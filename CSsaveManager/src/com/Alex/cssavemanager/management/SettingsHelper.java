package com.Alex.cssavemanager.management;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JOptionPane;

public class SettingsHelper {
	
	private static String currentDirectory = System.getProperty("user.dir");
	private static PrintWriter pw;
	
	//creates a file that holds the settings
	public static void writeSetting(String filePath, String msg) {
		//file at the given filePath
		File settings = new File(currentDirectory + "//savemanager_config.ini");
		createFile(settings);
		
		//write message to the file
		try {
			pw = new PrintWriter(settings.getPath(), "UTF-8");
			pw.write(msg);
			pw.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			JOptionPane.showMessageDialog(null, "Could not create settings file", "ERROR", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void createFile(File file) {
		boolean flag = false;
		try {
			flag = file.mkdir();
		} catch(SecurityException Se) {
			JOptionPane.showMessageDialog(null, "Error in making settings file", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		if(flag) //check if the file is created or not
			System.out.println("Directory established");
		else if(file.exists())
			System.out.println("Directory already established");
		else {
			System.out.println("Directory unsuccessfully established");
			System.exit(1);
		}
		
	}
}
