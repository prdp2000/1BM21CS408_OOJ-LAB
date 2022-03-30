package CIE;
import java.util.*;

public class Internals extends CIE.Student {
	Scanner s = new Scanner(System.in);
	public int item[] = new int[5];
	
	public void accept() {
		for(int i=0;i<5;i++)
		{
			System.out.println("enter CIE amrks:"+(i+1));
			item[i] = s.nextInt();
		}
	}
}