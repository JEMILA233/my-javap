/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.midsem;

/**
 *
 * @author WIUC
 */
import java.util.Scanner;
public class Midsem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double bill,units;
        
       do{
       System.out.println("=====electricity system===");
       System.out.println("1. Residetial ");
       System.out.println("2. Commercial ");
       System.out.println("3. Exit");
       
       System.out.println("Enter your chioce");
        choice= input.nextInt();
        
        switch(choice){
            case 1:
                
                System.out.println("enter units amount consumed");
                units =input.nextDouble();
                if(units <=100){
                bill = units * 1.20;
                }else{
                bill = (100 *1.20) + ((units-100)*1.8);
                }
                System.out.println("the electricity bill is:" + bill);
                break;
                
            case 2:
                
               System.out.println("enter units amount consumed"); 
               units =input.nextDouble();
                if(units <=200){
                bill = units * 1.50;
                }else{
                bill = (200 *1.50) + ((units-200)*2.2);
                }
                System.out.println("the electricity bill is:" + bill);
                break;
                
            case 3:
              System.out.println("Exit"); 
              
            default:
                System.out.println("invalid input! Try again"); 
        
        }
            
       
       
       } 
        
       while (choice !=3);
        input.close();
    }
}
