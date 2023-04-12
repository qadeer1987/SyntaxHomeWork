package class8;

public class E4BreakKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                break;//whenever we are inside the loop and when Java encounters the "break" it stops the loop
            }
            System.out.println(i);
        }

    }
}