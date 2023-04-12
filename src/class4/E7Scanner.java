package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scanner.next();

        if (name.equals("Qadeer")){
            System.out.println("Mac User");
        }else if(name.equals("Khatira")){
            System.out.println("Naughty");
        }else if(name.equals("Ghul")){
            System.out.println("Best");
        }else if (name.equals("Amira")){
            System.out.println("Beautiful girl");
        }
    }
}
