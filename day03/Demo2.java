/*
数据类型转换：
	从小到大，没问题
	3.从大到小，可能会有精度损失，需要强制类型转换：

		小数据类型 变量名 = （小数据类型）大数据类型

	1.凡是byte\short\char数据类型的数据在运算的时候都会自动转换成int类型再运算 
	2.两个不同类型的数据类型的运算结果取决于大的数据类型

*/
class Demo2 
{
	public static void main(String[] args) 
	{
		/*
		byte b = 11; //一个字节
		short s = b; //两个字节
		int i = s; //四个字节
		long l = i; //八个字节
		System.out.println(l);
		

		int i = 1000;
		byte b = (byte)i;
		
		byte b1 = 1;
		byte b2 = 3;
		byte b3 = (byte)(b1 + b2);
		
		int i = 10;
		long l = 20;
		i = (int)(i + l);
		*/
		int i = 10;
		byte b = i;

		// 10 是一个常量，编译器在便宜的时候就能够确认常量的值了，确认10不会
		//超出范围，因此不会报错
		System.out.println(b); 
	}
}
