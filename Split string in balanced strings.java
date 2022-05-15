//bit-slower approach

class Solution {
    public int balancedStringSplit(String s) {
              int Rcount =0;
        int Lcount =0;
        int count =0;
        
        for(int i =0; i< s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='R')
            {
                Rcount++;
            }
            if(c=='L')
            {
                Lcount++;
            }
            
            if(Rcount== Lcount)
            {
                count++;
            }
        }
        return count;  
    }
}

//faster approach

class Solution {
    public int balancedStringSplit(String s) {
              int Rcount =0;
        int Lcount =0;
        int count =0;
        
        for(int i =0; i< s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='R')
            {
                ++Rcount;
            }
            if(c=='L')
            {
                ++Lcount;
            }
            
            if(Rcount== Lcount)
            {
                ++count;
            }
        }
        return count;  
    }
}

