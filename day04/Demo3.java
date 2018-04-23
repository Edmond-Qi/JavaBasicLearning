/*
需求：月份季节对应
*/
import java.util.*;

class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入月份");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num)
		{
		case 2:
		case 3:
		case 4:
			System.out.println("这是春天！");
			break;
		case 5:
		case 6:
		case 7:
			System.out.println("这是夏天！");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("这是秋天！");
			break;
		case 11:
		case 12:
		case 1:
			System.out.println("这是冬天！");
			break;
		default:
			System.out.println("输入有误");
		}
	}
}
