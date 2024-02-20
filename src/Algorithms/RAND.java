package Algorithms;

import java.util.LinkedList;
import java.util.Random;

public class RAND implements Algorithm {

    public int runTheSimulation(int[] pageReferences, int numberOfFrames) {

        LinkedList<Integer> frames = new LinkedList<>();
        Random generator = new Random();
        int pageFaults = 0;

        for (int page : pageReferences) {
            if (!frames.contains(page)) {

                if (frames.size() == numberOfFrames) {
                    frames.remove(generator.nextInt(numberOfFrames));
                }
                pageFaults++;
                frames.add(page);
            }
        }

        return pageFaults;
    }
}
