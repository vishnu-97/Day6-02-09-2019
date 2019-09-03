package com.inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class Task7Merge2file {
	public static void main(String ar[]) {
		Scanner in=new Scanner(System.in);
		
		try (
		SequenceInputStream s=new SequenceInputStream(new FileInputStream(in.nextLine()),new FileInputStream(in.nextLine())); 
		FileOutputStream fos=new FileOutputStream("awdaw1.txt")) {
		  
		   while(true) {
			   int b=s.read();
			   if(b==-1)
				   break;
			   fos.write(b);
			   System.out.print((char)b);
			} 
		   System.out.println("File has been merged into"+"awdaw.txt");
        	
        }catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		in.close();
	}
}
