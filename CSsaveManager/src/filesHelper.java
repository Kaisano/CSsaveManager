import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;


public class filesHelper extends JPanel {
	JFileChooser chooser;
	String choosertitle;
	
	public filesHelper()
	{
		JOptionPane.showMessageDialog(null, "Select Saves directory", "Select Directory", JOptionPane.PLAIN_MESSAGE);
		File folder = showFileViewer();
		System.out.println(folder.getPath());
	}
	public static void main(String[] args)
	{
		filesHelper f = new filesHelper();
	}
	//file HAS to be inside the given folder
	public void moveFile(String fName)
	{
		
	}
	public File showFileViewer()
	{
		chooser = new JFileChooser(); 
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle(choosertitle);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		//
		// disable the "All files" option.
		//
		chooser.setAcceptAllFileFilterUsed(false);
		//    
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
			return chooser.getCurrentDirectory();
		}
		else {
			System.out.println("No Selection ");
		}
		return null;
	}
}
