/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fsouz
 */
public class Rectangle implements Shape2D {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculateDiameter() {
        return Math.sqrt(width * width + height * height);
    }

    public double calculateCircumference() {
        return 2 * (width + height);
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void showCharacteristics() {
        System.out.println("Rectangle - Width: " + width + ", Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}