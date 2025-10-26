package h1;

import java.util.Random;

public class H1_main {
    public static void main(String args[]) {
        Random random = new Random();
        int z = random.nextInt();

        /*
         * Shrink value of z with modulo 10 operation to an risidual value below 10
         */
        if(z>10)
            z =  z % 10;

        System.out.println(String.valueOf(z));
    }
}
