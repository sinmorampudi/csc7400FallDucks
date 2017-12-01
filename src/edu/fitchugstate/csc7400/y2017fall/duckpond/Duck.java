/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
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
   * @param bitmapFilname the still bitmap file name of the duck
   * @param flyingGifFilename the flying GIF file name
   * @param swimmingGifFilename the swimming GIF file name
   */
  public Duck(String bitmapFilename, String flyingGifFilename, String swimmingGifFilename) {
    this.still = this.createBitmap(bitmapFilename);
    this.flying = this.createGif(flyingGifFilename);
    this.swimming = this.createGif(swimmingGifFilename);
  }

  /** 
   *  Displays a still of the duck using bitmap
   */
  public void display() {
    this.still.show();
  }

  /** 
   *  Displays a flying animation using the GIF file.
   */
  public void fly() {
    this.flying.animate();
  }

  /** 
   *  Makes a quacking sound
   */
  public void quack() {
    System.out.println("Quack");
  }

  /** 
   *  Shows a swimming animation using the GIF file
   */
  public void swim() {
    this.swimming.animate();
  }

  /** 
   *  Creates a new bitmap object given a file name
   */
  protected Bitmap createBitmap(String fileName) {
    return new BitmapImpl(fileName);
  }

  /** 
   *  Creates a GIF object given a file name.e
   */
  protected GIF createGif(String fileName) {
    return new GifImpl(fileName);
  }

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
}
