// slower brute force approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr= new int[2];
        for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                   if(nums[i]+nums[j]==target)
                   {
                       arr[0]=i;
                       arr[1]=j;
                   }
                }    
                }
        return arr;
        }
    }


//hashmap approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] arr= new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //check for target-nums[i] in hashmap
            if(hm.containsKey(target-nums[i]))
            {
                arr[0]=hm.get(target-nums[i]);
                arr[1]=i;
                return arr;
            }
            hm.put(nums[i],i);
            }
        return arr;
        }
    }



