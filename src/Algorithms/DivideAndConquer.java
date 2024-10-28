package Algorithms;

public class DivideAndConquer extends MedianFinder{

    public DivideAndConquer(int [] nums) {
        super(nums);
    }

    private int findKthElement(int [] nums, int start, int end, int k) {
        int pivot = partition(nums, start, end);
        if(pivot == k) return nums[pivot];
        if(pivot > k) return findKthElement(nums, start, pivot - 1, k);
        return findKthElement(nums, pivot + 1, end, k);
    }
    // partition the array and return the index of the pivot element
    private int partition(int [] nums, int start, int end) {
        int pivot = nums[start];
        int startPointer = start;
        for(int i = start + 1; i <= end; i++) {
            if(nums[i] < pivot) {
                startPointer++;
                swap(startPointer, i);
            }
        }
        swap(start, startPointer);
        return startPointer;
    }

    // swap the elements at index i and j
    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    @Override
    public int findMedian() {
        int medianIndex = (nums.length - 1) / 2;
        return findKthElement(nums, 0, nums.length - 1, medianIndex);
    }
}
