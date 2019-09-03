package com.inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task4SplitData {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(args[0]);
			int size=fis.available()/Integer.parseInt(args[1]);
			File f=new File(args[1]);
			int k=0;
			int formind=args[0].length();
			if(args[0].lastIndexOf(".")!=-1)
				formind=args[0].lastIndexOf(".");
			String fname=args[0].substring(0,formind);
			
			String format="";
			if(formind!=args[0].length())
				format=args[0].substring(formind,args[0].length());
			
			for(int i=0;i<Integer.parseInt(args[1])-1;i++) {
				f=new File(fname+(++k)+format);
				while(true) {
					if(f.exists()) {
						f=new File(fname+(++k)+format);
					}
					else
						break;
				}
				fos=new FileOutputStream(f);
				byte[] b=new byte[size];
				fis.read(b);
				fos.write(b);
				fos.close();
			}
			f=new File(fname+(++k)+format);
			while(true) {
				if(f.exists()) {
					f=new File(fname+(++k)+format);
				}
				else
					break;
			}
			fos=new FileOutputStream(f);
			byte[] b=new byte[fis.available()];
			fos.write(b);
			System.out.println("file split successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
