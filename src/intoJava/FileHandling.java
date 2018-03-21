package intoJava;

import java.io.*;


public class FileHandling {

	public static void main(String[] args) {
		
		//for(int i=0; i<2; i++) {
		try {
		 boolean newfile = false;	
		File file = new File("manmohansingh.txt");
		System.out.println(file.exists());				//boolean type function.
		
		newfile = file.createNewFile();
		System.out.println(newfile);
		System.out.println(file.exists());
		}
		catch (IOException e){
			System.out.println(e.getStackTrace());
		}
		//}

	}

}
