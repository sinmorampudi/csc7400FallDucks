* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-12-06
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import external.GIF;
import external.GifImpl;


/**
 * GIF factory class to create GIF Object
 *
 */
public class GifFactory {
	public static GIF createGif(String fileName) {
	    return new GifImpl(fileName);
	  }

}
