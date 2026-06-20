/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutotial002_task02;

import javax.swing.JOptionPane;

/**
 *
 * @author fsouz
 */
public class Tutotial002_Task02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String marks = JOptionPane.showInputDialog("Insert the Mark: ");
        
        int mark = Integer.parseInt(marks);
        
        
        
        if (mark < 50) {
            JOptionPane.showMessageDialog(null, "FAIL");
        }
        else if (mark >= 50 && mark <= 64){
            JOptionPane.showMessageDialog(null, "PASS");
            
        }
        else if (mark >= 65 && mark <= 74){
            JOptionPane.showMessageDialog(null, "CREDIT");
        }
        else if (mark >= 75 && mark <= 84){
            JOptionPane.showMessageDialog(null, "DISTINCTION");
            
        }
        
        else {
            JOptionPane.showMessageDialog(null, "HIGH DISTINCTION");
        }
    }
    
}
