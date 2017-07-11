# Prime
import java.util.*;
import java.io.*;
public class Prime
{
  public static void main(String args[])
  {
    int a=0; 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=2;i<n;i++)
    {
      if(n%i==0)
      {
        a++;
      }
    }
      if(a>0)
      {
        System.out.println("The given number is not a Prime Number");
      }
      else
      System.out.println("The given number is a Prime Number");  
      }
  
}
