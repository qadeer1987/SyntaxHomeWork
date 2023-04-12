package class7;

public class E8WhileLoop {
    public static void main(String[] args) {

        int counter=25;
        while (counter>=5) {
            if (counter != 10 && counter!=15) {
                System.out.println(counter + " ");
            }
                counter -= 5;

        }
    }
}
