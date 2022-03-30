package CIE;
import java.util.Scanner;

public class Student {
	Scanner s = new Scanner(System.in);
	public String usn,name;
	public int sem;
	
	public void accept() {
		System.out.println("enter usn:");
		usn = s.nextLine();
		System.out.println("enter name:");
		name = s.nextLine();
		System.out.println("enter sem:");
		sem = s.nextInt();
	}
	
	public void display() {
		System.out.println("Name :"+name+"\n"+"usn"+usn+"\n"+"sem"+sem);
	}
}