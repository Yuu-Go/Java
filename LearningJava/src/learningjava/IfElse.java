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
public class IfElse {
    public static void main(String[] args){
        //Simple Fortune Teller Example
        System.out.println("Pick a number between 1 to 10");
        
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        
        //if statement, executes code if the specified contion is true
        if (inputNumber <= 5 && (inputNumber >= 1)){ //&& - logical and
            System.out.println("Beauty surrounds you because you create it");
        }
        //if not? executes the code of the new condition if the first condition is false
        else if (inputNumber > 5 && (inputNumber <= 10)){
            System.out.println("One that would have the fruit must climb the tree");
        }
        //executes the code if both conditions are false
        else{
            System.out.println("Pick between 1 to 10 only");
        }
    }
}
