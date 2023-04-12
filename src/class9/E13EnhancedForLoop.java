package class9;

public class E13EnhancedForLoop {
    public static void main(String[] args) {

        /*
        There are 2 ways of creating arrays
        new int[5] - means to create an array of int with size
         */

        //int [] numbers= new int[5];
        //numbers[2]=50;// store 50 on index 2
        //numbers [0]=100;//store 100 on index 0

        /*numbers [0]=50;
        numbers [1]=60;
        numbers [2]=70;
        numbers [3]=80;
        numbers [4]=90;
        for (int number : numbers){
            System.out.println(number);

            *** the example below will show to create a loop for the above problem
            */

        int [] numbers = new int[5];
        int num=50;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] =num;
            num=num+10;
        }
        for (int number: numbers){
            System.out.println(number);
        }

        }

        }


