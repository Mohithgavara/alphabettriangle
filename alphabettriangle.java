import java.util.*;
class alphabettriangle
{
public static void main(String args[])
{
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.print("enter the value of n");
n=sc.nextInt();
char ch='A';
for(i=1;i<=n;i++)
{
for(j=1;j<i+1;j++)
{
System.out.print(" "+(ch ++) + " ");
}
System.out.println();
}
}
}