package Helpful;

public class StringPrinter {
    public static void printString(int REFERENCE_STRING_LENGTH, int STRING_CONSTANT, int[] referenceString) {
        System.out.println("\nReference string sample: ");
        int counter = 0;
        while (counter < REFERENCE_STRING_LENGTH) {
            System.out.print(referenceString[counter++] + " ");
            if (counter % STRING_CONSTANT == 0) {
                System.out.println();
            }
        }
    }
}
