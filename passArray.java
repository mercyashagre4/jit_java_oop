/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.file;


/**
 *
 * @author WIN-10
 */
public class PassArray {

    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        System.out.println("Effects of array");
        int value;
        for(int value:array);
        System.out.println(value);
        modifyArray(array);
        for(int value:array);
        System.out.println(value);
        System.out.println("before modifying array[3]"+array[3]);
        modifyElement(array[3]);
        System.out.println("after modifying array[3]"+array[3]);
        public void modifyArray(int[] array2){
            for(int i=0;i<array2.length;i++){
                array2[i]=array2[i]*2;           
            }
            public void modifyElement(int element){
                element=element*2;
            }
        }
        
        
        a[i]=p.nextInt();
    }
}
