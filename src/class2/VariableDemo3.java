package class2;

public class VariableDemo3 {

    public static void main(String[] args) {

        int age=80;
        age=81; // we are updating the value of age variable

        System.out.println(age);

        /* Java executes codes from the top to bottom that's why, since the variable was change the printout will show
        81 instead of 80. Java executes the code in sequence.

         */

        String president="Trump";
        president="Biden";
        System.out.println(president);

    }
}
