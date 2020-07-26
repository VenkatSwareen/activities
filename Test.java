import java.util.Scanner;

public class Test {
private String testcode,description;
private int centersreq,nocandidate;
Scanner scan=new Scanner(System.in);
private int Calntr()
{
	return (nocandidate/100)+1;
}
public void Schedule()
{
	System.out.println("enter testcode,description");
	testcode=scan.nextLine();
	description=scan.nextLine();
	System.out.println("enter no of candidates");
	nocandidate=scan.nextInt();
	centersreq=Calntr();
}
public void Disptest()
{
	System.out.println("testcode "+testcode);
	System.out.println("description "+description);
	System.out.println("candidate number "+nocandidate);
	System.out.println("centers required "+centersreq);
}
	public static void main(String[] args) {
		Test t=new Test();
		t.Schedule();
		t.Disptest();
	}

}
