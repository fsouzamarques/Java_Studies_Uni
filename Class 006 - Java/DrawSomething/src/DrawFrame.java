/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drawsomething;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author fsouz
 */
public class DrawFrame extends JFrame implements KeyListener {

    private DrawPanel panel;

    //brush sizes for + and -
    private int[] sizes = {4, 8, 12, 20, 30}; //i doesnt work with the + from the side keyboard, just the top one
    private int currentSizeIndex = 2; //set the start at the medium size

    public DrawFrame() {
        //create panel and add to frame
        panel = new DrawPanel();
        add(panel);

        //frame settings
        setTitle("DrawSomething");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        addKeyListener(this);

        setVisible(true);

        panel.setBrushSize(sizes[currentSizeIndex]);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_PLUS || code == KeyEvent.VK_EQUALS) {
            if (currentSizeIndex < sizes.length - 1) {
                currentSizeIndex++;
                panel.setBrushSize(sizes[currentSizeIndex]);
            }
        } else if (code == KeyEvent.VK_MINUS) {
            if (currentSizeIndex > 0) {
                currentSizeIndex--;
                panel.setBrushSize(sizes[currentSizeIndex]);
            }
        }

        char ch = Character.toLowerCase(e.getKeyChar());

        switch (ch) {
            case 'r': //red
                panel.setBrushColor(Color.RED);
                break;
            case 'g': //green
                panel.setBrushColor(Color.GREEN);
                break;
            case 'c': //blue
                panel.setBrushColor(Color.BLUE);
                break;
            case 'y': //yellow
                panel.setBrushColor(Color.YELLOW);
                break;
            case 'b': //black
                panel.setBrushColor(Color.BLACK);
                break;
            case 'e': //eraser using e 
                panel.setEraser();
                break;
            default:
                break;
        }

        panel.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    //main method to start the game
    public static void main(String[] args) {
        new DrawFrame();
    }
}