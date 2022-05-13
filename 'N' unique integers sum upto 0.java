
class Solution {
    public int[] sumZero(int n) {
      int arr[]=new int[n];
        if(n%2!=0)
        {
            int j=0;
            for(int i=-n/2;i<=n/2;i++)
                arr[j++]=i;
        }
        else
        {
            int j=0;
            for(int i=-n/2;i<=n/2;i++)
                if(i!=0)
                    arr[j++]=i;
        }
        return arr;  
    }
}

