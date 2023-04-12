package class8;

public class E5WhileAndBreak {

    public static void main(String[] args) {
       /* create a boolean variable "summer" and store true in it and then write a loop
       that runs as long as it is summer; create a temperature variable store 85 ;
       inside the look check for temperature and if it is less than 100 print "I enjoy summer";
       as soon as temperature exceeds 100 print "It's very hot" and break the loop with the "break" keyword
        */
        boolean summer = true;
        int temp=85;
        while (summer){
            if (temp<100){
                System.out.println("I enjoy summer");
                }else {
                System.out.println("It's very hot");
                break;
            }
            temp=temp+3;
        }

    }
}
