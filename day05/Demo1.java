/*
函数的特点是：
	1.把一个功能的代码 封装起来以达到提高代码复用性
	2.函数定义好之后，需要调用才能执行
	3.如果一个函数没有返回值类型，那么就是用void关键字表示。

*空类型的函数也可以有return，但是不能有返回值。
*函数的重载：多个函数同名，函数调用时根据参数类型和个数去寻找
函数重载的要求：
	1.函数名一致
	2.形参列表不一致。（形式参数的个数或者对应的数据类型不一致）
	3.与返回值的类型无关。

*/
class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	public static String greade(int num){
		String level = "";
		if (num >=60)
		{
			level = "及格了"
		}
		else 
		{
			level = "未及格"
		}
		return level
	}

}
