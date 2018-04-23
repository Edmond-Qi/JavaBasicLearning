/*
如果符合条件
if语句的判断条件后不能添加分号，否则会影响到执行的效率

*/
class Demo2 
{
	public static void main(String[] args) 
	{
		int num = 1;
		if (num == 1)
		{
			System.out.println("星期1");
		}
		else if (num == 2)
		{
			System.out.println("星期2");
		}
		else if (num == 3)
		{
			System.out.println("星期3");
		}
		else if (num == 4)
		{
			System.out.println("星期4");
		}
		else if (num == 5)
		{
			System.out.println("星期5");
		}
		else if (num == 6)
		{
			System.out.println("星期6");
		}
		else{
			System.out.println("星期日");
			
		}	
	}
}
 