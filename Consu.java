import java.util.function.Function;
import java.util.*;

class Consu
{
public static void main(String args[])
{
Function<String,Integer> f=(name)->name.length();
System.out.println(f.apply("amar"));
} 

}