/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15634_tutorial_03_circle;

/**
 *
 * @author fsouz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle();
        c.radius = 5;
        c.ShowCharacteristics();

        System.out.println();

        Cylinder cy = new Cylinder();
        cy.radius = 5;
        cy.height = 10;
        cy.ShowCharacteristics();

        System.out.println();

        Sphere s = new Sphere();
        s.radius = 5;
        s.ShowCharacteristics();
            
    }
    
}
