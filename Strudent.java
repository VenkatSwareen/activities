import java.util.Scanner;
public class Strudent {
	private int admno;
	private String name;
	private float eng,math,sci,total;
	Scanner scan=new Scanner(System.in);
	private float ctotal()
	{
		
		return eng+math+sci;
	}
	public void Takedata()
	{
		System.out.println("enter admission number");
		admno=scan.nextInt();
		scan.nextLine();
		System.out.println("enter name");
		name=scan.nextLine();
		System.out.println("enter marks in english maths and science");
		eng=scan.nextFloat();
		math=scan.nextFloat();
	    sci=scan.nextFloat();
		total=ctotal();
	}
	public void Showdata()
	{
		System.out.println("admission number "+admno);
		System.out.println("name "+name);
		System.out.println("total "+total);
	}
public static void main(String[] args) {
	Strudent s=new Strudent();
	s.Takedata();
	s.Showdata();
}
}
