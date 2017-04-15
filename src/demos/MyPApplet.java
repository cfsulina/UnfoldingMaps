package demos;

import processing.core.PApplet;
import processing.core.PImage;

/** 
 * A class to illustrate some use of the PApplet class
 * Used in module 3 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class MyPApplet extends PApplet{
	PImage img;
	
	public void setup() {
		//Add setup code for MyPApplet
		size(400,400);				//set canvas size
		background(255);			//set canvas color
		stroke(0);				//set pen color
		img = loadImage("https://www.google.com/search?q=小黄人图片&tbm=isch&imgil=j3xfM1r3kZ8aJM%253A%253B0EH2HGYgEBRRaM%253Bhttp%25253A%25252F%25252Fwww.58pic.com%25252Ftupian%25252Fxiaohuangren.html&source=iu&pf=m&fir=j3xfM1r3kZ8aJM%253A%252C0EH2HGYgEBRRaM%252C_&usg=__na6Ku3IGeodMlDAi1jjlsxzstMs%3D&biw=1196&bih=655&ved=0ahUKEwjtx_DGutbSAhVCbSYKHZv0D_QQyjcINQ&ei=6B_IWO2zCcLamQGb6b-gDw#imgrc=j3xfM1r3kZ8aJM:", "jpg");
	}
	
	public void draw() {
		//Add drawing code for MyPApplet
		img.resize(0, height);			//resize loaded image to full height of canvas
		image(img, 0, 0);			//display image 
		int[] color = sunColorSec(second());		//calculate color code for sun
		fill(color[0],color[1],color[2]);	//set sun color
		ellipse(width/4,height/5,width/4,height/5);	//draw sun
		
	}
	
	/** Return the RGB color of the sun at this number of seconds in the minute */
	public int[] sunColorSec(float seconds)
	{
		int[] rgb = new int[3];
		// Scale the brightness of the yellow based on the seconds.  0 seconds 
		// is bright yellow.  30 seconds is black.
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		//System.out.println("R" + rgb[0] + " G" + rgb[1] + " B" + rgb[2]);
		return rgb;
	}	
	
	public static void main (String[] args) {
		//Add main method for running as application
		PApplet.main(new String[] {"--present", "MyPApplet"});
	}
}


