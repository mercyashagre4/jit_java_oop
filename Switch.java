/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java;
import java.util.Scanner;

/**
 *
 * @author WIN-10
 */
public class Java {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int a;
        System.out.println("Enter your choice!");
        a=input.nextInt();
        switch(a){
            case 1:
                System.out.println("Monday");
                break ;
            case 2:
                System.out.println("Tuseday");
                break ;
            case 3:
                System.out.println("Wednesday");
                break ;
            case 4:
                System.out.println("Thusday");
                break ;
            case 5:
                System.out.println("Friday");
                break ;
            default:
                System.out.println("wrong input");
        }
        
    }
}
