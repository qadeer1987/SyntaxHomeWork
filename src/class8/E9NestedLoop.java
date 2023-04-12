package class8;

public class E9NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) { //this loop will run 100 times and print 5 stars on each line 100 times
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");

            }
            System.out.println();// becuase of this the line will be printed on a new line
        }
    }
}
