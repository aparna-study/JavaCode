package classwork;

import java.io.*;
import java.util.*;

public class FileIODemo {

	public static void main(String[] args) {
	
		try{
			File inFile=new File("data.txt");
			Scanner in=new Scanner(inFile);
			System.out.println("File found");
		}
		catch(IOException ex)
		{
			System.out.println("File data.txt does not exists");
		}
		
		//in.close();

	}

}
