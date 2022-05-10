
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
     Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr= new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      duplicate(arr);
	}
  static void duplicate(int[] arr)
  {
    ArrayList<Integer> list= new ArrayList<>();
    int n=arr.length;
    int repeat=-1;
    Arrays.sort(arr);
    for(int i=0;i<n-1;i++)
      {
       if(arr[i]==arr[i+1]&&arr[i]!=repeat&&arr[i]!=-1)
       {
         repeat=arr[i+1];
         arr[i+1]=-1;
         list.add(arr[i]);
       }  
      }
    if(list.size()==0)
      System.out.print("0");
    else{
    for(int i=0;i<list.size();i++)
    System.out.print(list.get(i)+" ");
    }
}
}


