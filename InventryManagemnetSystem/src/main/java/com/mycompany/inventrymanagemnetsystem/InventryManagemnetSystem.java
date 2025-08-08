/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventrymanagemnetsystem;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author krish
 */
public class InventryManagemnetSystem {
 
    public static void main(String[] args) {
         AddProduct addProduct= new AddProduct();
        Scanner sc= new Scanner(System.in);
       
      while(true){
            System.out.println("Choose Operation : Enter Number");
        System.out.println("1. Add Product");
        System.out.println("2. Add View Product");
        System.out.println("3. Add Remove Product");
          System.out.println("4. AddUpdate Product");
           int choice= sc.nextInt();
         
           if(choice==1){
                addProduct.addNewProduct();  
           }
           else if(choice==2){
                 
                addProduct.viewProduct();
           }
        else if(choice==3){
                 
                addProduct.removeProduct();
           }
        else if(choice==4){
                 
                addProduct.updateProduct();
           }
       
        
      }  
    }
}
