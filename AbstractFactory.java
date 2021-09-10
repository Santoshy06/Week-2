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
public abstract class AbstractFactory {
    public abstract Manual getManual(String manual);  
  public abstract Automatic getAutomatic(String automatic);  
}
