package class9;

public class E4Arrays {
    public static void main(String[] args) {

        double [] numbers={10.5,5.5,0.05,100.05,586,451,545,1,51,5};

        //System.out.println(numbers[i]);
        System.out.println(numbers.length);// numbers.length shows the total count of elements in array
        for (int j = 0  ; j < numbers.length ; j++) {

            System.out.print(numbers [j]+ " ");

        }
    }
}
