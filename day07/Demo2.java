/*
构造函数：给对应的对象进行初始化。

构造函数的定义格式：
	
	修饰符 函数名（形式参数）{
		函数体
	}
构造函数：
	1.没有返回值类型
	2.函数名与类名一致。
	3.自动被jvm调用
	4.没有构造函数，Java编译器会且该类自动添加一个
*/
class Baby
{
	int id;

	String name;

	public Baby(int i, String n){
		id = i;
		name = n;
	}

	public Baby(){}

	public void cry(){
		System.out.println("哇哇哭。。。");
	}
}
class Demo2 
{
	public static void main(String[] args) 
	{
		Baby b = new Baby();
		System.out.println("Hello World!");
	}
}
