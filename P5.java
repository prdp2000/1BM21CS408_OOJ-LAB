import java.util.Scanner;

class Account
{
int min=500;
String name;
int Accnum;
float Amt;
Scanner sc=new Scanner(System.in);
public void get_details()
{
System.out.println("Enter Name:");
name=sc.nextLine();
System.out.println("Enter Account Number:");
Accnum=sc.nextInt();
System.out.println("Enter your Initial Amount(>500RS):");
Amt=sc.nextFloat();
}
void Display()
{
	System.out.println("Name:"+name);
	System.out.println("Account_number:"+Accnum);
	System.out.println("Amount:"+Amt);
}
}


class Current extends Account
{
float deposit,withdraw,penality,pen;
void deposit()
{
System.out.println("Enter Amount to deposit") ;
deposit =sc.nextFloat();
Display();
Amt=Amt+deposit;
System.out.println("Total Amount After deposit is :"+Amt) ;
}
void check_Bal()
{
if(Amt<min)
{
	pen=(Amt*2)/100;
Amt=Amt-pen;
System.out.println("Amount Should be >500 : "+Amt);
}

}
void withdraw_Bal()
{
System.out.println("Enter Amount to withdraw");
withdraw=sc.nextFloat();
Display();
if(withdraw<Amt)
{
Amt=Amt-withdraw;
System.out.println("After Withdrawl Balance "+Amt);
}
else
{
System.out.println("Insufficent Balance cannot be less than 500");
}
check_Bal();
}
}

class Saving extends Account
{
float deposit,withdraw,intr;
public void deposit()
{
System.out.println("Enter Amount to deposit") ;
deposit =sc.nextFloat();
Display();
Amt=Amt+deposit;
System.out.println("Total Amount is :"+Amt) ;
}
public void Add_intrest()
{
intr=(Amt*2)/100;
Amt=Amt+intr;
System.out.println("Total Amount with intrest is :"+Amt) ;
}
public void withdraw_Bal()
{
System.out.println("Enter Amount to withdraw:");
withdraw=sc.nextFloat();
Display();
if(withdraw<Amt)
{
Amt=Amt-withdraw;
System.out.println("After Withdawl Balance: "+Amt);
}
else
{
System.out.println("Insufficent Balance!");
}
}
}
public class P5
{
public static void main(String[] args)
{
int count=0,ch;
Scanner sc=new Scanner(System.in);
Current cu=new Current ();
Saving sav=new Saving ();
System.out.println("Choose Account type:");
System.out.println("Press 1 for Current Account:");
System.out.println("Press 2 for Saving Account:");
ch=sc.nextInt();
if(ch==1)
{
cu.get_details();
cu.check_Bal();
while(count!=4)
{
System.out.println("1.Display\n2.Deposit\n3.Withdraw\n4.Penalty\n5.Exit");
System.out.println("Enter Your Coice");
int cho=sc.nextInt();
switch(cho)
{
case 1: cu.Display();
break;
case 2: cu.deposit();
break;
case 3: cu.withdraw_Bal();
break;
case 4: cu.check_Bal();
break;
case 5: System.exit(0);
break;
default:System.out.println("Wrong Choce!");
}
}
}
else if(ch==2)
{
sav.get_details();
while(count!=5)
{
System.out.println("1.Display\n2.Deposit\n3.Withdraw\n4Intrest\n5.Exit");
System.out.println("Enter Your Coice");
int cho=sc.nextInt();
switch(cho)
{
case 1: sav.Display();
break;
case 2: sav.deposit();
break;
case 3: sav.withdraw_Bal();
break;
case 4: sav.Add_intrest();
break;
case 5: System.exit(0);
break;
default:System.out.println("Wrong Choce!");
}
}
}
else
{
System.out.println("Wrong choice!");
}
}
}