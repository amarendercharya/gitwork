import java.io.*;
class Prime
{
public static void main(String args[]) throws Exception
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("enter any nimber");
String str=br.readLine();
int P=Integer.parseInt(str);

int count=0;
int temp==1;
for(int k=0;k<=100;k++)
{
for(int i=1;i<=P;i++)
{
if(P%i==0)
count++;
if(count==02)
{
temp=temp++;
}
}
}
if(count==2)
{
System.out.println(P+ "  given nummber is prime number");
}else{
System.out.println(P+ "  given nummber is not a prime number");
}
System.out.println("  the number of prime numbers:"+temp);

}

}

