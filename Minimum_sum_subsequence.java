/*
Given an array A[] of positive integers.
The task is to complete the function which returns an integer denoting the minimum sum subsequence
 from the array such that at least one value among
 all groups of four consecutive elements is picked.


Example::


Input: A[] = {1, 2, 3, 4, 5, 6, 7, 8}
Output: 6
6 is sum of output subsequence {1, 5}
Following 4 length subarrays are possible
(1, 2, 3, 4), (2, 3, 4, 5), (3, 4, 5, 6),
(4, 5, 6, 7), (5, 6, 7, 8)
Here, Our subsequence {1, 5} has an element from all
above groups of four consecutive elements.

*/



import java.util.*;

class Minimum_sum_subsequence
{
  public static int minSum(int arr[], int n)
          {
             //add code here.
             int dynamicarr[]=new int[n];

             if(n<4)
             {
                 int min=999999;
                 for(int i=0;i<n;i++)
                 {
                     if(min>arr[i])
                     min=arr[i];
                 }
                 return min;
             }


             for(int i=0;i<4;i++)
             {
                 dynamicarr[i]=arr[i];
             }
             int last_min=Math.min(Math.min(arr[0],arr[1]),Math.min(arr[2],arr[3]));
             for(int i=4;i<n;i=i+4)
             {
                 int min=999999;
                 for(int j=i;j<i+4;j++)
                 {
                     if(j>=arr.length)
                     break;
                     dynamicarr[j]=arr[j]+last_min;
                     if(min>dynamicarr[j])
                     min=dynamicarr[j];
                 }

                 last_min=min;

             }

             for(int i=0;i<n;i++)
             {
                 System.out.print(dynamicarr[i]+" ,");
             }

             return Math.min(Math.min(dynamicarr[n-1],dynamicarr[n-2]),Math.min(dynamicarr[n-3],dynamicarr[n-4]));

          }

        public static void main(String args[])
      {

        //Put your array
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(minSum(arr,8));
      }
}


//CODE BY SPARSHA SAHA
