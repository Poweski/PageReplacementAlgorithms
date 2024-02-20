package Algorithms;

import java.util.LinkedList;

public class LRU implements Algorithm {
    public int runTheSimulation(int[] pageReferences, int numberOfFrames) {

        LinkedList<Integer> frames = new LinkedList<>();
        int pageFaults = 0;

        for (int page : pageReferences) {
            if (!frames.contains(page)) {

                if (frames.size() == numberOfFrames) {
                    frames.removeFirst();
                }

                pageFaults++;
                frames.add(page);
            }
            else {
                frames.add(frames.remove(frames.indexOf(page)));
            }
        }

        return pageFaults;
    }
}
