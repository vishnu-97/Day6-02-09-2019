package com.inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task2Copy {
	public static void main(String ar[]) {
		Scanner in=new Scanner(System.in);
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try  {
			fis = new FileInputStream(ar[0]);
			byte[] b=new byte[fis.available()];
			fis.read(b);
			File f=new File(ar[1]);

			if(!f.isFile() ) {
				throw new FileNotFoundException("File does not exist");
			}
			fos=new FileOutputStream(f);
			fos.write(b);
			System.out.println();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fos.close();
				fis.close();
				in.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
	}
	

}
