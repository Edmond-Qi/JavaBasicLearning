/*
java面向对象：
	自定义类的方式：
	1.定义类：
		格式：
			class 类名{
				事物的公共属性使用（成员变量）

				事物的公共行为的使用
			}
	2.通过类创建对象。
	3.访问对象的属性或者调用对象的功能。

*/
class Demo1 
{
	public static void main(String[] args) 
	{
		Car car = new Car();
		car.name = "Benz";
		car.color = "red";
		car.size = 12;
		car.run();
		System.out.println(car.name);
		System.out.println(car.color);
		System.out.println(car.size);
	}
}

class Car
{
	String name; //定义名称
	String color; //定义颜色
	int size; //定义大小

	public void run()
	{
		System.out.println("飞快的跑起来了");
	}
}
