package class8;

import java.util.Scanner;

public class E3WhileLoop {
    public static void main(String[] args) {
/* to print all the numbers from a starting point to ending point,
ask user for starting and ending number
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting and the ending point");

        int start= scanner.nextInt();
        int end= scanner.nextInt();


        int number=start;
        while (number<=end){
            System.out.print(number+" ");
            number++;
        }
    }
}


