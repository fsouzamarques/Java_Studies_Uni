/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15634_tutorial_03;

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
        
        Bycicle b1 = new Bycicle();
        b1.numberCogsBack = 6;
        b1.numberCogsFront = 8;
        
        b1.displayBycicleData();
        
        Car c1 = new Car();
        c1.numberOfSeats = 5;
        
        c1.displayCarDetails();
    }
    
}
