package class8;

import java.util.Scanner;

public class E4WhileLoop {
    public static void main(String[] args) {

        /* ask user to enter starting point (from the number where the printing will start),
        ending point (until the number the prin ting will continue)
        and the step (meaning the gap between numbers from the start and until the end)

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting point,ending point, and the step");

        int start= scanner.nextInt();
        int end= scanner.nextInt();
        int step= scanner.nextInt();


        int number=start;
        while (number<=end){
            System.out.print(number+" ");
            number=number+step; // or number+=step;
        }
    }
}


