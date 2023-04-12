package class8;

public class E2ForLoop {
    public static void main(String[] args) {
        /* 1 2 3 4 5 6 7 8 9 10 => the computer has to go though the number step by step to find which one is even or not
        every time it finds an even number it seperates it and then finds next even numbers and adds it to the previous
        even number

        ** whenever you have to print final result you write "the print out" outside of the loop
        ** whenever you have to print each iteration/line then you write "the print out" inside the loop
         */


        /*
        write a loop to add all the even numbers from 1 to 30 and then display the result
         */

        int sum=0; // creating a variable to hold the sum
        for (int i = 1; i <=30 ; i++) {
            if (i % 2 == 0) { // checking if number is even
                sum = sum + i;// sum+=1; // adding all the even numbers to sum variable one by one
            }
        }
        System.out.println(sum);// outside of the loop so I can jsut get the final number instead of each addition

    }
}
