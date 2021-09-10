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
public class AutomaticFactory extends AbstractFactory {
    public Manual getManual(String manual)
    {
        return null;        
    }
    public Automatic getAutomatic(String automatic)
    {
        if(automatic==null)
            return null;
        if(automatic.equalsIgnoreCase("Automatic"))
            return new AutomaticToothbrushFactory();
        return null;
    }
}
