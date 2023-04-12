package class2;

public class Variables {
    public static void main(String[] args) {

        String firstName="Qadeer";
        String lastName="Zadran";
        char grade='A';
        String city="Ashburn";
        String state="Virginia";
        String phoneNumber="(202) 674-2345";

        System.out.println("My first name is" +" " + firstName+" " +"and my last name is"+" "+lastName+".");
        System.out.println("I am"+" "+grade+" "+"student.");
        System.out.println("I live in"+" "+city+""+","+state+'.');
        System.out.println("My phone number is"+" "+phoneNumber+'.');

        city="Miami";
        state="Florida";
        phoneNumber="(804) 345-1234";
        grade='B';

        System.out.println("My name is"+" "+firstName+" "+"and I moved to"+" "+city+','+" "+state+'.');
        System.out.println("My new phone number is"+" "+phoneNumber+'.');


    }
}
