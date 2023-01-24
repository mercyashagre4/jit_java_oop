/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author WIN-10
 */
import java.util.Scanner;
 class student1 {
    String name;
    public void setName(String name){
      this.name=name; 
    }
    public String getName(){
        return name;
    }
}
    class Example
    {
       
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("ENTER YOUR NAME PLEASE!!!");
        Scanner key=new Scanner(System.in);
                String name=key.nextLine();
                key.setName(name);
                System.out.println("YOUR NAME IS :"+ name);
                
              String result=key.getName();
        // TODO code application logic here
    }
}
              