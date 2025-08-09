/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.inventrymanagemnetsystem;

import java.util.Scanner;

/**
 *
 * @author krish
 */
public class InventryManagemnetSystem {

    public static void main(String[] args) {
        AddProduct addProduct = new AddProduct();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose Operation : Enter Number");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Update Product");
            int choice = sc.nextInt();

            if (choice == 1) {
                addProduct.addNewProduct();
            } else if (choice == 2) {

                addProduct.viewProduct();
            } else if (choice == 3) {

                addProduct.removeProduct();
                System.out.println("Product Removed Successfully");
            } else if (choice == 4) {

                addProduct.updateProduct();
                System.out.println("Product Updated Successfully");
            }

        }
    }
}
