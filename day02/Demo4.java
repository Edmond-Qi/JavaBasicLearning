/*
软件 = 数据 + 指令 + 文档

常量：常量就是程序运行过程中其值不能发生改变的量

常量的类别：
	整数常量：10 12
	小数常量：3.14
	布尔常量；布尔常量只有两个值：true(正确) false(错误)
	字符常量：字符常量就是单个字符使用单引号引起来的内容
	字符串常量：用双引号引起来的内容

*/
class Demo4 
{
	public static void main(String[] args) 
	{
		/*
		System.out.println(12); //整数常量
		System.out.println(3.14); //小数常量
		System.out.println(false); //布尔常量
		System.out.println('1'); //字符常量
		System.out.println("hello world!"); //字符串常量
		*/
		/*一个数据没有加上任何标识之前，默认就是十进制的数据*/
		System.out.println(12);
		System.out.println(0b10); //二进制
		System.out.println(012); //八进制
		System.out.println(0x12); //十六进制
	}
}
