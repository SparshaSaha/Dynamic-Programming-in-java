/* GIVEN A ROD OF LENGTH n AND AN ARRAY CONTAINING COST OF EACH LENGTH.......fIND THE MAXIMUM COST THAT CAN BE OBTAINED BY CUTTING THE ROD

EXAMPLE:
LENGTH=8
COSTS:
1 5 8 9 10 17 17 20

SO WE CAN GET MAXIMUM BY CUTTING THE ROD TO LENGTH OF 6 AND 2 = 17+5 = 22

THUS IT PRINTS 22
AND ALSO PRINTS THE SEQUENCE OF CUTS
I.E, 6,2
*/


import java.util.*;
class Rod_cutting
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of rod");
    int n=sc.nextInt();
    int a[]=new int[n+1];

    System.out.println("Enter costs");
    for(int i=1;i<=n;i++)
    {
      a[i]=sc.nextInt();
    }

    int dyn[]=new int[n+1];
    String mem[]=new String[n+1];
    mem[0]="";


    for(int i=1;i<=n;i++)
    {
      int max=0;
      String x="";
      for(int j=0;j<=i;j++)
      {
        int z=a[j]+dyn[i-j];
        if(z>max)
        {
          max=z;
          x=mem[i-j]+","+j;
        }

      }
      dyn[i]=max;
      mem[i]=x;
    }

    System.out.println("Maximum sum is: "+dyn[n]);
    System.out.println("Selected Lengths are: "+mem[n].substring(1));


  }
}
