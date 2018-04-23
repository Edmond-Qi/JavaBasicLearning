/*
猜数字游戏
*/
import java.util.*;
class Demo8 
{
	public static void main(String[] args) 
	{
		//创建一个随机数对象
		System.out.println("猜数字游戏开始！");
		Random rand = new Random();
		int num1 = rand.nextInt(10) + 1;
		while (true)
		{
			System.out.println("请输入你要猜的数字：");
			Scanner scanner = new Scanner(System.in);
			int num2 = scanner.nextInt();
			if (num1 < num2)
			{
				System.out.println("猜大了！");
			}
			else if (num1 > num2)
			{
				System.out.println("猜小了！");
			}
			else
			{
				System.out.println("恭喜！猜对了，游戏结束！");
				break;
			}
		}
	}
}
