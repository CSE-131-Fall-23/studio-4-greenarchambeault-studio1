package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setXscale(0, 30);
		   StdDraw.setYscale(0, 16);

		StdDraw.setPenColor(190, 27, 248);
		   StdDraw.filledRectangle(3, 3, 3, 3);
		   StdDraw.filledRectangle(3, 13, 3, 3);
		   StdDraw.filledRectangle(16, 3, 17, 3);
		   StdDraw.filledRectangle(16, 13, 17, 3);

		StdDraw.setPenColor(251, 173, 249);
			StdDraw.filledRectangle(11, 8, 20, 1);
		   StdDraw.filledRectangle(8, 8, 1, 8);
		  
		StdDraw.setPenColor(172, 173, 191);
			StdDraw.filledCircle(3, 13, 2);
		
		
		
		
	}
}