/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package information;

import static java.lang.Double.sum;

/**
 *
 * @author WIN-10
 */
public class Addition {
    private int a,b;
    public Addition(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void setA(int x){
        a=x;
    }
    public int getA(){
        return a;
    }
    public void setB(int y){
        b=y;
    }
    public int getB(){
        return b;
    }
    public class Calculator extends Addition{
        private int c;
        public Calculator(int a,int b,int c){
        super(a,b);
        this.c=c;
         }
        public void setC(int c){
            this.c=c;
        }
         public int getC(){
            return c;
        }
         public int displaySum(){
             int sum=getA()+getB()+c;
             return sum;
         }
         public class Demo{
             public static void main(String []args){
               Calculator c=new Calculator(6,4,8);
               System.out.println("The sum of three number is:"+sum);
             }
         }
    }
}
