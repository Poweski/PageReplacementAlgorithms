package Algorithms;

import MyObjects.Page;

import java.util.LinkedList;

public class ALRU implements Algorithm {

    public int runTheSimulation(int[] pageReferences, int numberOfFrames) {

        LinkedList<Page> frames = new LinkedList<>();
        int pageFaults = 0;

        for (int value : pageReferences) {
            if (!frames.contains(new Page(value))) {

                if (frames.size() < numberOfFrames) {
                    frames.add(new Page(value));
                }

                else {

                    boolean isFound = false;
                    int pointer = 0;

                    while (!isFound) {

                        pointer %= numberOfFrames;

                        if (!frames.get(pointer).getReferenceBit()) {
                            frames.remove(pointer);
                            frames.add(pointer, new Page(value));
                            isFound = true;
                        } else {
                            frames.get(pointer).setReferenceBit(false);
                        }

                        pointer++;
                    }
                }

                pageFaults++;
            }
        }

        return pageFaults;
    }
}
