* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-12-06
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import external.GIF;

/**
 * implements SwimBehaviour and gives corresponding swim GIF
 *
 */
public class Swim implements SwimBehaviour {
	
	
	public void swim(GIF Swim)
	{
		Swim.animate();
	}

}
