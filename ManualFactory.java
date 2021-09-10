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
public class ManualFactory extends AbstractFactory {
 public Manual getManual(String manual)   
 {
     if(manual==null)
     {
         return null;
     }
     if(manual.equalsIgnoreCase("Manual"))
         return new ManualToothbrushFactory();
     return null;
 }
 public Automatic getAutomatic(String automatic)
 {
     return null;
 }
}
