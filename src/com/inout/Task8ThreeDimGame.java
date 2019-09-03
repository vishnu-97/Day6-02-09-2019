package com.inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Task8ThreeDimGame {

	public static void main(String[] args) {
		System.out.println("enter 1 for new game"
				+ "\n2 for resume game");
		Scanner in =new Scanner(System.in);
		
		int o=in.nextInt();
		Game g=null;
		File f=new File("g.data");
		
		if(o==1) {
			g=new Game();
		}
		else {
			if(f.exists()) {
				try(FileInputStream fis=new FileInputStream(f)) {
					ObjectInputStream is= new ObjectInputStream(fis);
					g=(Game)is.readObject();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				g=new Game();
			}
		}
		System.out.println("X-Plane Move");
		g.moveX(in.nextInt());
		System.out.println("Y-Plane Move");
		g.moveY(in.nextInt());
		System.out.println("Z-Plane Move");
		g.moveZ(in.nextInt());
		
		System.out.println("Saving Game...");
		
		try(FileOutputStream fos=new FileOutputStream(f)) {
			ObjectOutputStream os=new ObjectOutputStream(fos);
			os.writeObject(g);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.close();
	
	}

}
