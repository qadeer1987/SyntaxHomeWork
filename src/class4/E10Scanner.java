package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender");
        /*
        There is no direct method for the "char" method in scanner class
        we use a work around. First, we use the next method to take a String from the user
        and from that String we extract the first letter by passing
        0 to the chartAt() method.
         */
        char gender=scanner.next().charAt(2);
        System.out.println("You entered "+gender);

    }
}
