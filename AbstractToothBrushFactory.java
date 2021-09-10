/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracttoothbrushfactory;

import java.util.Scanner;

/**
 *
 * @author Welcome
 */
public class AbstractToothBrushFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the type of tooth brush factory for production: ");
       String factoryname=s.next();
       System.out.println("Enter the number of brushed to produce");
       Scanner s1=new Scanner(System.in);
       int no=s1.nextInt();
       System.out.println("Enter the number of brushed can be produced per hour");
       int perHour=s1.nextInt();
       AbstractFactory automaticFactory=FactoryCreator.getFactory("Automatic");
       Automatic a=automaticFactory.getAutomatic(factoryname);
       AbstractFactory manualFactory=FactoryCreator.getFactory("Manual");
       Manual m=manualFactory.getManual(factoryname);
       m.calculateTime(no);
       m.calculateDay(perHour);
    }
    
}
