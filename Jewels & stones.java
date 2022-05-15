//slow but easy approach

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++)
        {
            if(jewels.contains(stones.charAt(i)+""))
                    count++;
        }
        return count;
    }
}

//faster approach

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         int ct = 0;
        for(char c: stones.toCharArray()) {
            if(jewels.indexOf(c) != -1) {
                ct++;
            }
        }
        return ct;
    }
}

