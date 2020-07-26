import java.util.Scanner;

public class Flight {
private int flightno;
private String destination;
private float distance,fuel;
Scanner scan=new Scanner(System.in);

private void calFuel()
{
	if(distance<=1000)
		fuel=500;
	else if(distance>1000&&distance<=2000)
		fuel=1100;
	else
		fuel=2200;
}
public void feedInfo()
{
	System.out.println("enter flight number");
	flightno=scan.nextInt();
	scan.nextLine();
	System.out.println("enter destination");
	destination=scan.nextLine();
	System.out.println("enter distance");
	distance=scan.nextFloat();
	calFuel();
}
public void showInfo()
{
	System.out.println("flightnumber "+flightno+"\ndestination "+destination+"\ndistance "+distance+"\nfuel "+fuel);
}
	public static void main(String[] args) {
		Flight f=new Flight();
		f.feedInfo();
		f.showInfo();

	}

}
