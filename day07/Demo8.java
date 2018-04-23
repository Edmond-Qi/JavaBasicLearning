/*
6.写一个father 类，和son类，这个son类是继承于father类
  探测如何访问fater的属性和方法

 注意点：
	Java编译器会默认在子类的构造方法中加上super();
*/
class Father
{
	int age = 100;
	public static String name = "laowang";
	public Father(String name){
		this.name = name;
		System.out.println("Hello");	
	}

	public Father(){}
	public void work(){
		System.out.println(this.name+"愉快的工作！");
	}
}

class Son extends Father
{
	int age;
	public Son(String name){
		//super();
		this.name = name;
		this.age = 90;
		super.age = 110;
		
		//super.name = "";
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}

class Demo8
{
	public static void main(String[] args) 
	{
		new Son("xiaoming");
		System.out.println("Hello World!");
	}
}
