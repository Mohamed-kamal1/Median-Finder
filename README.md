## Median Finder

 ### Compares the performance of three different algorithms to find the median of an array of integers.
(time in milliseconds)

| Array Size | Test |   Naive   | Divide And Conquer | Median Of Medians |
|:----------:|:----:|:---------:|:------------------:|:-----------------:|
|     10     |  1   |  0.0054   |       0.0049       |      0.0115       |
|     10     |  2   |  0.0048   |       0.0026       |       0.009       |
|     10     |  3   |  0.0054   |       0.0046       |      0.0146       |
|     10     |  4   |  0.0058   |       0.0041       |       0.007       |
|     10     |  5   |  0.0048   |       0.0037       |      0.0093       |
|  AVERAGE   |      |  0.00524  |      0.00398       |      0.01028      |
|            |      |           |                    |                   |
|    100     |  1   |   0.026   |       0.0181       |      0.0455       |
|    100     |  2   |  0.0266   |       0.0107       |       0.061       |
|    100     |  3   |   0.028   |       0.0078       |      0.0598       |
|    100     |  4   |  0.0431   |       0.0189       |      0.0604       |
|    100     |  5   |  0.0342   |       0.0133       |       0.072       |
|  AVERAGE   |      |  0.03158  |      0.01376       |      0.05974      |
|            |      |           |                    |                   |
|    1000    |  1   |   0.354   |       0.1366       |      0.4354       |
|    1000    |  2   |  0.3188   |       0.0544       |      0.2783       |
|    1000    |  3   |   0.305   |       0.1293       |      0.0855       |
|    1000    |  4   |  0.1284   |       0.1472       |      0.2469       |
|    1000    |  5   |   0.102   |       0.0782       |       0.122       |
|  AVERAGE   |      |  0.24164  |      0.10914       |      0.23362      |
|            |      |           |                    |                   |
|   10000    |  1   |  0.8353   |       1.052        |      0.9587       |
|   10000    |  2   |  3.6641   |       0.4401       |      1.8926       |
|   10000    |  3   |  1.0019   |       0.4272       |       1.484       |
|   10000    |  4   |  1.2363   |       0.3031       |      1.4707       |
|   10000    |  5   |  0.8963   |       0.1819       |      0.6657       |
|  AVERAGE   |      |  1.52678  |      0.48086       |      1.29434      |
|            |      |           |                    |                   |
|   100000   |  1   |  33.1088  |       2.6702       |      5.9711       |
|   100000   |  2   |  7.1723   |       1.066        |       4.966       |
|   100000   |  3   |  5.8894   |       1.0363       |      4.1364       |
|   100000   |  4   |  6.0334   |       1.3338       |      6.1371       |
|   100000   |  5   |  7.8972   |       1.1017       |      6.2888       |
|  AVERAGE   |      | 12.02022  |       1.4416       |      5.49988      |
|            |      |           |                    |                   |
|  1000000   |  1   | 119.9488  |      15.6791       |      64.4065      |
|  1000000   |  2   |  80.7079  |      16.6909       |      61.3165      |
|  1000000   |  3   |  76.2372  |      12.4268       |      53.5385      |
|  1000000   |  4   |  77.1104  |      10.7895       |      55.5222      |
|  1000000   |  5   |  74.0442  |      13.7513       |      51.569       |
|  AVERAGE   |      |  85.6097  |      13.86752      |     57.27054      |
|            |      |           |                    |                   |
|  10000000  |  1   | 918.4973  |      96.5115       |     387.7745      |
|  10000000  |  2   | 847.7046  |      134.3267      |     551.5801      |
|  10000000  |  3   | 822.0864  |      99.7573       |     362.1846      |
|  10000000  |  4   | 793.4334  |      99.1203       |     408.6323      |
|  10000000  |  5   | 787.8256  |      65.3731       |     434.5069      |
|  AVERAGE   |      | 833.90946 |      99.01778      |     428.93568     |

median of medians expected to be faster than divide and conquer, but time to get pivot is high and made the algorithm slower than divide and conquer.
hoverer, divide and conquer will be slow if the array is already sorted or semi-sorted.
naive algorithm is the fastest if array size is small, but it is the slowest if array size is large.
## Conclusion
Median of medians is designed to  provide a worst-case linear time complexity, making it more
predictable and reliable for finding the median in an array.  
The randomized divide-and-conquer is efficient on average but has a small probability of hitting worst-case behavior due to randomization.  
Naive method is not recommended for large arrays because of its quadratic worst-case time complexity.













          
