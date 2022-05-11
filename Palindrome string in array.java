
class Solution {
    public String firstPalindrome(String[] words) {
        String res="";
        for(String s : words)
        {
            if(isPalindrome(s))
            {
             res=s; 
            break;
            }
        }
        return res;
    }
  static boolean isPalindrome(String s)
  {
      boolean flag=false;
      int i=0;
      int j=s.length()-1;
      if(s.length()==1)
          flag=true;
      while(i<j)
      {
        if(s.charAt(i)==s.charAt(j))
        {
            flag=true;
            i++;
            j--;
        }
          else
          {
              flag=false;
              break;
          }
      }
      return flag;
  }
}


