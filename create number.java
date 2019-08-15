import java.util.Scanner;
class Number{
public static void main (String[] args){
int x;
Scanner Scan=new Scanner(System.in);
x=Scan.nextInt();
if(x%2==0)
{
	System.out.println("the number "+x+" is even");
}
else
{
	System.out.println("the number "+x+" is odd");
}
	}
}
