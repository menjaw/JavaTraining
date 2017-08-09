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
public class LoginScanner {

    public void loginMethod() {
        Scanner scanner = new Scanner(System.in);

        String username = "MyUsername";
        String password = "MyPassword";

        System.out.println("Type in your username");
        String userInput = scanner.nextLine();
        System.out.println("Type in your password");
        String userPassword = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        //Checking login user input
        if (userInput.equalsIgnoreCase(username) && userPassword.equalsIgnoreCase(password)) {
            System.out.println("Hi!" + username);
        } else {
            System.out.println("Sorry. something wasn't rigth");
        }

        //Checking the users age
        switch (age) {
            case 1:
                System.out.println("You can nothing");
                break;
            case 2:
                System.out.println("You can crawl");
                break;
            case 3:
                System.out.println("You can walk");
                break;
            case 4:
                System.out.println("You can run");
                break;
            case 5:
                System.out.println("You can talk");
                break;
            case 6:
                System.out.println("You can laugh");
                break;
            case 7:
                System.out.println("You can hit");
                break;
            case 8:
                System.out.println("You can be punished");
                break;
            case 9:
                System.out.println("You can talk");
                break;
            default:
                System.out.println("Don't you have an age?");
        }
    }

}
