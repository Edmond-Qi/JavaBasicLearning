/*
算数运算符：
	运算顺序是从左到右
	+ （正数、加法、连接符）\
	连接符的作用：让任何类型的数据都可以与字符串进行拼接，连接符的结果是字符串类型的数据
	-
	*
	/ 10/3=3
	% 结果正负号取决于被除数，python是取决于除数的
	++（自增）
	前自增：先自增后使用
	后自增：先使用后自增
	--
*/
class Demo3 
{
	public static void main(String[] args) 
	{
		int a = 0;
		int sum = ++a;
		System.out.println("sum = " + sum); 
	}
}
