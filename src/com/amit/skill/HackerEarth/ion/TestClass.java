package com.amit.skill.HackerEarth.ion;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by amit on 13/12/16.
 */
public class TestClass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

/*        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int []arr2=sort(arr);

        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }*/

        sortq(arr,0,n-1);

        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int [] sort(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(abs(arr[j])>abs(arr[j+1])){
                //if (arr[j]>arr[j+1]){
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        return arr;
    }
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<=high-1; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            //if (arr[j] <= pivot)
            if (abs(arr[j]) <= abs(pivot))
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    public static  void sortq(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sortq(arr, low, pi-1);
            sortq(arr, pi+1, high);
        }
    }
}
