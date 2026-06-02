/* Write a simple Java Program (An application) using JOPtionPane of Java Swing package that will ask
you to enter a temperature in Fahrenheit. Then the program converts the temperature into Celsius
as follows
○ C÷5 = (F-32) ÷ 9
○ Where C is the temperature in Celsius and F stands for Fahrenheit */

package tutorial002_Task01;

import javax.swing.JOptionPane;

public class Tutorial002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Write a simple Java Program (An application) using JOPtionPane of Java Swing package that will ask
        //you to enter a temperature in Fahrenheit. Then the program converts the temperature into Celsius
        //as follow
        //○ C÷5 = (F-32) ÷ 9
        //○ Where C is the temperature in Celsius and F stands for Fahrenheit


        System.out.println("This is the Temperature Converter");
        
        String FTemp = JOptionPane.showInputDialog("Enter the Temperature in Farenheit");
                
        //Convert to Integer
        
        int FarenT = Integer.parseInt(FTemp);
        
        //tring S3 = S1 + S2;
        
        float CelsiusT = (float) (FarenT - 32)* 5 / 9;
        
        JOptionPane.showMessageDialog(null, "The Celsius Temperature is " + CelsiusT);
        
        
    }
    
}
