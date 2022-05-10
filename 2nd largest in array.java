
class Solution
{ 
    public static int print2largest(int A[],int N) 
    {
        //CODE HERE
    Arrays.sort(A);
       int ans=-1;
       for(int i=N-1;i>0;i--)
       {
           if(A[i]!=A[i-1])
           {
               ans=A[i-1];
               break;
           }
       }
       return ans;
    }
}



