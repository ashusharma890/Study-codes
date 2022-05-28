package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        //your code here
        //taking Inputs
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //function called
        mergeSort(arr);
    }
    // divide the array
    static void divide(int[] arr,int si, int ei)
    {
        //si=starting index
        //ei=end index
        // mid= middle
     if(si>=ei)
     {
         return;
     }
     int mid=si+(ei-si)/2;
     divide(arr,si,mid); //recursive function for 1st half of array after division
     divide(arr,mid+1,ei); //recursive function for 2nd half of array after division
     conquer(arr,si,mid,ei); // recursive function for merging sorted sub-arrays/ sub-problems
    }
    //merge the sorted array parts 
    // or conquering it
    static void conquer(int[] arr,int si, int mid, int ei)
    {
   int[] merged= new int[ei-si+1];
   int idx1=si;
   int idx2=mid+1;
   int x=0;
   while(idx1 <= mid && idx2<=ei)
   {
       if(arr[idx1]<=arr[idx2])
       {
           merged[x++]=arr[idx1++];
       }
       else
       {
           merged[x++]=arr[idx2++];
       }
   }
   while(idx1 <= mid)
   {
       merged[x++]=arr[idx1++];
   }
   while (idx2<=ei)
   {
       merged[x++]=arr[idx2++];
   }
        for (int i = 0,j=si; i < merged.length ; i++, j++) {
            arr[j]=merged[i];
        }
    }
    //Merge sort
    static void mergeSort(int[] arr) {
        int n= arr.length;
        //recursive function called
        divide(arr,0,n-1);
        //printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
