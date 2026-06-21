/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author fsouz
 */
public class Main {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        c.showCharacteristics();

        Square s = new Square(4);
        s.showCharacteristics();

        Rectangle r = new Rectangle(3, 6);
        r.showCharacteristics();

        Sphere sp = new Sphere(5);
        System.out.println("Sphere volume: " + sp.calculateVolume());

        Cylinder cy = new Cylinder(3, 10);
        System.out.println("Cylinder volume: " + cy.calculateVolume());
    }
}
