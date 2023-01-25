/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;
                

interface Polygon_Shape {
    void calculateArea(int length, int breadth);
}
 

class Rectangle implements Polygon_Shape {
    public void calculateArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}
 
class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();       //declare a class object
        rect.calculateArea(10, 20);             //call the method
    }

    

