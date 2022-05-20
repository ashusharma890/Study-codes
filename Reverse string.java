// brute approach

class Solution {
    public void reverseString(char[] s) {
  int i=0,right=s.length-1;
       for(;i<=right;i++,right--){
           char t=s[i];
           s[i]=s[right];
           s[right]=t;
       }
    }
}

//2-pointer approach

class Solution {
    public void reverseString(char[] s) {
int l = 0;
    
    int r = s.length-1;
    while(l<r){
       char temp = s[l];
        s[l]  = s[r];
        s[r] = temp;
        l++;
        r--;
    }
}
}

