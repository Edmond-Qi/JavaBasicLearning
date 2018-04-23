/*
赋值运算符：（赋值运算符是从右到左的）
	=
	+=
	-=
	*=
	/=
	%=
*/
class Demo6 
{
	public static void main(String[] args) 
	{
		byte b1 = 1;
		byte b2 = 2;
		// b2 = b2 + b1; 报错，需要强制类型转化
		b2+=b1;
		System.out.println("Hello World!");
	}
}
