package Klass1;

public class k9 {
    public static void main(String[] args) {
        int age=26;

        if (age<18){
            System.out.println("You are teenager, please don't work");
        }else {
            System.out.println("You are older than 18");
            if (age<64){
                System.out.println("You are eligible to work");
            }else {
                System.out.println("Enjoy your life");
            }
        }

    }
}
