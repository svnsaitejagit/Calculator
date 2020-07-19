import java.util.Scanner;

class Addition
{
	public void operation(double num1,double num2)
	{
	System.out.println((num1+num2));
	}
}

class Subtraction
{
	public void operation(double num1,double num2)
	{
	System.out.println((num1-num2));
	}
}


class Multiplication
{
	public void operation(double num1,double num2)
	{
	System.out.println((num1*num2));
	}
}

class Division
{
	public void operation(double num1,double num2)
	{
	System.out.println((num1/num2));
	}
}
class ModuloDivision
{
	public void operation(double num1,double num2)
	{
	System.out.println((num1%num2));
	}
}
class Calculator
{
	public static void main(String arg[])
	{

	Addition a=new Addition();
	Subtraction s=new Subtraction();
	Multiplication m=new Multiplication();
	Division d=new Division();
	ModuloDivision md=new ModuloDivision();
	System.out.println("########       MENU      ########");
	
	System.out.println("1: ADDITION\n2: SUBTRACTION\n3: MULTIPLICATION\n4: DIVISION\n5:MODULO DIVISION");
	
	Scanner sc=new Scanner(System.in);
	int ch;
	do
	{
	System.out.println("Enter any two numbers:");
	double number1=sc.nextDouble();
	double number2=sc.nextDouble();

	System.out.println("Choose your operations:");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		a.operation(number1,number2);
		break;
	case 2:
		s.operation(number1,number2);
		break;
	case 3:
		m.operation(number1,number2);
		break;
	case 4:
		d.operation(number1,number2);
		break;
	case 5:
		md.operation(number1,number2);
		break;
	}
	}while(ch!=1);
	}
}
