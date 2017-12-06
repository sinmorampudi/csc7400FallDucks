**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-12-06
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import external.Bitmap;
import external.BitmapImpl;

/**
 * BitMap factory class to create BitMap Object
 *
 */
public class BitMapFactory {
	public static  Bitmap createBitmap(String fileName) {
	    return new BitmapImpl(fileName);
	  }


}
