/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial001;

import javax.swing.JOptionPane;

/**
 *
 * @author fsouz
 */
public class Tutorial001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to AIT Java Lecture");
        
        String S1 = JOptionPane.showInputDialog("Enter the 1st Number:");
        
        String S2 = JOptionPane.showInputDialog("Enter the 2nd Number:");
        
        //Convert to Integer
        
        int x = Integer.parseInt(S1);
        int y = Integer.parseInt(S2);
        
        //tring S3 = S1 + S2;
        
        int z = x + y;
        
        JOptionPane.showMessageDialog(null, z);
        
        
        //----------------- TASK 2
        
        String FName = JOptionPane.showInputDialog("Enter the First Name:");
        
        String Surname = JOptionPane.showInputDialog("Enter the Family Name:");
        
        String FullName = FName + " " + Surname;
        
        JOptionPane.showMessageDialog(null, FullName);
        
        //-------------------TASK 3
        
        String N1 = JOptionPane.showInputDialog("Enter the 1st Number:");
        
        String N2 = JOptionPane.showInputDialog("Enter the 2nd Number:");
        
        String N3 = JOptionPane.showInputDialog("Enter the 3rd Number:");
        
        //Convert to Integer
        
        int Nu1 = Integer.parseInt(N1);
        int Nu2 = Integer.parseInt(N2);
        int Nu3 = Integer.parseInt(N3);
        
        //tring S3 = S1 + S2;
        
        int Average = (Nu1 + Nu2 + Nu3) / 3;
        
        JOptionPane.showMessageDialog(null, Average);
    }
    
}
