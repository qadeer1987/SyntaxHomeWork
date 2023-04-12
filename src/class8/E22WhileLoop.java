package class8;

import java.util.Scanner;

public class E22WhileLoop {
    public static void main(String[] args) {

        /* in a while loop ask the user to enter numbers and if the user enters any number other than
        then -1 print "Hello World" and keep on asking the user for a number
        the moment the user enter the number -1 the loop should stop
        -- when we do not know the number of iteration then use do while or while loop
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter number");


        int number= scanner.nextInt();

        while (number!=-1){
            System.out.println("Try again");
            number=scanner.nextInt();

        }

    }
}
