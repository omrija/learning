package learning;

import static java.lang.System.*;

/**
 * Applying some of http://graphics.stanford.edu/~seander/bithacks.html in Java.
 * See also:
 * http://sys.cs.rice.edu/course/comp314/10/p2/javabits.html
 * http://www.leepoint.net/data/expressions/bitops.html
 * http://www.vipan.com/htdocs/bitwisehelp.html
 *
 */
public class BitTwiddlingHacks {
    
    
    public static int min(int x, int y) {
        // doesn't work, can't have negative boolean in Java, ie -(x < y)
        //return y ^ ((x ^ y) & -(x < y));
        return -1;
    }
    
    public static boolean isPowerOf2(int v) {
        // original, has numerous issues in java
        //return v && !(v & (v - 1));
        return false;
    }
    
    public static void main(String[] args) {
        out.println("Started");
        
        int x = 23;
        int y = 37;
        out.printf("BEFORE: x: %s, y: %s\n", x, y);
        
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        out.printf("AFTER: x: %s, y: %s\n", x, y);
        out.println("Finished");
    }
}
