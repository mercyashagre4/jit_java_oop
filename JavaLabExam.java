/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pack1;
import java.util.*;
/**
 *
 * @author WIN-10
 */
    interface Movies{
    public void displayDetails();
   public int getNumberOfMovies();
    public void displayCatagory();
    
}
class ActionMovies implements Movies{
    int id;
    int i=0;
    String catagory;
    String title;
    String studio;
    int rating;
   public ActionMovies(int id, String catagory,String title,String studio,int rating ){
        this.id=id;
        this.catagory=catagory;
        this.title=title;
        this.studio=studio;
        this.rating=rating;
       
    public ActionMovies(){  
        this.catagory="";
        this.id=i++;
    } 
    public void displayDetails(){
        System.out.println(this.id);
        System.out.println(this.catagory);
        System.out.println(this.title);
        System.out.println(this.studio);
        System.out.println(this.rating);
    }
    
    public int getNumberOfMovies(){
        return i;
    }
    public void displayCatagory(){
        System.out.println("The catagory is:"+this.catagory);
    }
   }
     class RomanticMovies implements Movies{
    int id;
    int i=0;
    String catagory;
    String title;
    String studio;
    int rating;
    public RomanticMovies(int id,String catagory,String title,String studio,int rating){
    this.id=id;
    this.catagory=catagory;
    this.title=title;
    this.studio=studio;
    this.rating=rating;
    }
    
    public void displayDetails(){
        System.out.println(this.id);
        System.out.println(this.catagory);
        System.out.println(this.title);
        System.out.println(this.studio);
        System.out.println(this.rating);
    }
    public int getNumberofMovies(){
        return i;
    }
    public void displayCatagory(){
        System.out.println("The catagory is : "+this.catagory);
    




    class ActionRomance extends RomanticMovies { 
        void calculateTotalMovies(){
            Scanner sc= new Scanner(System.in);
             System.out.println("Enter number of action movies:");
             int a=sc.nextInt();
           System.out.println("Enter number of Romantic movies : ");
        int t=sc.nextInt();
        int totalMovies=a+t;
        System.out.println("The total movies are : "+totalMovies);
    }
  }
    class ActionRomance extends ActionMovies { 
        void calculateTotalMovies(){
            Scanner sc= new Scanner(System.in);
             System.out.println("Enter number of action movies:");
             int a=sc.nextInt();
           System.out.println("Enter number of Romantic movies : ");
        int t=sc.nextInt();
        int totalMovies=a+t;
        System.out.println("The total movies are : "+totalMovies);
    }
  }
    
public class main {

    public static void main(String[] args) {
    ActionMovies am=new ActionMovies(23,"Action","what","Warner bros",3);
    RomanticMovies rm=new RomanticMovies(12,"Romantic","High now","Universal",5);
    CalculateTotalMovies cm=new CalculateTotalMovies();
    am.displayDetails();
    am.displayCatagory();
    am.getNumberofMovies();
    rm.displayDetails();
    rm.displayCatagory();
    rm.getNumberofMovies();
    cm.calculateTotalMovies();
    
    }
    
}
             
            
        }
               

