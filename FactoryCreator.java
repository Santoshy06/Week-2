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
class FactoryCreator {  
     public static AbstractFactory getFactory(String choice){  
      if(choice.equalsIgnoreCase("Automatic")){  
         return new AutomaticFactory();  
      } else if(choice.equalsIgnoreCase("Manual")){  
         return new ManualFactory();  
      }  
      return null;  
   }  
}
