package h2;

import java.util.Random;

public class H2_main {
    
    public static void main(String args[]) {
        Random random = new Random();
        int i = random.nextInt();
        int j = random.nextInt();
        int k = random.nextInt();
        int min = i;
        int max = i;

        /*
         * If one value is less than min, min gets set to that value
         * If one value is greater than max, max gets set to that value
         */
        for(int currentNumber :  new int[]{j,k}) {
            if (min > currentNumber)
                min = currentNumber;
            if (max < currentNumber)
                max = currentNumber;
        }

        // System.out.println("Numbers:\ni: "+i+ "\nj: " + j + "\nk: "+ k);
        // System.out.println("min: " + min);
        // System.out.println("max: " + max);

    }
}
