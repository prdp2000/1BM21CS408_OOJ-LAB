import java.util.*;

class FatherAgeException extends Exception{
	public String toString() {
		return("Father age is less than 0");
	}
}

class SonAgeException extends Exception{
	int a;
	SonAgeException(int age){
		a = age;
	}
	public String toString() {
		if(a<0)
			return ("son age is less than 0");
		else
			return("sons age is more than fathers age");
	}
}
public class Father {
	public int age;
	Scanner scan = new Scanner(System.in);
	int age1;
	Father(){
		System.out.println("enter father age ");
		age1 = scan.nextInt();
	}
	
	void ex1() throws FatherAgeExcecption{
		if(age1<0)
			throw new FatherAgeException();
	}
	
class son extends Father{
		public int age2;
		son(){
			System.out.println("enter sons age ");
			age2 = scan.nextInt();
		}
		void ex2() throws SonAgeException{
			if(age2<0 || age2 > super age1)
				throw new SonAgeException(age2);
		}
	}
	
class P8{
	public static void main(String[] args) {
		son s = new son();{
			try {
				s.ex1();
			}
			try {
				s.ex2();
			}
			catch(SonAgeException e) {
				System.out.println(e);
			}
		}
	}
}

