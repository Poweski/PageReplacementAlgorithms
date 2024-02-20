package Algorithms;

import java.util.LinkedList;

public class OPT implements Algorithm {

    public int runTheSimulation(int[] pageReferences, int numberOfFrames) {

        LinkedList<Integer> frames = new LinkedList<>();
        int pageFaults = 0;

        for (int i = 0; i < pageReferences.length; i++) {
            if (!frames.contains(pageReferences[i])) {

                if (frames.size() < numberOfFrames) {
                    frames.add(pageReferences[i]);
                }

                else {

                    int index = -1;
                    int farthest = 0;

                    for (int j = 0; j < numberOfFrames; j++) {

                        int frame = frames.get(j);
                        int farthestIndex = pageReferences.length;
                        boolean flag = true;

                        for (int k = i; k < pageReferences.length; k++) {
                            if (pageReferences[k] == frame) {
                                flag = false;
                            }
                            if (pageReferences[k] == frame && farthestIndex > k) {
                                farthestIndex = k;
                            }
                        }

                        if (flag) {
                            index = j;
                            break;
                        } else if (farthestIndex > farthest) {
                            farthest = farthestIndex;
                            index = j;
                        }
                    }

                    frames.set(index, pageReferences[i]);
                }

                pageFaults++;
            }
        }

        return pageFaults;
    }
}
