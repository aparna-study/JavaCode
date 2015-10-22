package practice.main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Random rand=new Random();
		int h=rand.nextInt(100);
		
		System.out.println(h);
		
//		Scanner scn=new Scanner(System.in);
//		System.out.println("Enter Something");
//		String str=scn.nextLine();
//		scn.nextInt();
//		System.out.println("str");
//	//	
	
	//	String[] strArr = str.split(" ");
		
	//	String firstele= strArr[1];
	//	firstele.charAt(0);
		System.out.println("Enter Something to write in file");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
		String myString=br.readLine();
		File myFile=new File("sale.txt");
		//BufferedReader br=new BufferedReader();
		
		FileWriter frWrite= new FileWriter(myFile);
		BufferedWriter brWrite=new BufferedWriter(frWrite);
		
		brWrite.write(myString);
		brWrite.flush();
			
		FileReader fileread= new FileReader(myFile);
		BufferedReader brFileRead= new BufferedReader(fileread);
		String line = null;
		while( (line = brFileRead.readLine()) != null){
			System.out.println(line);
			
		}
		}
		catch(IOException e)
		{
			
		}
		
		Tree bST= new Tree();
		 bST.addElement(bST.getRoot(), 17);
		 bST.addElement(bST.getRoot(), 25);
		 bST.addElement(bST.getRoot(), 15);
		 bST.addElement(bST.getRoot(), 20);
		 bST.addElement(bST.getRoot(), 10);
		 
		 bST.inorderTraverse(bST.getRoot());
		
	

	}

}
