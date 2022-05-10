import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        swapArray(arr,k);
    }

    static void swapArray(int[] arr, int k) {
        int n=arr.length;
        int[] tar= new int[n];
        for (int i = 0; i < n; i++) {
            tar[i]=arr[i];
        }
        Arrays.sort(arr);
        for (int i = n-k; i<k; ++i) {
            if (arr[i] != tar[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
