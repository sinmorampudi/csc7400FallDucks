* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Rubber duck for pond
 */

public class RubberDuck extends Duck {

  /** 
   *  Creates a new rubber duck
   */
  public RubberDuck() {
	super(BitMapFactory.createBitmap("rubber_duck_still.bmp"), GifFactory.createGif(null), GifFactory.createGif("rubber_duck_swim.gif"));

	//setFlyBehaviour(new NotFlying());
    //setSoundBehaviour(new Squeak());
    //setSwimBehaviour(new Swim());
	flyBehaviour = new NotFlying();
	quackBehaviour = new Squeak();
	swimBehaviour=new Swim();
  }



  /** 
   *  Rubber duck don't fly
   */
 // public void fly() {
 //   System.out.println("Rubber duck continues to swim");
 // }

  /** 
   *  Squeaks like a rubber duck.
   */
 // public void quack() {
  //  System.out.println("Squeak");
 // }
}
