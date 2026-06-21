/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15634_tutorial_03_circle;

/**
 *
 * @author fsouz
 */
public class Sphere extends Circle{
    
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume = " + volume);
    }

    public void ShowCharacteristics() {
        System.out.println("Sphere");
        System.out.println("Radius = " + radius);
        calculateDiameter();
        calculateCircumference();
        calculateArea();
        calculateVolume();
    }
}

