/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracttoothbrushfactory;

/**
 *
 * @author Welcome
 */
public abstract class Manual {
    protected int number;
    abstract void calculateTime(int noOfBrush);
 public void calculateDay(int perHour)   
 {
     System.out.println("Number of hours to produce "+number+" brushes is"+number/perHour);
 }
}
