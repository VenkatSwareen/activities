import java.text.NumberFormat;
import java.util.*;

public class Mortgage {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principal");
		int principal=scan.nextInt();
		scan.nextLine();
		if(principal<1000||principal>100000)
		{
			System.out.println("enter value between 1000 and 100000");
		 principal=scan.nextInt();
			scan.nextLine();
			}	
System.out.println("enter period");
byte period=scan.nextByte();
scan.nextLine();
if(period<1||period>30)
{
	System.out.println("enter value between 1 and 30");
 period=scan.nextByte();
	scan.nextLine();
	}	
int payment=period*12;
System.out.println("enter intrest");
float intrest=scan.nextFloat();
if(intrest<1||intrest>30)
{
	System.out.println("enter value between 1 and 30");
 intrest=scan.nextFloat();
	}	
float monthlyintrest=intrest/100/12;
double mortgage=principal*(monthlyintrest*Math.pow(1+monthlyintrest, payment))/
		(Math.pow(1+monthlyintrest,payment)-1);
String mortgageFormatted=NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
System.out.println(mortgageFormatted);
	}
}