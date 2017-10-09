/*
This program calculates the number of factors of the multiplied product of an array

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Number_of_factors
{
 public static void main (String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int max=0;
          int n=sc.nextInt();
          int prod=1;
          for(int i=0;i<n;i++)
          {
              int x=sc.nextInt();
              prod*=x;
              if(x>max)
              max=x;
          }

          ArrayList<Integer> x=seive_erathrones(max);
          int no_facs=1;
          for(int i=0;i<x.size();i++)
          {
                  int c=0;
                  int z=prod;
                 while(true)
                  {
                      if(z%x.get(i)!=0)
                      {
                          no_facs*=(c+1);
                          break;
                      }
                      z=z/x.get(i);
                      c++;
                  }

          }


          System.out.println(no_facs);
  }

  public static ArrayList<Integer> seive_erathrones(int m)
  {
     boolean a[]=new boolean[m+1];
     ArrayList<Integer> s=new ArrayList<Integer>();
   for(int i=2;i<=m;i++)
   {
       if(a[i]==false){
           s.add(i);
       for(int j=2;j*i<=m;j++)
       {
           a[j*i]=true;
       }
      }
   }
   return s;
  }
}
