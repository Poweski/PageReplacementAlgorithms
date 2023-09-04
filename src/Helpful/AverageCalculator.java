package Helpful;

import Algorithms.Algorithm;

public class AverageCalculator {

    private final int NUMBER_OF_PAGES;
    private final int NUMBER_OF_FRAMES;
    private final int REFERENCE_STRING_LENGTH;
    private final int STRING_CONSTANT;
    private final int REPETITIONS;

    public AverageCalculator(int NUMBER_OF_PAGES, int NUMBER_OF_FRAMES, int REFERENCE_STRING_LENGTH,
                             int STRING_CONSTANT, int REPETITIONS) {
        this.NUMBER_OF_PAGES = NUMBER_OF_PAGES;
        this.NUMBER_OF_FRAMES = NUMBER_OF_FRAMES;
        this.REFERENCE_STRING_LENGTH = REFERENCE_STRING_LENGTH;
        this.STRING_CONSTANT = STRING_CONSTANT;
        this.REPETITIONS = REPETITIONS;
    }

    public double[] calculateAverage(Algorithm algorithm1, Algorithm algorithm2, Algorithm algorithm3,
                                   Algorithm algorithm4, Algorithm algorithm5) {

        double sum1, sum2, sum3, sum4, sum5;
        sum1 = sum2 = sum3 = sum4 = sum5 = 0;

        int[] referenceString = {0};

        for (int i = 0; i < REPETITIONS; i++) {
            referenceString = StringGenerator.generateReferenceString
                    (REFERENCE_STRING_LENGTH,NUMBER_OF_PAGES,STRING_CONSTANT);
            sum1 += algorithm1.runTheSimulation(referenceString,NUMBER_OF_FRAMES);
            sum2 += algorithm2.runTheSimulation(referenceString,NUMBER_OF_FRAMES);
            sum3 += algorithm3.runTheSimulation(referenceString,NUMBER_OF_FRAMES);
            sum4 += algorithm4.runTheSimulation(referenceString,NUMBER_OF_FRAMES);
            sum5 += algorithm5.runTheSimulation(referenceString,NUMBER_OF_FRAMES);
        }

        StringPrinter.printString(REFERENCE_STRING_LENGTH,STRING_CONSTANT,referenceString);

        return new double[]{sum1/(double)REPETITIONS,sum2/(double)REPETITIONS,sum3/(double)REPETITIONS,
                sum4/(double)REPETITIONS,sum5/(double)REPETITIONS};
    }
}
