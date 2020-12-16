package nl.huijbregts_digitaal;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class ListSubdirectories
{
	//creates an instance of the 'ChooseDirectory' Class and gets the path to the selected directory
	ChooseDirectory cd = new ChooseDirectory();
	String direct = cd.choose();

	public File[] subDirs()
	{
		//this is where the subdirectories are listed in the directory gotten from the instance of 'ChooseDirectory'
		File dir = new File(direct);
		File[] files = dir.listFiles();
		FileFilter fileFilter = new FileFilter()
		{
			public boolean accept(File file)
			{
				return file.isDirectory();
			}
		};
		//this is where is checked how many subdirectories are in the main path
		files = dir.listFiles(fileFilter);
		System.out.println(new StringBuilder().append("There are ").append(files.length).append(" subdirectories in ").append(direct).toString());

		if (files.length == 0)
		{
			System.out.println("Either dir does not exist or is not a directory");
		} else
		{
			//here the paths to the subdirectories are stored in an Array 'files'
			for (int i = 0; i< files.length; i++)
			{
				File filename = files[i];
				System.out.println(filename.toString());
			}
		}
		System.out.println("The Array \"files\" contains: " + Arrays.toString(files));
		String[] test = {"ListSubDirectories 1"};
		return files;
	}

}
