/*

对象：真实存在的唯一事物。
类：同一种欸行的事物的公共属性与公共行为的抽取

java面向对象语言：
	核心思想，找适合的对象做适合的事情。

找对象的方式：
	1.sun已经为我们订好了很多类，认识这些类使用即可
	2.自定义类，通过自定义类创建对象。

自定义类：
	1.class{
		事物的公共属性使用成员变量描述

		事物的公共行为使用函数描述
	}
	2.通过类创建对象
	3.访问对象的属性或者调用对象的方法

成员变量与局部变量的区别：
	1.位置区别：
		成员变量定义在方法之外，类之内
		局部变量定义在方法内部
	2.作用区别：
		成员变量表示类的属性
		局部变量是定义在变量给方法使用
	3.生命周期的区别：
		类变量随着对象的闯将而存在，
		调用方法时执行到该语句时创建，出了作用域就会消失
	4.初始值的区别
		1.有默认初始值
		2.没有默认的初始值，在调用时必须先初始值。

匿名对象：没有引用类型变量指向的对象

	1.一般不会赋值
	2.两个匿名对象不是同一个对象

使用该对象的方法:简化书写，加快垃圾回收。

使用匿名对象的场景：
	1.工具类调用
	2.传参


封装：
	1.使用private装饰需要被封装的属性。
	2.根据需要提供get或者set方法设置以及获取属性。

封装的好处：
	1.提高了数据的安全性。
	2.操作简单
	3.隐藏了实现。


*/

class Person
{
	String name;
	static String gender;
}
class Demo1 
{
	public static void main(String[] args) 
	{
		//System.out.println(Person.name);
		Person.gender = "man";
		System.out.println(Person.gender);
	}
}
