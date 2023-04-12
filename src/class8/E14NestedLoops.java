package class8;

public class E14NestedLoops {
    public static void main(String[] args) {

        /*
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
         */

        for (int i = 0; i < 3; i++) {// because I want to print 3 rows
            for (int j = 1; j <=5 ; j++) {// i want the printing to start from run and got until 5
                System.out.print(i+j+" ");// i want the next line to print but add 1

            }
            System.out.println();

        }
    }

}
