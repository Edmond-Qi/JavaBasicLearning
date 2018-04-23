/*
数组时存储同一种数据类型的数据的集合容器。

数组的定义格式：
	数据类型[] 变量名 = new 数据类型[长度]

分析数组：
	左边：int[] arr 声明了一个Int

局部变量：定义在函数或者方法内部的变量

成员变量：定义在方法之外的变量

Java管理这两种内存：栈内存和堆内存

	栈内存：占内存存储的都是局部变量，变量一旦出了自己的
	作用域会马上消失
	堆内存存储的都是对象数据

*/
class Demo4 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[50];
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 50;
		arr[3] = 90;
		System.out.println("Hello World!");
	}
}
