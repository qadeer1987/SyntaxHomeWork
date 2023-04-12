package class3;

import java.util.SortedMap;

public class E17IfElseStatements {
    public static void main(String[] args) {

        if(false)
        /* if we put "true" then Java will execute the statement but if we put "false" it will not execute it,
        leave it blank
         */
        {
            System.out.println("Batch 16 is doing really great.");


        }
        boolean condition=false;

        if(condition){

            System.out.println("Java is easy");
        }

        int age=19;

        if (age>18){
            System.out.println("You are allowed to vote");
        }

    }
}
