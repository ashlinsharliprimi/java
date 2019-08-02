import java.util.Scanner;
class Number{
public static void main(String args[]){
	int p;
	Scanner Scan=new Scanner(System.in);
	System.out.println("enter the number");
	p=Scan.nextInt();
	if(p>0)
	{
		System.out.println("the number"+p+" is positive");
	}
	else if(p<0)
	{
	System.out.println("the number "+p+"is negative");
}
else 
System.out.println("the number "+p+" is '0'");
}
}
