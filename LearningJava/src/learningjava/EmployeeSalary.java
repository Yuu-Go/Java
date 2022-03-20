/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningjava;

/**
 *
 * @author hlc23
 */
public class EmployeeSalary {
   
    public static double calculateYearlySalary(int workHours, double workPay, int vacationDays){
        if(workHours < 0){
            return -1;
        }
        
        if(workPay < 0){
            return -1;
        }
        
        double weeklySalary = workPay * workHours;
        double unpaidTime = vacationDays * workPay * 8;
        return weeklySalary * 52 - unpaidTime;            
    }
    
    public static void main(String[] args){
        double salary = calculateYearlySalary(40, 100, 8);
        System.out.println(salary);
        
    }    
}
