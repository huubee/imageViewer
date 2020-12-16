package nl.huijbregts_digitaal;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class ListFiles
{
	//creates an instance of the 'ListSubdirectories' Class
	ListSubdirectories ls = new ListSubdirectories();
	File[] dirs = ls.subDirs();

	public String filesInSubDir()
	{
		//a check to see if the subdirectories are still in the array now called 'dirs'
		System.out.println("ListFiles.java... The Array \"dirs\" contains: " + Arrays.toString(dirs));

		//create a multidimensional ArrayList 'arrayList' where each row will be filled
		//with the full pathname to all the files within each subdirectory
		ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < dirs.length; i++)
		{
			//loop through the 'dirs' Array and get the path to the subdirectory
			// at the position of the counter 'i'
			int j = i+1;
			File filename = dirs[i];
			System.out.println("subdir " + j + " " + filename.toString());
			//create a new row in the multidimensional ArrayList 'arrayList'
			arrayList.add(new ArrayList<String>());
			//Loop through the 'dirs' Array
			File file = new File(String.valueOf(dirs[i]));
			String[] fileList = file.list();

			//get the filenames from the subdirectories and use StringBuilder
			// to construct the full pathname for each file in the subdirectorie
			for(String name:fileList)
			{
				StringBuilder pad = new StringBuilder().append(filename.toString()).append(name);
				//add each path to row 'i' of the MultiDimensional Array
				arrayList.get(i).add(pad.toString());
			}
		}
		System.out.println(arrayList);
		return "end \"ListFiles.java\"";
	}

}
