/*

This is an attempt to create a program that will first get the full pathname for each image file in each subdirectory of
a chosen directory.
This will then show each image for a certain amount of seconds.
This will be in a continuous loop
Every time the loop ends it will scan each subdirectory again for added or deleted files
 */

/*
TODO
	V Select directory
	V Loop through directory and add subdirectories to Array(List)
	V Loop through subdirectories and add files in each subdirectory to multidimensional array
	V Loop through multidimensional array and display each filename
	  row 0 col 0, row 1 col 0, row 2 col 0...
	  row 0 col 1, row 1 col 1, row 2 col 1...
	  if one subdirectory contains less files than another subdirectory
	  start at the first element of that subdirectory again. Repeat until each subdirectory has the same amount of displays
	- Display each image file on screen
	- Create settings box for:
	  Time to display images, use image dimension or covert to full screen...
	  Possibility to select files that will be displayed longer than others
	  Possibility to select files that must be displayed one after another
 */

package nl.huijbregts_digitaal;

import javax.swing.*;

public class Main
{
	public static void main(String[] args)
	{
		ListFiles listFiles = new ListFiles();
		String subs = listFiles.filesInSubDir();
		System.out.println(subs);
	}
}
