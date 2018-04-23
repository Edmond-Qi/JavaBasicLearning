import java.util.*;

class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入一个分数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();		
		if ((num>=0) && (num<60))
		{
			System.out.println("等级是D");
		}
		else if ((num>=60) && (num<75))
		{
			System.out.println("等级是C");
		}
		else if ((num>=75) && (num<90))
		{
			System.out.println("等级是B");
		}
		else if ((num>=90) && (num<=100))
		{
			System.out.println("等级是A");
		}
		else{
			System.out.println("您输入的分数不存在，请检查后重新输入！");
			}
	}
}