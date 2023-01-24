/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author WIN-10
 */

public class Method {

                   int x;
                   int y;
           int function(int x,int y)
                   {        
           x=4;
           y=6;       
       int sum=0;
              sum=x+y;
              System.out.println("the sum is:"+  sum);
                return (sum);
                           }      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int x=2;
       int y=4;
           function(x,y);
    }
}
