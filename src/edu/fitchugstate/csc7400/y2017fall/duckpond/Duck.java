/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import external.GIF;
import external.Bitmap;
import external.BitmapImpl;
import external.GifImpl;

/** 
 *  Base duck class that will be used for ducks on the pond
 */

public class Duck implements DuckType {
  /** 
   *  Creates a duck object given the files that will be used for displaying and animating
   *  
   * @param still 
   * @param flying 
   * @param swimming 
   */
  public Duck(Bitmap still, GIF flying, GIF swimming) {
    this.still = still;
    this.flying = flying;
    this.swimming = swimming;
  }

  /** 
   *  Displays a still of the duck using bitmap
   */
  public void display() {
    this.still.show();
  }

  /** 
   * Setter method to set the flyBehaviour
   * @param flyBehaviour
   */
  
  public void setFlyBehaviour(FlyBehaviour flyBehaviour)
  {
	this.flyBehaviour = flyBehaviour;
  }

  /** 
   * Setter method to set the QuackBehaviour
   * @param QuackBehaviour
   */
  public void setQuackBehaviour(QuackBehaviour quackBehaviour)
  {
	this.quackBehaviour = quackBehaviour;
  }
  
  /** 
   * Setter method to set the swimBehaviour
   * @param swimBehaviour
   */
  public void setSwimBehaviour(SwimBehaviour swimBehaviour)
  {
	  this.swimBehaviour= swimBehaviour;
  }
  public void fly() {
    //this.flying.animate();
	  flyBehaviour.fly(this.flying);
  }

  /** 
   *  Makes a quacking sound
   */
  public void quack() {
    //System.out.println("Quack");
	  quackBehaviour.quack();
	  
  }

  /** 
   *  Shows a swimming animation using the GIF file
   */
  public void swim() {
	  swimBehaviour.swim(this.swimming);
  }

  /** 
   *  Creates a new bitmap object given a file name
   */
 // protected Bitmap createBitmap(String fileName) {
 //   return new BitmapImpl(fileName);
 // }

  /** 
   *  Creates a GIF object given a file name.e
   */
 // protected GIF createGif(String fileName) {
 //   return new GifImpl(fileName);
 // }

  /** 
   *  For displaying a still duck image, used when adding ducks to the pond.
   */
  protected Bitmap still;

  /** 
   *  GIF of duck flying
   */
  protected GIF flying;

  /** 
   *  GIF of duck swimming
   */
  protected GIF swimming;
  protected FlyBehaviour flyBehaviour;
  protected QuackBehaviour quackBehaviour;
  protected SwimBehaviour swimBehaviour;;
  
  
}
