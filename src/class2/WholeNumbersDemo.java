package class2;

public class WholeNumbersDemo {

    public static void main(String[] args) {

        // byte is data type; age is the box; whatever is after the equal sign we are telling Java to store that value
        // inside the "age" box.

        /*
        byte => is data type
        age => variable
        "=" => means store the number in the varible
        50 = is the number we want to store (in varible)
        ; => part of syntax jsut like in English we end sentence with ".", we end sentence in Java with ";"
         */
        byte age=100;
        System.out.println(age);
        short noOfApples=3000;
        System.out.println(noOfApples);

        // "int" is the most widely used data type to store whole numbers
        int bankBalance= 100000000;
        System.out.println(bankBalance);

        // as long as the "long" number is within the range of "int" it will work
        long theAgeOfTheWorld= 245676830;
        System.out.println(theAgeOfTheWorld);
        /* if you want to go beyond the "int" number then, add upper case "L" at the end
        whenever we have to store a number that is beyond the range of "int", we have to explicitly write
        the letter "L" at the end to tell Java we are dealing with a special very large number

         */

        long theAgeOfTheWorldOne= 2319_2392392399L;
        System.out.println(theAgeOfTheWorldOne);

        // you can add "_" the underscore when you are dealing with larger numbers to make it easier to read

    }


}
