/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fsouz
 */
public class Circle implements Shape2D {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateDiameter() {
        return 2 * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double calculatePerimeter() {
        return calculateCircumference();
    }

    public void showCharacteristics() {
        System.out.println("Circle - Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Diameter: " + calculateDiameter());
    }
}