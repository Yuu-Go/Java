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
public class InputOutput {
    
    public static void main(String[] args){
        String myName = "John Wick";
        double myGWA = 3.5;
        
        //Output
        System.out.println("My name is " + myName + 
                " and I have a GWA of " + myGWA);
        //Output
        System.out.println("What do you want to update your GPA to?");
        
        //Input
        Scanner input = new Scanner(System.in); //import java.util.Scanner to use scanner for input
        myGWA = input.nextDouble();
        //Output
        System.out.println("My name is " + myName + 
                " and I have an updated GWA of " + myGWA);
    }
}
