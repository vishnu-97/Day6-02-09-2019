package com.inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Task5Merge {

	public static void main(String[] args) {
		
		Vector<FileInputStream> v=new Vector<>();
		for(int i=0;i<args.length;i++) {
			File f=new File(args[i]);
			if(f.exists())
				try {
					v.add(new FileInputStream(f));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		Enumeration<FileInputStream> e=v.elements();
		SequenceInputStream s=new SequenceInputStream(e); 
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("awdaw.txt");
		   while(true) {
			   int b=s.read();
			   if(b==-1)
				   break;
			   fos.write(b);
				
			} 
		   System.out.println("File has been merged into"+"awdaw.txt");
        	
        }catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			try {
				s.close();
				fos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	        
		
	}

}
