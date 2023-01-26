/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Person1;

/**
 *
 * @author WIN-10
 */
public class Person {
  public abstract void personSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Child extends Person  {
  public void personSound() {
    // The body of animalSound() is provided here
    System.out.println("The lesi says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Child my = new Child(); // Create a Pig object
    my.personSound();
    my.sleep();
  }
}

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
    
    

