package class7;

public class E12WhileLoop {
    public static void main(String[] args) {

        //add all of the numbers from 1 to 10 and siaply the result
        int counter=1;
        int sum=0;
        while (counter<=10){
            sum+=counter; //sum=sum+counter
            counter++;
        }
        System.out.println(sum);
    }
}
