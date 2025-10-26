package p2;

import java.util.Random;

public class P2_main {

    /*
     * Entrance to program
     */
    public static void main(String args[]){
        Random random = new Random();

        /*
         * Random values for int i and boolean b.
         */
        int i = random.nextInt(Integer.MIN_VALUE - Integer.MAX_VALUE + 1) + Integer.MIN_VALUE;
        boolean b = random.nextBoolean();

        System.out.println("Integer i: " + String.valueOf(i));
        System.out.println("Boolean b: " + String.valueOf(b));

        /*
         * if i is greater 10 then b true
         */
        if(i>10)
            b = true;
    }
}
