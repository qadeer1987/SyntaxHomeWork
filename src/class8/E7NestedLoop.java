package class8;

public class E7NestedLoop {
    public static void main(String[] args) {

        // same example as E6NestedLoop but with nesteed Loop -- that way do not have to copy and paste the loop
        for (int i = 0; i < 3; i++) {// how many times java should execute the for loop
            for (int j = 0; j < 5; j++) {
                System.out.print(j+" ");

            }
            System.out.println();// so that the output is printed on the next line;
            // without this the output will be written on the same line
        }

    }
}
