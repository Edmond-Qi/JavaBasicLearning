/*
位运算符：
	用于逻辑表达式是逻辑运算符
	用于int类型时，它是位运算符
	&
	|
	^
	~
	
*/
class Demo9 
{
	public static void main(String[] args) 
	{
		/*
		第一种方式：
		加入中间变量

		第二种方式：相加或者相减可能会导致数据超出int的表示范围
		a = a + b;
		b = a - b;
		a = a - b;

		第三种方式:  逻辑不清晰
		a = a^b;
		b = a^b;
		a = a^b;
		*/
		System.out.println("Hello World!");
	}
}
