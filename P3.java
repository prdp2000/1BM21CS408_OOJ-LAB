import java.util.*;

public class P3

{

    public String title;

    public String author;

    public int year;   

    public int pages;

    public int price;

  /*  public P3(String title,String author,int year,int pages,int price)

    {   this.title=title;

        this.author=author;

        this.year=year;

        this.pages=pages;

        this.price=price;

    }*/
    
    void accept()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Title and Author :");
    title=sc.next();
    author=sc.next();
    System.out.println("Enter the Year:");
    year=sc.nextInt();
    System.out.println("Enter the Pages:");
    pages=sc.nextInt();
    System.out.println("Enter the Price:");
    price=sc.nextInt();
    }

   public String toString() {
	   return ("Title = "+title+"\n"+"Author = "+author+"\n"+"Year = "+year+"\n"+"Pages = "+pages+"\n"+"Price = "+price+"\n");
   }

public static void main(String args[])

{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of Books :");
	int num=sc.nextInt();
	P3 ob[]=new P3[num];
	for(int i=0;i<num;i++)
	{
	ob[i]=new P3();
	ob[i].accept();
	System.out.println(ob[i]);
	}
}

}
