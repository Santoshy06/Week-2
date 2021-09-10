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
public class AutomaticToothbrushFactory implements Automatic {
    private final String FactoryName;
    public AutomaticToothbrushFactory()
    {
        FactoryName="Automatic";
    }
    public String getAutomatic()
    {
        return FactoryName;
    }
    
}
