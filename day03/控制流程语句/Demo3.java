/*
需求：键盘录入一个分数，根据分数输出一个对应的等级。
比如：100-90 A等级

接收键盘录入数据的步骤：
	1.创建一个扫描器对象
	2.调用扫描器对象的nextInt方法扫描数据。
	3.导入包
*/
import java.util.*;
class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入一个分数：");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("录入的数据是："+num);

	}
}
