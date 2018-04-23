/*
final(最终 修饰符)

final关键字的用法：
	1.final关键字修饰的一个基本类型的变量时，该变量必须被赋值，而且不能够被重新赋值
	2.final修饰引用类型变量时，这个便来给你不能指向新的变量。
	3.final修饰一个函数的时候函数不能被重写。
	4.final修饰一个类的时候，该类不能被继承。

常量的修饰符：public static final

*/
class Circle
{
	double r;

	final double pi = 3.14;
}
class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
