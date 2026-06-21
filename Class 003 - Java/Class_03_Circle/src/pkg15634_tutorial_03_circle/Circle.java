/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15634_tutorial_03_circle;

/**
 *
 * @author fsouz
 */
public class Circle {
    double radius;
    
    public void calculateDiameter() {
        double diameter = 2 * radius; //used double because when it comes to PI it`ll give broken numbers
        System.out.println("Diameter = " + diameter);
    }
    
    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius; //when i researched I leanred that we can use Math.PI instead of the whole PI number
        System.out.println("Circumference = " + circumference);
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
    }

    public void ShowCharacteristics() {
        System.out.println("Circle");
        System.out.println("Radius = " + radius);
        calculateDiameter();
        calculateCircumference();
        calculateArea();
    }
}