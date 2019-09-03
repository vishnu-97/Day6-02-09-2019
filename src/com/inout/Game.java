package com.inout;

import java.io.Serializable;

public class Game implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8973895698548390717L;
	private int x,y,z;

	public Game(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Game() {
		
	}
	public int getX() {
		return x;
	}

	public void moveX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void moveY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void moveZ(int z) {
		this.z = z;
	}
	

}
