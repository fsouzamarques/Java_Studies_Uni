/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial002_task04;

import javax.swing.JOptionPane;

/**
 *
 * @author fsouz
 */
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