* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-12-06
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import external.GIF;

/**
 * implements FlyBehaviour for ducks  which can't fly
 *
 */
public class NotFlying implements FlyBehaviour{
	public void fly(GIF fly)
	{
		System.out.println("Can't Fly");
	}

}
