/*
3.帮persion类添加静态初始化块，将静态的属性附上默认值
*/

class Person
{
	public static String name;
	static{
		Person.name = "laowang";
	}
}
class Demo5
{
	public static void main(String[] args) 
	{
		System.out.println(Person.name);
		System.out.println("Hello World!");
	}
}
