import java.io.*;
class A
{
public static void main(String args[]) throws Exception
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);

System.out.println("enter any  number");
String str=br.readLine();
int b=Integer.parseInt(str);

if(b%2==0)
{
System.out.println("given no is even number");
}else {

System.out.println("given no is odd number");
}
}
}
