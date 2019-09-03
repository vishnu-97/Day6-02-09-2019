package com.inout;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Task3Cities {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 5 cities ");
		PrintStream p=null;
		try {
			p=new PrintStream("cities.txt");
			for(int i=0;i<5;i++) {
				p.append(in.nextLine());
				p.append("\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			p.close();
			in.close();
		}
		
	}

}
