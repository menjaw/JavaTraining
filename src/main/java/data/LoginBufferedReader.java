/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Menja
 */
public class LoginBufferedReader {

    public void loginMethod() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String username = "Username";
        String password = "Password";
        
        System.out.println("Write your username");
        String usernameInput = br.readLine();
        System.out.println("Write your password");
        String passwordInput = br.readLine();
        System.out.println("How old are you");
        int age = Integer.parseInt(br.readLine());
        
        //Check username
        if (username.equals(usernameInput) && password.matches(passwordInput)) {
            System.out.println("Hi and welcome " + username);
            System.out.println("Thanks for not forgetten your password over the summer");
        }
        else{
            System.out.println("You need to create an account first");
            System.out.println("or" + "\n" + "You have lost your head over the summer");
        }
        
        //Check age

    }

}
