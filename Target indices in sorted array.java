
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                list.add(i);
                continue;
        }
        return list;
    }
}

//faster approach

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int countLower = 0, countTarget = 0;

        for (int num : nums) {
            if (num == target) {
                countTarget++;
            } else if (num < target) {
                countLower++;
            }
        }

        while (countTarget > 0) {
            result.add(countLower);
            countLower++;
            countTarget--;
        }

        return result;
    }
}



