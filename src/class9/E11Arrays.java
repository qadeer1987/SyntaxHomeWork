package class9;

public class E11Arrays {
    public static void main(String[] args) {

        /*
        1. print all the numbers from 6 to 0 in reverse order
        2. {'A',Bc,C,D,E,F}

         */
        char [] chars={'A','B','C','D','E','F'};
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.println(i+" "+chars[i]);

        }
    }
}
