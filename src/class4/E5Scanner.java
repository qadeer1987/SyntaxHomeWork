package class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        /*
        Scanner is a class (which knows how to take input from the keyboard)
        scan is a varible of type scanner just as we create a variable of type String
        New keyword=> which creates the ibject of a class
        Scanner again with ()
        System.in=> means we want to use the scanner class for taking the user input
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name=scan.next();
        System.out.println("You are amazing "+name);


    }
}
