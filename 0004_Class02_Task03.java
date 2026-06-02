/*Write a Java Program that will ask the question if you are an Australian citizen. If you enter “YES”
the program will ask your age. If you are 16 year old the program will display a message saying that
you can apply for a driving license. However, if you are not an Australian citizen or if you are less
than 16 year old the message will be that you cannot apply for a driving license.*/

package tutorial002_task03;

import javax.swing.JOptionPane;

/**
 *
 * @author fsouz
 */
public class Tutorial002_Task03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Write a Java Program that will ask the question if you are an Australian citizen. If you enter “YES”
        //the program will ask your age. If you are 16 year old the program will display a message saying that
        //you can apply for a driving license. However, if you are not an Australian citizen or if you are less
        //than 16 year old the message will be that you cannot apply for a driving license.
        
        String Citizen = JOptionPane.showInputDialog("Are you an Australian Citizen? (YES/NO)");
        
        String ageText = JOptionPane.showInputDialog("What is your age?");
        int age = Integer.parseInt(ageText);
        
        if (Citizen.equals("YES") && age >= 16) {
            JOptionPane.showMessageDialog(null, "You can apply for a driving license.");
        
        } 
        
        else if (Citizen.equals("Yes") && age >= 16) {
            JOptionPane.showMessageDialog(null, "You can apply for a driving license.");
       
        } 
        
        else if (Citizen.equals("yes") && age >= 16) {
            JOptionPane.showMessageDialog(null, "You can apply for a driving license.");
        }
        else {
            JOptionPane.showMessageDialog(null, "You cannot apply for a driving license.");
        }
    }
    
}
