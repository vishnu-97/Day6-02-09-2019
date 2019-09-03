package com.inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task1Rename {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in); 
		System.out.println(args[0]);
		File f=new File("e:/k.lst");
//		File f11=new File("e:/test.st");
//		System.out.println("SuCCESS : "+f.renameTo(f11));
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
//			System.out.println(fis.available());
			
			if(f.exists()&&f.isFile()&&fis.available()<1500) {
				File f2=new File("e:/ddd.lst");
//				System.out.println("RESULT : "+f.renameTo(f2));
				//File f2=new File(f.getParent()+args[1]);
				String name="";
				while(true) 
				{				
					
					if(f2.exists()) {
						System.out.println("file name exists please anter a new name ");
						name=in.nextLine();
						f2=new File(f.getParent()+name);
					}
					else {
						
						break;}
				}
				System.out.println("FIRST : "+f);
				System.out.println("SECOND : "+f2);
				System.out.println(f.exists());
				System.out.println(f2.exists());
//				System.out.println(f.renameTo(f2));
				System.out.println(f2.getPath());
				System.out.println(f.getPath());
				fis.close();
				if(f.renameTo(f2)) 
					System.out.println(args[0]+" File renamed to \""+args[1]+"\"");
				else
					System.out.println(args[0]+" file not renamed");
				
			}
			else {
				System.out.println("File not Renamable");
			}
		} catch (IOException e) {
			System.out.println("File not Found");
		}
		finally
		{
			try 
			{
//				fis.close();
				in.close();
			} catch (Exception e) {
				
			}
		}
	}
}
