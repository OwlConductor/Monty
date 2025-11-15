package p3;

import java.util.Random;

public class P3_main {
    /*
     * Entrance to program
     */
    public static void main(String args[]) {
        Random random = new Random();

        int i = random.nextInt();
        int j = random.nextInt();
        int k = random.nextInt();

        //System.out.println("A is i less j \nB is i less k\nC is j less k\n");
        //System.out.println("Start of output");

        if(i<j)
            System.out.println("A");
        if(i<k)
            System.out.println("B");
        if(j<k)
            System.out.println("C");
            
        //System.out.println("End of output\n");
    }
}
