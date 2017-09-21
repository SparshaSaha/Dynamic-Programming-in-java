import java.io.*;
class Longest_substr
{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a String");
    String str1=br.readLine();
    System.out.println("Enter a String");
    String str2=br.readLine();
    System.out.println("The length of longest common substring is"+calc(str1,str2));


  }

  public static int calc(String s1,String s2)
  {
    int n=s1.length();
    int m=s2.length();
    int max=0;

    int arr[][]=new int[n+1][m+1];

    for(int i=0;i<=n;i++)
    {
      for(int j=0;j<=m;j++)
      {
        if(i==0||j==0)
        arr[i][j]=0;
        else{

        if(s1.charAt(i-1)==s2.charAt(j-1))
        arr[i][j]=arr[i-1][j-1]+1;

        if(arr[i][j]>max)
        max=arr[i][j];
      }
      }
    }

    return max;

  }
}
