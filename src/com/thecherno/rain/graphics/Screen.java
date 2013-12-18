package com.thecherno.rain.graphics;

public class Screen {

	private int width, height;
	public int[] pixels;
	
	//Constructor
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	
	public void clear() {
		for (int i = 0; i < pixels.length; i++){
			pixels[i] = 0;
		}
	}
	
	public void render() {//add arguments later
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++){
				pixels[x + y * width] = 0xff00ff;
			}
		}
	}
	
	
}
