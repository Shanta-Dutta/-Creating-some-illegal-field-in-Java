package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a name of your favourite Pet: ");
        String name = userInput.nextLine();

     int ageLimit = 10;
        System.out.println("How old is your pet?");

        int age = Integer.parseInt(userInput.nextLine());
        if (age < ageLimit){
            System.out.println("Awwwwwww, lovely!");

        } else{
            System.out.println("Don't you know your pet's age?");
        }

        if (name.equalsIgnoreCase("cat"))
        {
            System.out.println("The " +  name.toLowerCase() + " sounds moo,meow,mew,purr");
        } else {
            System.out.println("oops! enter the correct name");

        }
    }
}
