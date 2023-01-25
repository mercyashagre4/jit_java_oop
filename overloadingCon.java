/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WIN-10
 */
public class Lesi {
   void calculatorArea(int x,int y){
       System.out.println("int,int:"+x*y);
   }
   void calculateArea(double x,int y){
       System.out.println("double,int:"+x*y);
   }
    void calculateArea(int x,double y){
       System.out.println("int,double:"+x*y);
   }
     void calculateArea(double x,double y){
       System.out.println("double,double:"+x*y);
   }
      public static void main(String[] args){
          Lesi x=new Lesi ();
          x.calculateArea(8,3);
          x.calculateArea(4.5, 4);
          x.calculateArea(5, 3.5);
          x.calculateArea(5.5, 4.5);
      }
   
}
