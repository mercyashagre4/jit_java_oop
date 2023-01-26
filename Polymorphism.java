/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m;

/**
 *
 * @author WIN-10
 */
public class Polymorphism {
    
    
      public void Sound() {
    System.out.println("The people makes a sound");
  }
}

class person extends Polymorphism{
  public void Sound() {
    System.out.println("he says ohh ma god");
  }
}

class Human extends Polymorphism {
  public void Sound() {
    System.out.println("she says wow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Polymorphism my = new Polymorphism(); 
    Polymorphism myPerson = new Polymorphism();  
    Polymorphism myHuman = new Human();  
    myPerson.Sound();
    myPerson.Sound();
    myHuman.Sound();
  }
}

    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("hi");
        // TODO code application logic here
    }
    
}
