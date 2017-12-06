* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-12-06
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/**
 * Implements QuackBehaviour for ducks which can't make sound
 *
 */
public class NoQuack implements QuackBehaviour{

	public void quack()
	{
		System.out.println("No Sound");
	}
}
