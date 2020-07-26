import java.util.Scanner;

public class Batsman {
private int bcode,innings,notout,runs;
private String bname;
Scanner scan=new Scanner(System.in);
private float calavg()
{
	return runs/(innings-notout);
}
public void readData()
{
	System.out.println("enter batsman name");
	bname=scan.nextLine();
	System.out.println("enter batsman code innings notout runs");
	bcode=scan.nextInt();
	innings=scan.nextInt();
    notout=scan.nextInt();
	runs=scan.nextInt();
	}
public void displayData()
{
	System.out.println("innings "+innings);
	System.out.println("runs "+runs);
	System.out.println("notouts "+notout);
	System.out.println("name "+bname);
	System.out.println("batting average "+calavg());
}

	public static void main(String[] args) {
	Batsman b=new Batsman();
	
	b.readData();
	b.displayData();

	}

}
