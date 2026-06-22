/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author fsouz
 */
public class SunPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // blue background
        setBackground(Color.BLUE);

        // yellow sun
        g.setColor(Color.YELLOW);
        g.fillOval(130, 80, 100, 100);
    }
}