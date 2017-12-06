/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Wooden decoys for the duck.
 */
public class WoodenDecoy extends Duck {

  /** 
   *  Creates a new wooden decoy with appropriate bitmaps,GIFs and creates objects for appropriate behaviour classes
   */
  public WoodenDecoy() {
    super(BitMapFactory.createBitmap("decoy_still.bmp"), GifFactory.createGif("null"), GifFactory.createGif("decoy_swim.gif"));
    
    
    flyBehaviour = new NotFlying();
	quackBehaviour = new NoQuack();
	swimBehaviour = new Swim();
  }
  
  

  /** 
   *  Wooden decoys don't fly.
   */
  //public void fly() {
  //  System.out.println("Decoy still swims");
  //}

  /** 
   *  Wooden decoys don't quack
   */
  //public void quack() {
   // System.out.println("Decoy is silent");
 // }
}
