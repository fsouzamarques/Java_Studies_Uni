/*Write a simple Java Program (an application) that will ask your Exam marks to be entered in
JOptionPane.
○ The program then shows your Grade for the exam as follows
○ <50 FAIL
○ Between 50 and 64 is PASS
○ Between 65 and 74 is CREDIT
○ Between 75 and 84 is DISTINCTION
○ Any number above 84 is HIGH DISTINCTION*/

package tutotial002_task02;

import javax.swing.JOptionPane;

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
