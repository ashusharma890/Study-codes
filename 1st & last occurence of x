

class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
         ArrayList<Long> out = new ArrayList<>();
       out.add((long)-1);
       out.add((long)-1);
       int  flag=1;
       for(int i=0;i<n;i++)
       {
           if(arr[i]==x&&flag!=0)
           {
               flag=0;
               out.add(0,(long)i);
           }
            if(arr[i]==x)
           {
               out.add(1,(long)i);
           }
       }
       return out;
    }
}


