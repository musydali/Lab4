/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * Reclamation Project.
 */

public class ReclamationProject {
    /**
     *
     * @param a as a string
     * @param b as a string
     * @return a String
     */
    static String doit(final String a,  final String b) {
        String tempA, tempB, tempC;
        tempA = a;
        tempB = b;
        if (a.length() > b.length()) {
            String c = a; // TODO set c to a
            tempA = b; tempB = c;
            }
        String r = " ";
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
        if (a.regionMatches(i, b, k, j) && j > r.length()) {
            r = a.substring(i, i + j);
        } else {
            r = r;
        }
                        }
                } // Ah yeah
        } return r; }
}
