/*
This program finds the maximum subarray sum for any given array
Also prints the subarray

Example:

-1 -2 1 2 3 4 -5 -6 -7 -1

It prints :
10  (1+2+3+4)

and shows 1,2,3,4

*/


import java.io.*;
import java.util.*;

class Largest_sum_subarray{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    int n=Integer.parseInt(br.readLine());

    int arr[]=new int[n];

    for(int i=0;i<n;i++)
    {
      arr[i]=Integer.parseInt(br.readLine());
    }

    System.out.println(subarr(arr));

  }

  public static int subarr(int a[])
  {
    int arr[]=new int[a.length];
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
      sum+=a[i];
      arr[i]=sum;
      System.out.print(arr[i]+" ");
    }


    int max=-9999;
    int start_i=0;
    int end_i=0;

    for(int i=0;i<a.length;i++)
    {
      if(max<arr[i])
      max=arr[i];
    }
    System.out.println(max);

    for(int i=1;i<a.length;i++)
    {
      for(int j=i;j<a.length;j++)
      {
        if((arr[j]-arr[i-1])>max){
        max=arr[j]-arr[i-1];
        start_i=i;
        end_i=j;
      }
      }
    }

    for(int i=start_i;i<=end_i;i++)
    {
      System.out.print(a[i]+" ,");
    }

    System.out.println();

    return max;


  }

}
