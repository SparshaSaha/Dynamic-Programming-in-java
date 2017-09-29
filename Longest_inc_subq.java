/*
This prints the longest increasing subsequence

Example::--

5 4 6 7 8 2 4 19 21

Output is 6
and the longest subsequence is 4 6 7 8 19 21

*/

import java.io.*;
import java.util.*;
class Longest_inc_subq
{
  public static void main(String args[])throws IOException{

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int arr[]=getint(br.readLine().split(" "));
    int lis[]=new int[arr.length];
    int max=0;

    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<i;j++)
      {
        if(arr[j]<=arr[i])
        {
          int z=lis[j]+1;
          if(z>lis[i])
          lis[i]=z;
        }

      }

      if(lis[i]>max)
      max=lis[i];
    }


    System.out.println("The longest increqasing subsequence is of length : "+(max+1));



  }
  public static int[] getint(String ar[])
  {
    int arr[]=new int[ar.length];
    for(int i=0;i<ar.length;i++)
    {
      arr[i]=Integer.parseInt(ar[i]);
    }
    return arr;
  }
}
