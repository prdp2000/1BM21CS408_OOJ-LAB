package SEE;
import CIE.*;
import java.util.*;

public class Externals extends CIE.Student {
	Scanner s = new Scanner(System.in);
	public int seem[] = new int[5];
	
	public void accept() {
		for(int i=0;i<5;i++)
		{
			System.out.println("enter SEE amrks:"+(i+1));
			seem[i] = s.nextInt();
		}
	}
}