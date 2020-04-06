package interviewtest;

import java.util.ArrayList;
import java.util.List;

public class Exercise_01 {

    public static void main(String [] args) {

        String chain = "AABAACAADAABAABA";
        String pattern = "AABA";

        computePatterns(chain, pattern);
    }

    /**
     * Finds the indexes where param pattern is found within param chain
     * @param chain String to be searched
     * @param pattern String searched for
     */
    private static void computePatterns (String chain, String pattern) {

        List<Integer> positions = new ArrayList<>();

        System.out.println("Searching for: " + pattern + "\nin " + chain);

        for (int i = 0; i < chain.length(); i++) {

            if (chain.charAt(i) == pattern.charAt(0)) {
                if ((i+3) > chain.length())
                    break;
                if (chain.charAt(i+1) == pattern.charAt(1)) {
                    if (chain.charAt(i+2) == pattern.charAt(2)) {
                        if (chain.charAt(i+3) == pattern.charAt(3)) {
                            if (chain.contains(pattern))
                                positions.add(i); // Confirms all AABA positions
                        }
                    }
                }
            }
        }

        System.out.println(positions);
    }
}
