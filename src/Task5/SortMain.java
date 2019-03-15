package Task5;

import java.util.Random;

public class SortMain {
    public static void main(String[] args) {
            int size=1000000;
            Random random = new Random();
            int[] a = new int[size];
            int[] b = new int[size];
            int[] c = new int[size];

            for (int i = 0; i < size; i++)
                a[i] = i;
            for (int i = size - 1, j = 0; i >= 0; i--, j++)
                b[i] = j;
            for (int i = 0; i < size; i++)
                c[i] = random.nextInt(size);

            //printArray(a);
            //printArray(b);
            //printArray(c);
            double[] time = new double[3];

            long tStart = System.currentTimeMillis();
            //ShellSort.sort(a);                                // 1 Shell
            //SelectionSort.sort(a);                            // 2 Selection
            //CocktailSort.cocktailSort(a);                     // 3 Cocktail
            //HeapSort.sort(a);                                 // 4 Heap
            //MergeSort.sort(a,0,size-1);                       // 5 Merge

            long tEnd = System.currentTimeMillis();
            long tDelta = tEnd - tStart;
            time[0] = (double) tDelta / 1000.000;

            tStart = System.currentTimeMillis();
            //ShellSort.sort(b);                                // 1 Shell
            //SelectionSort.sort(b);                            // 2 Selection
            //CocktailSort.cocktailSort(b);                     // 3 Cocktail
            //HeapSort.sort(b);                                 // 4 Heap
            //MergeSort.sort(b,0,size-1);                       // 5 Merge
            tEnd = System.currentTimeMillis();
            tDelta = tEnd - tStart;
            time[1] = (double) tDelta / 1000.000;

            tStart = System.currentTimeMillis();
            //ShellSort.sort(c);                                // 1 Shell
            //SelectionSort.sort(c);                            // 2 Selection
            //CocktailSort.cocktailSort(c);                     // 3 Cocktail
            //HeapSort.sort(c);                                 // 4 Heap
            //MergeSort.sort(c,0,size-1);                       // 5 Merge
            tEnd = System.currentTimeMillis();
            tDelta = tEnd - tStart;
            time[2] = (double) tDelta / 1000.000;

            //printArray(a);
            //printArray(b);
            //printArray(c);

            System.out.println("\nSort:\n" + "Best case: " + time[0] + "ms");
            System.out.println("Worst case: " + time[1] + "ms");
            System.out.println("Average case: " + time[2] + "ms");
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}