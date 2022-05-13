// slow but easy approach
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;String res="";
      for(String s : words)  
      {
          if(s.length()>=pref.length())
          {
          if(s.substring(0,pref.length()).matches(pref))
          {
             count++;
          }
          }
      }
        return count;
    }
}

//faster approach

class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int count =0;
           for (int i=0;i<words.length;i++)
            {
                if (words[i].startsWith(pref))
                {
                    count++;
                }
            }
        return count;
    }
}


// index of approach

class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int ans = 0;
        for(String word : words) {
            if(word.indexOf(pref)==0) ans+=1;
        }
        return ans;
    }
}


