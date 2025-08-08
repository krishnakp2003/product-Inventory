/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventrymanagemnetsystem;

import java.util.*;

public class AddProduct {

    private String name;
    private int quantity;
    private double price;
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    ArrayList<Object> addProduct = new ArrayList<>();

    public List addNewProduct() {
        
        System.out.println("=======");
        System.out.println("Enter Product Name: ");
           name = sc.nextLine();
        addProduct.add(name);
        System.out.println("Enter Product Quantity: ");
        quantity = sc.nextInt();
        addProduct.add(quantity);
        System.out.println("Enter Product Price: ");
        price = sc.nextDouble();
        addProduct.add(price);

        return addProduct;
    }

    public void viewProduct() {
        System.out.println("Product List");
        for (Object object : addProduct) {
            System.out.println("Product Name" + object);
            System.out.println("Product Quantity:" + object);
            System.out.println("Product Price :" + object);

        }
        }
         public void removeProduct() {
        System.out.println("Product List");
       addProduct.remove(quantity);
  
    }
           public List updateProduct() {
        
        System.out.println("=======");
        System.out.println("Enter Product Name: ");
           name = sc.nextLine();
        addProduct.add(name);
        System.out.println("Enter Product Quantity: ");
        quantity = sc.nextInt();
        addProduct.add(quantity);
        System.out.println("Enter Product Price: ");
        price = sc.nextDouble();
        addProduct.add(price);

        return addProduct;
    }
}
