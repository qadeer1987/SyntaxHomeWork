package class8;

public class E13NestedLoops {
    public static void main(String[] args) {

        /*
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
        5 5 5 5 5
         */

        for (int i = 2; i <= 5; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
