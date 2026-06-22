/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JFrame;

/**
 *
 * @author fsouz
 */
public class SunFrame extends JFrame {

    public SunFrame() {
        setTitle("Sun Artwork");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new SunPanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new SunFrame();
    }
}