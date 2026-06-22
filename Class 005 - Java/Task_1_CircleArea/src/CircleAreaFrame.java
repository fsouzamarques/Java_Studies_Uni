/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author fsouz
 */
public class CircleAreaFrame extends JFrame {

    public CircleAreaFrame() {
        //This part I did some research because I had no idea what it was
        setTitle("Circle Area Calculator");
        setSize(400, 200);

        //this is to close the program when the indow is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set positioning
        setLocationRelativeTo(null);

        //Code itself to calculate
        String input = JOptionPane.showInputDialog(this, "What's the radius of the circle:");

        float radius = Float.parseFloat(input);

        double area = Math.PI * radius * radius;

        //result output
        JOptionPane.showMessageDialog(this, "The area of the circle is: " + area);

        //show the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new CircleAreaFrame();
    }
}