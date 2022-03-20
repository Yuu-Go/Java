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
public class MultipleChoice {
    
    public static void main(String[] args){
        //Exercise
        String question = "A type of instruction that produce several lines of machine language code is a";
        String choiceOne = "a";
        String choiceTwo = "b";
        String choiceThree = "c";
        
        String correctAnswer = choiceOne;
        
        System.out.println(question);
        System.out.println("(A) Macro");
        System.out.println("(B) Address");
        System.out.println("(C) Assemble");
        
        boolean isIncorrect = true;
        while(isIncorrect){
            System.out.println("Choose the letter of the correct answer:");
            Scanner scanner = new Scanner(System.in);
            String inputedAns = scanner.next().toLowerCase();
            
            if(inputedAns.equals(correctAnswer)){
                System.out.println("Correct");
                isIncorrect = false;
            }
            else if(inputedAns.equals(choiceTwo)){
                System.out.println("Incorrect! The correct answer is Macro");
            }
            else if(inputedAns.equals(choiceThree)){
                System.out.println("Incorrect! The correct answer is Macro");
            }
            else {
                System.out.println("Again!");
            }        
        }
        System.out.println("Congratulations you got the correct answer!!");
        
    }
}
