

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean flag= false;
        String res1="";
        String res2="";
       for(String s1 : word1)
       {
           for(int i=0;i<s1.length();i++)
           {
               res1+=s1.charAt(i);
           }
        }
        for(String s2 : word2)
        {
            for(int j=0;j<s2.length();j++)
            {
                res2+=s2.charAt(j);
            }
        }
        for (int i = 0; i < res1.length(); i++) {
            for (int j = 0; j < res2.length(); j++) {
            if(res1.charAt(i) == res2.charAt(j))
                 flag= true;
            else
                flag=false;
            }
        }
        if(flag==true)
            return true;
         return false;
    }
}


// optimal solution

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1="";
        String res2="";
        for(int i=0;i<word1.length;i++)
           {
               res1+=word1[i]+"";
           }
         for(int j=0;j<word2.length;j++)
            {
                res2+=word2[j]+"";
            }
       return res1.equals(res2); 
    }
}


