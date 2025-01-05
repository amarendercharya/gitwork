import java.util.function.Predicate;
import java.util.*;

class Otp
{
public static void main(String args[])
{
Supplier<String> s=()->{
String otp="";
for(int i=0;i<=6;i++)
{
otp=otp+(int)(math.random()*10);
}
otp
};
System.out.println(s.get());
}
}