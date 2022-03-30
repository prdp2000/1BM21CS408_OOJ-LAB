import java.util.*;

public class P2
{
String name, usn;
int n;
int marks[];
double sgpa;

void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name and usn :");
name=sc.next();
usn=sc.next();
System.out.println("Enter the number of subjects:");
n=sc.nextInt();
marks=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter marks:");
marks[i]=sc.nextInt();
}
}

void calc()
{
for(int i=0;i<n;i++)
{
sgpa=sgpa+marks[i];
}
sgpa=sgpa/n;
}

void display()
{
System.out.println("------------result------------");
System.out.println("name:\t\t"+name);
System.out.println("USN:\t\t"+usn);
System.out.print("marks:\t\t");
for(int i=0;i<n;i++)
{
System.out.print(marks[i]+" ");
}
System.out.println();
System.out.println();
System.out.println("Sgpa IS :\t"+sgpa);
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students :");
int num=sc.nextInt();
P2 ob[]=new P2[num];
for(int i=0;i<num;i++)
{
ob[i]=new P2();
ob[i].accept();
ob[i].calc();
ob[i].display();
}
}
}