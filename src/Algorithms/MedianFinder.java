package Algorithms;

public abstract class MedianFinder {
    protected int[] nums;
    public MedianFinder(int[] nums) {
        this.nums = nums.clone();
    }
    public abstract int findMedian();
}
