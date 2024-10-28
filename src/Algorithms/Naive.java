package Algorithms;

import java.util.Arrays;

public class Naive extends MedianFinder {
    public Naive(int[] nums) {
        super(nums);
    }

    @Override
    public int findMedian() {
        Arrays.sort(nums);
        return nums[(nums.length - 1) / 2];
    }

}
