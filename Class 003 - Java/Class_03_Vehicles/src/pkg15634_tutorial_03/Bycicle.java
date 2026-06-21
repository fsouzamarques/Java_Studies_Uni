/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15634_tutorial_03;

/**
 *
 * @author fsouz
 */
public class Bycicle extends LandVehicle {
    int numberCogsFront; //Cogs are only for Bycicles
    int numberCogsBack;
    
    public void displayBycicleData() {
        System.out.println("Number of Cogs in Front = " + numberCogsFront + ", Number of Cogs on the Back = " + numberCogsBack);
    }
    
}
