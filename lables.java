/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.file;

/**
 *
 * @author WIN-10
 */
public class Lables {

    public static void main(String[] args) {
        outer:
        for(int i=1; i<=5;i++){
          for(int j=1; j<=5;j++){
              System.out.print(j+" ");
              if(i==j)
                  break outer;
          }   
        }
        System.out.println("  ");
        
        
        
        outer :
        for(int i=1; i<=5; i++){
         for(int j=1; j<=5; j++){
             if(i==j){
                 System.out.print("  ");
                 continue outer;
             }
             System.out.print(j+"  ");
             }
         System.out.println();
     }
        
        
     for(int i=1; i<=5; i++){
       for(int j=1; j<=5; j++){
           System.out.print(j+" ");
           if(i==j)
               break;
       }
       System.out.println();
     }   
        
    }

    
}
