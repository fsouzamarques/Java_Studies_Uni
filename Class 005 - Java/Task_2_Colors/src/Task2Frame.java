/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JFrame;

/**
 *
 * @author fsouz
 */
public class Task2Frame extends JFrame {

    public Task2Frame() {
        //this is the setting for the GUI
        setTitle("Color Circle");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new ColorCirclePanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2Frame();
    }
}