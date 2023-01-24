/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author WIN-10
 */
import java.util.*;
import java.util.Scanner;
public class student
{
    int result;
    String name;
   student(String name){
    System.out.println("your name is:"+ name);
   }
   
   
       
           int height=5;
           int width=7;
           int area;
         public int calculate(int height,int width){
              area=height*width;
           return area;
            
              
               
           }
           
           
           
       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String name;
        student keyboard=new student("LESI");
        keyboard.name="lesi";
        System.out.println(keyboard.name);
//         Scanner key=new Scanner(System.in);
        
//         key.height=5;
//         key.width=7;
         
        int result=calculate(5,7); 
         System.out.println("the final result is:" + result);
        Scanner keyboard1=new Scanner(System.in);
        name=keyboard1.nextLine();
        System.out.println("your name is :"+name);
       }
}
        
class Java{
           int height;
           int width,area;
           int calculate(int height,int width){
              area=height*width;
              return area;
           }
}
          