import java.util.Scanner;

public class Book {
private int bookno;
private String booktitle;
private float price;
Scanner scan=new Scanner(System.in);
private float totalCost(int n)
{
	return price*n;
}
public void Input()
{
	System.out.println("enter book number");
	bookno=scan.nextInt();
	scan.nextLine();
	System.out.println("enter book title");
	booktitle=scan.nextLine();
	System.out.println("enter price of book");
	price=scan.nextInt();
}
public void Purchase()
{
	System.out.println("enter no of copies");
	int n=scan.nextInt();
	System.out.println("total cost"+totalCost(n));
	
	
}
	public static void main(String[] args) {
	
Book b=new Book();
b.Input();
b.Purchase();

	}

}
