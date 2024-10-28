import Algorithms.DivideAndConquer;
import Algorithms.MedianOfMedians;
import Algorithms.Naive;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        while (size <= 10000000) {
            runTest(size, random);
            size *= 10;
        System.out.println();
        }

    }

    private static void runTest(int size, Random random) {
        int range = 100000000;
        double navieAvg = 0 ,divideAndConquerAvg = 0,medianOfMediansAvg = 0 ;
        for (int j = 0; j < 6; j++) {
            int[] nums = new int[size];
            boolean[] exist = new boolean[range];
            for (int i = 0; i < size; i++) {
                do {
                    nums[i] = random.nextInt(range);
                } while (exist[nums[i]]);
                exist[nums[i]] = true;
            }
            Naive naive = new Naive(nums);
            DivideAndConquer divideAndConquer = new DivideAndConquer(nums);
            MedianOfMedians medianOfMedians = new MedianOfMedians(nums);
            long startTime = System.nanoTime();
            naive.findMedian();
            long endTime1 = System.nanoTime();
            divideAndConquer.findMedian();
            long endTime2 = System.nanoTime();
            medianOfMedians.findMedian();
            long endTime3 = System.nanoTime();
            if(j == 0) continue;
            System.out.println("|" + size + "|" + (j) + "|" + ((endTime1 - startTime) / 1000000.0) + "|" + ((endTime2 - endTime1) / 1000000.0) + "|" + ((endTime3 - endTime2) / 1000000.0) + "|");
            navieAvg += (endTime1 - startTime) ;
            divideAndConquerAvg += (endTime2 - endTime1) ;
            medianOfMediansAvg += (endTime3 - endTime2);

        }
        System.out.println("| AVERAGE ||"+ navieAvg / 5000000.0 + "|" + divideAndConquerAvg /  5000000.0 + "|" + medianOfMediansAvg /  5000000.0 + "|");

    }

}