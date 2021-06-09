public class ArrayLongExample
{
public static void main(String[]args)
{
int length=Integer.valueOf(arg[0]);
System.out.println(length)
 Long[] l= new Long[length];
int i=0;
for(int k=1;k<=length;k++)
{
l[i++]=Long.valueOf(arg[k]);
}
for(Long l1:l)
{
System.out.println(l1);
}
}
}
