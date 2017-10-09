/*
DESCRIPTION::--
This program prints the  possible numbers with 1 absolute difference between their digits less than a particular nunber

EXAMPLE:
20
10 12

10 and 12 are 2 numbers with absolute difference of 2 between their digits
*/



import java.util.*;
class Absolute_1_difference
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number");
    int n=sc.nextInt();

    ArrayList<Integer> a=new ArrayList<Integer>();

    for(int i=1;i<=9;i++)
    {
      a.add(i);
    }
    int sum=0;
    while(true)
    {
      int z=0;
      ArrayList<Integer> b=new ArrayList<Integer>();

      int k=a.size();

      for(int i=0;i<k;i++)
      {
          int x=a.get(i);
        //  System.out.println("Item retrieved : "+x);

          if(x%10!=9 && x%10!=0)
          {
            int tmp1=x*10+(x%10+1);
            int temp2=x*10+(x%10-1);

            if(temp2<=n)
            {
              sum++;
                b.add(temp2);
                System.out.print(temp2+" ");
              z=1;
            }

            if(tmp1<=n){
            sum++;
            b.add(tmp1);
            System.out.print(tmp1+" ");
            z=1;
          }

          }

          else if(x%10==0)
          {
            int temp=x*10+(x%10+1);
            if(temp<=n){
              z=1;
              b.add(temp);
              System.out.print(temp+" ");
              sum+=1;

            }
          }
          else if(x%10==9)
          {
            int temp=x*10+(x%10-1);
            if(temp<=n)
            {
              z=1;
              b.add(temp);
              System.out.print(temp+" ");
              sum+=1;
            }
          }
      }

      //print
      /*
      for(int i=0;i<a.size();i++)
      {
        System.out.print(a.get(i)+" ");
      }

      System.out.println();
      */


      if(z==0)
      break;

      a=b;
    }

    if(sum==0)
    System.out.println(-1);



  }
}
