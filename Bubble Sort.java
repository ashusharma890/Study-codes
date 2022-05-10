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
        bubbleSort(arr);
    }
    //bubble sort
    static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
