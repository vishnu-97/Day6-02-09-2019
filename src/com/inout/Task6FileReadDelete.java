package com.inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task6FileReadDelete {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String s=in.nextLine();
		try (FileReader fr=new FileReader(s)){
			while(true) {
				int c=fr.read();
				if(c==-1)
					break;
				System.out.print((char)c);
			}
			new File(s).deleteOnExit();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.close();
	}

}
