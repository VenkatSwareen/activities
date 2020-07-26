import java.util.Scanner;

public class Report {
private int adno;
private String name;
private float avg,total;
float[] marks=new float[5];
Scanner scan=new Scanner(System.in);
private void getAvg()
{
	avg=total/5;
}
public void readInfo()
{
	System.out.println("enter admo");
	adno=scan.nextInt();
	scan.nextLine();
	System.out.println("enter name");
	name=scan.nextLine();
System.out.println("enter 5 subjects marks");
	for(int i=0;i<marks.length;i++)
	{
		marks[i]=scan.nextInt();
		total=total+marks[i];
	}
	getAvg();
}
public void displayINFO()
{
	System.out.println("admission number "+adno+"name "+"\nname"+name);
	for(int i=0;i<marks.length;i++)
	{
		System.out.println("subject "+i+" marks "+marks[i]);
	}
	System.out.println("average "+avg);
}
public void displayInfo()
{
	System.out.println("admission number");
}
	public static void main(String[] args) {
		Report r=new Report();
		r.readInfo();
		r.displayINFO();
	}

}
