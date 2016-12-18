/**
 * Gauri Ramesh
 * Advent of Code 2016 Day 3 Problem 1
 * 12/18/2016
 */

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Day3_2016 {

	public static void main(String args[])
	{
		File f = new File("C:\\Users\\New\\Documents\\College 2016-2017\\Advent of Code\\2016\\Day3_2016.txt");
		List<String> sidelengths = new ArrayList<String>();
		try {
			sidelengths = Files.readAllLines(f.toPath(), Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		List<String> possibleTriangles = new ArrayList<String>();
		for(int i = 0; i < sidelengths.size(); i++)
		{
			String [] splitLengths = sidelengths.get(i).split("\\s+");
			//We begin indexing at 1 because there is a leading whitespace, causing the split regex to give [0] as an empty string.
			String split1 = splitLengths[1].trim();
			String split2 = splitLengths[2].trim();
			String split3 = splitLengths[3].trim();
			int sidelength1 = Integer.parseInt(split1);
			int sidelength2 = Integer.parseInt(split2);
			int sidelength3 = Integer.parseInt(split3);
			if(sidelength1+sidelength2 > sidelength3 && sidelength2+sidelength3 > sidelength1 && sidelength1+sidelength3 > sidelength2)
			{
				possibleTriangles.add(sidelengths.get(i));
			}
			
		}
		System.out.println("There are " + possibleTriangles.size() + " possible triangles.");
	}
}
