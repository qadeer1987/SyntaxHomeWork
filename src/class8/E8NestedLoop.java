package class8;

public class E8NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {// we are getting 5 "*" because the for i<5
            System.out.print("* ");

        }
        System.out.println();// by doing this copy nad paste I will see another row of stars
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
//what if I want to see 100 lines of stars "*"
        }
    }
}
