package com.javaex.ex03;

public class Rectangle {
	
	private int width;
	private int height;
	
	
	public Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public boolean equals(Rectangle rwh) {
		if(rwh.getWidth()*rwh.getHeight()== this.width*this.height) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
