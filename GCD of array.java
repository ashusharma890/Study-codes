
class Solution {
    public int findGCD(int[] nums) {
             int max = 0;
        int min = 1001;
    
        // Find the min and max from array
        for(int e : nums){
            max = Math.max(max,e);
            min = Math.min(min,e);
        }
        return gcd(min, max);
    }
	
	private int gcd(int a, int b) {
        while(b != 0) {  
            if(a > b) a = a - b;  
            else b = b - a;  
        }  
        return a; 

    }
}

//another approach

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
       Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(gcd(a, b));
    }
    public static int gcd(int a, int b){
        int big = Math.max(a, b);
        int sml = Math.min(a, b);

        //base condition
        if(big%sml==0){
            return sml;
        }

        //recusive condition -> eucledian algorithm
        big = big-sml;
        return gcd(big, sml);
    }

}


