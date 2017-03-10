public class QuickSortTester
{

    /******************************
     Creates 10 arrays of 1,10,50,100,and 1000 items and finds the avg time in miliseconds it takes to complete a merge sort, printing out a trace diagram for each test case.
     ******************************/

    public static long time(int[] arr){
	QuickSort runner = new QuickSort();
	long time = System.nanoTime();
	runner.qsort(arr);
	time = System.nanoTime() - time;
	return time;
    }
    
    public static void main( String[] args ) 
    {
	int[] test100= new int [100];
	int[] test1000 = new int [1000];
	int[] test10000 = new int [10000];
	int[] test100000 = new int [100000];
	//int[] test500000 = new int[5000000];
	//int[] test3000 = new int[3000];
	int[] stest100= new int [100];
	int[] stest1000 = new int [1000];
	int[] stest10000 = new int [10000];
	int[] stest100000 = new int [100000];
	
	double a = 0;
	double b = 0;
	double time100 = 0;
	double time1000 = 0;
	double time10000 = 0;
	double time100000 = 0;
	double stime100 = 0;
	double stime1000 = 0;
	double stime10000 = 0;
	double stime100000 = 0;
	//double time500000 = 0;
	//double time4000 = 0;
      

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=100~~~~~~~~~~~~~~");
	int counter = 0;
	while (counter<9){
	    //populate a 1000 item array
	    int x = 0;
	    while(x<100){
		test100[x] = (int) (Math.random() * 50);
		x++;
	    }
	    System.out.println("Testing on array ");
	    //QuickSort.printArr(test100);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    QuickSort.qsort(test100);
	    // QuickSort.printArr(test100);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time100 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=1000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 1000 item array
	    int p = 0;
	    while(p<1000){
		test1000[p] = (int) (Math.random() * 50);
		p++;
	    }
	    System.out.println("Testing on array ");
	    //QuickSort.printArr(test1000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    QuickSort.qsort(test1000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time1000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

       	System.out.println("~~~~~~~~~~ARRAY n=10000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 1500 item array
	    int y = 0;
	    while(y<10000){
		test10000[y] = (int) (Math.random() * 50);
		y++;
	    }
	    System.out.println("Testing on array ");
	    //QuickSort.printArr(test10000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    QuickSort.qsort(test10000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time10000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=100000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 2000 item array
	    int z = 0;
	    while(z<100000){
		test100000[z] = (int) (Math.random() * 50);
		z++;
	    }
	    System.out.println("Testing on array ");
	    //QuickSort.printArray(test100000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    QuickSort.qsort(test100000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time100000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("HERE COMES THE SORTED ARRAYS");
	System.out.println("~~~~~~~~~~SORTED ARRAY n=100~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 100 sorted item array
	    int p = 0;
	    while(p<100){
		stest100[p] = p;
		p++;
	    }
	    System.out.println("Testing on sorted array ");
	    //QuickSort.printArr(test1000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    QuickSort.qsort(stest100);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    stime100 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~SORTED ARRAY n=1000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 100 sorted item array
	    int p = 0;
	    while(p<1000){
		stest1000[p] = p;
		p++;
	    }
	    System.out.println("Testing on sorted array ");
	    //QuickSort.printArr(test1000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    QuickSort.qsort(stest1000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    stime1000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~SORTED ARRAY n=10000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 10000 sorted item array
	    int p = 0;
	    while(p<10000){
		stest10000[p] = p;
		p++;
	    }
	    System.out.println("Testing on sorted array ");
	    //QuickSort.printArr(test10000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    QuickSort.qsort(stest10000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    stime10000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~SORTED ARRAY n=100000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 100000 sorted item array
	    int p = 0;
	    while(p<100000){
		stest100000[p] = p;
		p++;
	    }
	    System.out.println("Testing on sorted array ");
	    //QuickSort.printArr(test100000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    QuickSort.qsort(stest100000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    stime100000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("AVG TIME FOR n=100:" + (time100 *1.0 / 10));
	System.out.println("AVG TIME FOR n=1000:" + (time1000 *1.0 / 10));		
	System.out.println("AVG TIME FOR n=10000:" + (time10000 *1.0 / 10));
	System.out.println("AVG TIME FOR n=100000:" + (time100000 *1.0 / 10));
	System.out.println("AVG TIME FOR SORTED n=100:" + (stime100 *1.0 / 10));
	System.out.println("AVG TIME FOR SORTED n=1000:" + (stime1000 *1.0 / 10));		
	System.out.println("AVG TIME FOR SORTED n=10000:" + (stime10000 *1.0 / 10));
	System.out.println("AVG TIME FOR SORTED n=100000:" + (stime100000 *1.0 / 10));
    }//end main

}//end class
