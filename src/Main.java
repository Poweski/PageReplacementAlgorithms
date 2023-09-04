import Algorithms.*;
import Helpful.*;

public class Main {

    private final static int NUMBER_OF_PAGES = 10;
    private final static int NUMBER_OF_FRAMES = 4;
    private final static int REFERENCE_STRING_LENGTH = 50;
    private final static int STRING_CONSTANT = 5;
    private final static int REPETITIONS = 100;


    public static void main(String[] args) {

        AverageCalculator calculator = new AverageCalculator
                (NUMBER_OF_PAGES,NUMBER_OF_FRAMES,REFERENCE_STRING_LENGTH,STRING_CONSTANT,REPETITIONS);

        double[] result = calculator.calculateAverage(new FIFO(),new OPT(),new LRU(),new ALRU(),new RAND());

        System.out.println("\n\nNumber of page faults for algorithm:");
        System.out.println("FIFO: " + result[0]);
        System.out.println("OPT: " + result[1]);
        System.out.println("LRU: " + result[2]);
        System.out.println("ALRU: " + result[3]);
        System.out.println("RAND: " + result[4]);
    }
}