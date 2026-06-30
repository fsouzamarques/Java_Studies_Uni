/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drawsomething;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import java.util.ArrayList;

/**
 *
 * @author fsouz
 */
public class DrawPanel extends JPanel implements MouseListener, MouseMotionListener {

    //programming is fun! Mindset!!!
    private static class BrushPoint {
        int x, y, size;
        Color color;

        BrushPoint(int x, int y, int size, Color color) {
            this.x = x;
            this.y = y;
            this.size = size;
            this.color = color;
        }
    }

    private Color currentColor = Color.BLACK;
    private int brushSize = 10;

    //I needed AI to help me explaining this part
    private ArrayList<BrushPoint> points = new ArrayList<>();

    public DrawPanel() {
        addMouseListener(this);
        addMouseMotionListener(this); //drag 
        setBackground(Color.WHITE);
    }

    //second section
    public void setBrushColor(Color c) {
        currentColor = c;
    }

    public void setBrushSize(int size) {
        brushSize = size;
    }

    public void setEraser() {
        currentColor = Color.WHITE;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (BrushPoint p : points) {
            g.setColor(p.color);
            g.fillOval(p.x - p.size / 2, p.y - p.size / 2, p.size, p.size);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        addPoint(e);
    }

    //dragging was not working first, so I had to ask for help and add this
    @Override
    public void mouseDragged(MouseEvent e) {
        addPoint(e);
    }

    private void addPoint(MouseEvent e) {
        points.add(new BrushPoint(e.getX(), e.getY(), brushSize, currentColor));
        repaint(); 
    }

    //unused methods but required by interfaces
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void mouseMoved(MouseEvent e) {}
}