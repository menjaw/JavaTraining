/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Menja
 */
public class Product {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //PRODUCT
        String product = "Ananas";
        int amount = 100;
        double price = 15;

        //CHOOSE PRODUCT
        System.out.println("There are " + amount + " " + product + " and they cost" + price + " per each");
        System.out.println("Choose the product you want?");
        String choosedProduct = scanner.nextLine();
        System.out.println("How many products do you want?");
        int choosedAmount = scanner.nextInt();

        //CHOOSED PRODUCT
        if (product.equalsIgnoreCase("Ananas")) {
            while (choosedAmount != 0 && amount != 0) {
                choosedAmount -= 1;
                amount -= 1;
                System.out.println("Congratulasion with your new " + choosedProduct);
            }
        }
 
        System.out.println("There are now " + amount + " " + product);
    }

}
