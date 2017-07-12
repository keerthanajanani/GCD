# GCD
import java.io.*;
import java.util.*;
public class GCD
{
public static void main(String args[])throws IOException
{
int a,b,gcd,temp1,temp2;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number:");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second number:");
b=Integer.parseInt(br.readLine());
temp1=a;
temp2=b;
while(true)
{
if(a>b)
{
gcd=b;
break;
}
else
{
a=a%b;
}
}
else
{
if(b%a==0)
{
gcd=a;
break;
}
else
{
b=b%a;
}
}
System.out.println("GCD of "+temp1+" and "+temp2+" = "+gcd);
}
}
