/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methoddd;

/**
 *
 * @author WIUC
 */
import java.util.Scanner;
public class Minicalculator {
    
    public static double add(double a,double b){
    return a+b;
    }
    
    public static double subtract(double a,double b){
    return a-b;
    }
    
    public static double division(double a,double b){
        if(b == 0){
        System.out.println("Can not be divided by Zero");
        return 0;
        } 
        else{
        
    
            return a/b;
        }  
    }
      
    public static double power(double a,double b){
    return Math.pow(a,b);
    }
    
    public static double multiply(double a, double b){
    return a*b;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        do{
          System.out.println("===Mini Calcuiator==="); 
          System.out.println("1.Addition");
          System.out.println("substraction");
          System.out.println("3. Mutiply");
          System.out.println("4.Division");
          System.out.println("5. Power");
          System.out.println("6.exit");
          int choice =0;
          System.out.println("Enter your choice");
          choice = input.nextInt();
          
          if(choice == 6){
          System.out.println("existing mini calculator good bye!");
          }
          
          if(choice<1||choice>6){
          System.out.println("invalid input! try again");
          continue;
          }
          int num1;
          int num2;
          double result = 0;
          System.out.println("Enter the number for num1");
          num1 = input.nextInt();
          System.out.println("Enter the number for num2");
    
          num2 = input.nextInt();
          if(choice == 1){
          result = add(num1,num2);
          System.out.println("Resultis : " + result);
          } else if(choice ==2){
              result = subtract(num1,num2);
           System.out.println("Resultis : " + result);   
              
          } else if(choice ==3){
              result = multiply(num1,num2);
           System.out.println("Resultis : " + result);   
              
          } else if(choice ==4){
              result = power(num1,num2);
           System.out.println("Resultis : " + result);   
              
          } else if(choice ==5){
              result = division(num1,num2);
           System.out.println("Resultis : " + result);   
              
          }
          
        }
      while(choice !=6);
       input.close(); 
    }
}
