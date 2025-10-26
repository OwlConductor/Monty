package p3;

import java.util.Random;

public class P3_main {
    /*
     * Entrance to program
     */
    public static void main(String args[]) {
        Random random = new Random();

        int i = random.nextInt(Integer.MIN_VALUE - Integer.MAX_VALUE + 1) + Integer.MIN_VALUE;
        int j = random.nextInt(Integer.MIN_VALUE - Integer.MAX_VALUE + 1) + Integer.MIN_VALUE;
        int k = random.nextInt(Integer.MIN_VALUE - Integer.MAX_VALUE + 1) + Integer.MIN_VALUE;

        System.out.println("A is i less j \nB is i less k\nC is j less k");
        if(i<j)
            System.out.println("A");
        if(i<k)
            System.out.println("B");
        if(j<k)
            System.out.println("C");
        System.out.println("End of output");
    }
}
