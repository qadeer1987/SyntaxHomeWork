package Klass1;

import java.util.Scanner;
public class k20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean isWeekend=scanner.nextBoolean();
        String out;
        if(!isWeekend){
            out="Today you will be learning manual testing";
        }else {
            out="Today you will be learning Java";
        }
    }
}
