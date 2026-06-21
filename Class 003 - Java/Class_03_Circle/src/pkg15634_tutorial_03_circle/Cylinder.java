/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15634_tutorial_03_circle;

/**
 *
 * @author fsouz
 */
public class Cylinder extends Circle {
    
    double height;

    public void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume = " + volume);
    }
    
    public void ShowCharacteristics() {
        System.out.println("Cylinder");
        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);
        calculateDiameter();
        calculateCircumference();
        calculateArea();
        calculateVolume();
    }
}