package class9;

public class E8Arrays {
    public static void main(String[] args) {

        boolean [] flags={true,false,true,false,false,true};
        // write a loop to count how many values in above array are false



        for (int i = 0; i < flags.length; i++) {
            if(flags[i]==false){
                System.out.println(flags [i]);
            }

        }

        }
    }

