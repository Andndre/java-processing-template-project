package me.yourName.projectName;

import processing.core.PApplet;

public class Sketch extends PApplet {

	public void settings() {
		size(500, 500);
	}

	public void draw() {
		background(100);
	}

	public static void main(String[] args) {
		String[] processingArgs = { "Sketch" };
		Sketch sketch = new Sketch();
		PApplet.runSketch(processingArgs, sketch);
	}
}