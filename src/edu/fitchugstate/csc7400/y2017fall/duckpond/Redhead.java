/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Redhead duck for pond
 */
public class Redhead extends Duck {

  /** 
   *  Creates new redhead duck with appropriate bitmaps and GIFs.
   */
  public Redhead() {
	super(BitMapFactory.createBitmap("redhead_still.bmp"), GifFactory.createGif("redhead_fly.gif"), GifFactory.createGif("redhead_swim.gif"));
	
    flyBehaviour = new Flying();
	quackBehaviour = new Quack();
	swimBehaviour=new Swim();
  }
}
