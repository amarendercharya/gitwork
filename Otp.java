import java.util.function.Supplier;
import java.util.*;

class Otp
{
public static void main(String args[])
{
Supplier<String> s=()->{
String otp="";
for(int i=1;i<=6;i++)
{
otp= otp+ (int) (Math.random() *10);
}
return otp;
};
System.out.println(s.get());
System.out.println();
System.out.println(s.get());
System.out.println();
System.out.println(s.get());
System.out.println();
System.out.println(s.get());
}
}