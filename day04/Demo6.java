/*
需求：猜数字

使用随机数的技巧：
	1.创建一个随机数对象
	2.调用随机数对象的nextInt方法
	3.导包
*/

import java.util.*;
class Demo6
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int num = rand.nextInt(11);
		System.out.println(num);
	}
}
