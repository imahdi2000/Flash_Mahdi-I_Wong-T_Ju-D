# Flash_Mahdi-I_Wong-T_Ju-D
Overview of QuickSort:

	  The quicksort algorithm works by seperating values based on another value in the list known as a pivot point. This causes the values less than the value of the pivot point to be on the left of the pivot while the right side had values greater than the pivot. Then, you perform the partition again except it happens to all the values left of the pivot point and all the values right of the pivot point. Eventully, all the values are sorted becuase they will reach a boundary of one and if you have a list of one, it is already sorted. 

Overview of QuickSortTester:
	 Our quicksort tester uses System.currentTimeMillis() to take
	 time measurments. It takes the time when starting the sort and
	 after the sort and then subtracts the two values to get the time
	 it took to run the sort. 

Data Gathered:
     We gathered two different data sets. One data set was with a radomly populated arrays with their times averaged and the other data set contianed averaged times of a sorted array.

n=100 --0.1
n=1000 --0.2
n=10000 -- 1.3
n=100000 -- 98.8

sorted n=100 -- 0.0
sorted n=1000 -- 0.0
sorted n=10000 -- 0.2
sorted n=100000 -- 1.9
sorted n=1000000 -- 19.6

     
Conclusions on big O based on data:

      We conculded that QuickSort is very quick when it comes to arrays that are sorted or semisorted becuase of the data we got on our sorted data set. However, we found that the time started increasing closer to n^2 in the data set with the randomly timed array. Therefore, we agree that quicksort has an O(n^2) becuase it takes exponentially increasing amounts of time as n increases. 


A logical explanation of why big O of QuickSort is the way it is:

      We think that QuickSort takes longer in an unsorted list becuase as it recusively slpits, it does not have to make time consuming swaps. In an unsorted array, QuickSort has to make a number of swaps depending on how unsorted the array is. 

Best and average and worst case scenarios:

      Our best case scenraio would be a sorted list becuase it gave us the best runtime. Our worst case scenarion would be a completly random array according to our data. 



