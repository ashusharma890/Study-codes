 // slower approach

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0, sum=0;
        while(i<nums.length){
        sum=sum+nums[i];
            i=i+2;
    }
        return sum;
    }
}

//faster approach

import java.util.*;
class Solution {
public int arrayPairSum(int[] nums) {
int sum = 0;
Arrays.sort(nums);
for(int i = nums.length - 1; i >= 0; i--){
if(i - 1 >= 0){
sum += Math.min(nums[i], nums[i-1]);
i--;
}
}
return sum;
}
}

