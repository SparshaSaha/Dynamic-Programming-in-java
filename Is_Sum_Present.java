/*
DESCRIPTION::--
This program finds if a particular sum can be formed by the given elements in an array
where repetation of elements is allowed

*/

import java.util.*;
class Is_Sum_Present
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements in array");
    int n=sc.nextInt();

    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter sum to find");
    int x=get_if_present(a,sc.nextInt());
    if(x==0)
    System.out.println("Not present");
    else
    System.out.println("Present");


  }

  public static int get_if_present(int a[],int n)
  {
    int sum[]=new int[n+1];
    sum[0]=1;

    for(int i=1;i<sum.length;i++)
    {
      for(int j=0;j<a.length;j++)
      {
          if(i-a[j]>=0 && sum[i-a[j]]==1){
          sum[i]=1;
          break;
        }
      }
    }


    return sum[sum.length-1];
  }

}
