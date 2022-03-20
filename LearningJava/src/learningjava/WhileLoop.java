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
public class WhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

//while loop checks condition if true then it executes the code, if false then it repeats until the specified condition is true 
        while(isOnRepeat){ 
            System.out.println("Playing current song");
            System.out.println("Would you like to stop playing this song? "
                    + "If so, type yes to stop this song");
            String userInput = input.next().toLowerCase(); 
//the input is stored in lowercase, so that Yes, YES, YeS, yeS, etc. will statisfy the condition.
            
            if(userInput.equals("yes")){ //If true, prints out "Playing next song~". If not, then it will rerun the code of while loop 
                isOnRepeat = false;
            }
        }      
        System.out.println("Playing next song~"); 
    }
}
