/* THIS PROGRAM GENERATES ALL PRIMES IN A GIVEN RANGE
 EXAMPLE:---
 IF N=5
 OUTPUT:-
 2 3 5

 CALCULATES IN O(n log(log n)) TIME

 PS: CAN BE USED IN PRIME FACTORS CALCULATION
 */


import java.util.*;
class Sieve_of_Erathosenes {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number");
		int m=sc.nextInt();
		boolean a[]=new boolean[m+1];
		for(int i=2;i<=m;i++)
		{
		    for(int j=2;j*i<=m;j++)
		    {
		        a[j*i]=true;
		    }
		}

		for(int i=2;i<=m;i++)
		{
		    if(a[i]==false)
		    System.out.print(i+" ");
		}

		System.out.println();
	}

}
