/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fsouz
 */
public class Square implements Shape2D {

    double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculateDiameter() {
        return Math.sqrt(2) * side;
    }

    public double calculateCircumference() {
        return 4 * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public void showCharacteristics() {
        System.out.println("Square - Side: " + side);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
