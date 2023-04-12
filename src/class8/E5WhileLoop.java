package class8;

import java.util.Scanner;

public class E5WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting point,ending point");

        int start = scanner.nextInt();// asked the user from where the user will start the loop
        int end = scanner.nextInt();


        int counter = start;// the startint point will be stored in the counter variable
        while (counter <= end) {
            System.out.print(counter + " ");
            counter++;


        }
    }
}

