package Helpful;

import java.util.Random;

public class StringGenerator {
    public static int[] generateReferenceString(int REFERENCE_STRING_LENGTH, int NUMBER_OF_PAGES, int STRING_CONSTANT) {

        int[] string = new int[REFERENCE_STRING_LENGTH];
        Random generator = new Random();
        int counter = 0;

        for (int i = 0; i < REFERENCE_STRING_LENGTH/STRING_CONSTANT; i++) {
            int tmp = generator.nextInt(NUMBER_OF_PAGES);
            for (int j = 0; j < STRING_CONSTANT; j++) {
                string[counter++] = Math.min(NUMBER_OF_PAGES, tmp + (int) generator.nextExponential());
            }
        }

        return string;
    }
}