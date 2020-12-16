package nl.huijbregts_digitaal;

import javax.swing.*;

public class ChooseDirectory
{
	//opens a Swing frame in which to choose the main directory where the (sub) directories with the images are located
	//it returns the path to the directory where the subdirectories are located
	//this path is used in the 'ListSubdirectories' Class
	public String choose()
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle("choosertitle");
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);

		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
			System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
			System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
		} else
		{
			System.out.println("No Selection ");
		}
		return chooser.getSelectedFile().toString();

	}
}
