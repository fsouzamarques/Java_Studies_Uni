/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author fsouz
 */
public class ColorCirclePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //backgroun
        setBackground(Color.BLACK);

        //define the settings for the font
        g.setFont(new Font("Arial", Font.BOLD, 18));

        //positioning
        int centerX = 220;
        int centerY = 220;
        int radius = 120;

        //code to draw the words in the circle
        for (int i = 0; i < 20; i++) {
            double angle = 2 * Math.PI * i / 20;

            int x = centerX + (int)(radius * Math.cos(angle));
            int y = centerY + (int)(radius * Math.sin(angle));

            //color change
            Color textColor = Color.getHSBColor((float) i / 20, 1.0f, 1.0f);
            g.setColor(textColor);

            g.drawString("Color", x, y);
        }
    }
}