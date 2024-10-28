package Algorithms;

import java.util.Arrays;

public class MedianOfMedians extends MedianFinder {

    public MedianOfMedians(int[] nums) {
        super(nums);
    }
    private int findKthElement(int [] nums, int start, int end, int k) {
        int size = end - start + 1;
        // base case
        if(size <= 5) {
            Arrays.sort(nums, start, end + 1);
            return nums[start + k];
        }
        // divide the array into groups of 5 and find the median of each group
        int numOFMedians = (size + 4) / 5; // +4 to handle the case when size is not divisible by 5
        int [] medians = new int[numOFMedians];
        for(int i = 0; i < size / 5; i++) {
            medians[i] = findMedian(nums, start + i * 5, start + i * 5 + 4);
        }
        if(size % 5 != 0) {
            medians[size / 5] = findMedian(nums, start + size - size % 5 , end);
        }
        // find the median of medians
        int medianOfMedians = findKthElement(medians, 0, numOFMedians - 1, (numOFMedians -1)/ 2);
        // partition the array around the median of medians
        int pivot = partition(nums, start, end, medianOfMedians);
        if(pivot - start == k) return nums[pivot];
        if(pivot - start > k) return findKthElement(nums, start, pivot - 1, k);
        return findKthElement(nums, pivot + 1, end, k - (pivot - start + 1));
    }

    private int findMedian(int[] nums, int start, int end) {
        Arrays.sort(nums, start, end + 1);
        return nums[start + (end - start) / 2];
    }
    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int partition(int[] nums, int start, int end, int pivot) {
        // find the index of the pivot element
        int pivotIndex = -1;
        for(int i = start; i <= end; i++) {
            if(nums[i] == pivot) {
                pivotIndex = i;
                break;
            }
        }
        // swap the pivot element with the first element
        swap(pivotIndex, start);
        // partition the array around the pivot element
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

        @Override
    public int findMedian() {
        int medianIndex = (nums.length - 1) / 2;
        return findKthElement(nums, 0, nums.length - 1, medianIndex);
    }
}
