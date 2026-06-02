/*Write a simple Java Program (An application) using JOPtionPane of Java Swing package that will ask
you to enter a temperature in Fahrenheit. Then the program converts the temperature into Celsius
as follows
○ C÷5 = (F-32) ÷ 9
○ Where C is the temperature in Celsius and F stands for Fahrenheit

  Extend the Java Program from Task1 that will ask user to input unit code, f-Fahrenheit and c-Celsius,
and then program convert the temperature into another unit.*/

package tutorial002_task04;

import javax.swing.JOptionPane;

public class Tutorial002_Task04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("This is the Temperature Converter");
        
        String unitInput = JOptionPane.showInputDialog("Enter unit code to convert FROM (f for Fahrenheit, c for Celsius):");
        
        if (unitInput.equals("f")) {
                String fTempInput = JOptionPane.showInputDialog("Enter the Temperature in Fahrenheit:");
                
                if (fTempInput != null) {
                    float fahrenheit = Float.parseFloat(fTempInput);
                    float celsius = (fahrenheit - 32) * 5 / 9; 
                    JOptionPane.showMessageDialog(null, fahrenheit + "F is equivalent to " + celsius + " Celsius");
                }
                
            } else if (unitInput.equals("c")) {
                String cTempInput = JOptionPane.showInputDialog("Enter the Temperature in Celsius:");
                
                if (cTempInput != null) {
                    float celsius = Float.parseFloat(cTempInput);
                    float fahrenheit = (celsius * 9 / 5) + 32; 
                    JOptionPane.showMessageDialog(null, celsius + "C is equivalent to " + fahrenheit + " Farenheit");
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Invalid unit code entered. Please enter 'f' or 'c'.");
            }
        }
    }
