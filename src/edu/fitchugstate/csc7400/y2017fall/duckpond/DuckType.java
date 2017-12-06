/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * @author Sindhuja Morampudi,divya kasu
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  This is a simple duck interface that will be used to display ducks on a pond in the pond simulator
 */
public interface DuckType {

  /** 
   *  Displays a still image of the duck
   */
  public void display();

  /** 
   *  Shows a flying animation
   */
  public void fly();
  
  
  

  /** 
   *  Outputs a quacking sound
   */
  public void quack();
  
  /** 
   *  Displays a swimming animation
   */
  public void swim();
}
