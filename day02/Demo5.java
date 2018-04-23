/**
变量：变量就是在程序运行过程中值可以发生变化的量，是数据存储的容器

容器的特点：
	1.容量（大小）
	2.存储的数据格式
	3.名字

声明（定义）一个变量的格式
	容量 变量名字 = 数据（包含类型）

命名规范：
	小驼峰命名

java中的八种基本数据类型：
	整数：
		1.tyep 8bit -128~127
		2.short 16bit 
		3.int 32bit 默认是int
		4.long 64it L
	小数：
		1.double 64bit 默认是double类型
		2.float 32bit f
	布尔类型：boolean
		如果使用boolean声明一个基本的类型的变量时，那么该变量占4个字节
		如果使用boolean声明一个数组类型的变量时，那么该数组的每个元素占一个字节
·	字符类型：
		char 2个字节
		
	
*/
class Demo5 
{
	public static void main(String[] args) 
	{	
		//需求：定义一个变量存储一个正常人的年龄
		byte age = 120; //声明了一个byte类型的变量，该变量的名字叫age
		age = 100;
		System.out.println(age);
		//需求2：定义一个变量存储老师的零用钱
		short money  = 128;
		
		//需求3：定义ige变量存储老黎的钱。
		int bossMoney = 1000000000;

		//需求4：定义一个和变量存储周小川的
		long allMoney = 1000000000000000000L;
		
		//
		float pi = 3.14f;
		
		boolean b = false;

		char c = 'a';

		System.out.println(c);
		


	}
}
