package h3;

import java.util.Random;

public class H3_main {
    public static void main(String args[]){
        
        Random random = new Random();
        int i = random.nextInt(0,400);
        int j = random.nextInt(0,400);
        int k = random.nextInt();

        // System.out.println("Valuses:\ni: "+i+ "\nj: " + j + "\nk: "+ k + "\n");
        k = -10;
        if(i>j) {
            if(i>200) {
                if(j>100) {
                    // Case 1,2,3
                    k = 3;
                } else { 
                    // Case 1,2,!3
                    k = 2;
                }
            } else if (!(j>100)) {
                // Case 1,!2,!3
                k = 1;
            }
        } else if ((!(i>200)) && (!(j>100))) {
            // Case !1,!2,!3
            k = 4;
        }
        //System.out.println("Resulting k: " + k);
    }
}
