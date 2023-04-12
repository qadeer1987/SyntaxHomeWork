package class8;

public class E6NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");

        }
        System.out.println();// by adding this we get a new line to repeat the same thing
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
            // we learned loops becuase we do not want to repeat the code
        }
    }
}
