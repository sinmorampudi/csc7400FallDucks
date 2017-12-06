/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Mallard duck for pond
 */
public class Mallard extends Duck {

  /** 
   *  Creates a new Mallard duck with appropriate bitmaps and GIFs and creates objects for appropriate behaviour classes
   */
  public Mallard() {
    super(BitMapFactory.createBitmap("mallard_still.bmp"), GifFactory.createGif("mallard_fly.gif"), GifFactory.createGif("mallad_swim.gif"));
    
    flyBehaviour = new Flying();
	quackBehaviour = new Quack();
	swimBehaviour=new Swim();
  }
}
