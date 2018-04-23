/*
定义计算器类
*/
class Calculator
{
	private int num1;

	private int num2;
	
	private char option;

	public void initCal(int n1, int n2, char c)
	{
		num1 = n1;
		num2 = n2;
		if (c=='+'||c=='-'||c=='*'||c=='/')
		{
			option = c;
		}
		else
		{
			option = '+';		
		}		
	}

	public void calculate()
	{
		if (option=='+')
		{
			System.out.println("计算的结果是："+(num1+num2));
		}
		else if (option=='-')
		{
			System.out.println("计算的结果是："+(num1-num2));
		}
		else if (option=='*')
		{
			System.out.println("计算的结果是："+(num1*num2));
		}
		else
		{
			System.out.println("计算的结果是："+(num1/num2));
		}
	}
}

class Demo6 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.initCal(1,2,'+');
		c.calculate();
		System.out.println("Hello World!");
	}
}
