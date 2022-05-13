// using string -array approach

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        String[] str=Arrays.toString(nums).split("[\\[\\]]")[1].split(", ");
        for(String s :str)
        {
           if(s.length() % 2 == 0)
               count++;
        }
        return count;
    }
}


// using no string approach

class Solution {
    public int findNumbers(int[] nums) {
        
        int ans = 0;
        
        for(int num: nums) {
            
            int digits = 0;
            
            while(num>0) {
                num /= 10;
                digits += 1;
            }
            
            if(digits%2==0) {
                ans += 1;
            }
            
        }
        return ans;
    }
}

