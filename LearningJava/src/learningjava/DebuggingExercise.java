/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningjava;

import java.util.Scanner;

/**
 *
 * @author hlc23
 */
public class DebuggingExercise {
    //Fixed 3 errors hidden in a program that calculates the area of a triangle
    public static void main(String[] args) {
        System.out.println("Let's calculate the area of a triangle");
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches).");
        double base = input.nextDouble();

        while (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches).");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            height = input.nextDouble();
        }
        
        double area = (base * height) / 2;
        System.out.println("The area is " + area);

    }
}
    

