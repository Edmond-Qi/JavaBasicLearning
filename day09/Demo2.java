/*
抽取行为的主体，但不去实现该行为，这时候我们就要使用抽象类。Abstract修饰

好处：强迫子类是实现抽象方法

细节：
	1.一个函数没有方法体，那么该函数必须要用Abstract修饰，把该函数修饰成抽象的函数
	2.如果一个类出现了抽象的函数，那么该类也必须用abstract修饰
	3.如果非抽象类继承了抽象类，那么必须要把抽象类的所有抽象方法全部实现。
	4.抽象类可以有非抽象方法
	5.可以没有非抽象方法
	6.抽象类不能够创建对象
	7.抽象类的构造函数时提供给子类初始化继承自父类属性时用的。

abstract不能与以下关键字共同修饰一个方法：
	1.private 对外不可见
	2.static 可以被类名调用，但是还没实现
	3.final 不能被修改
*/		
abstract class Animal{
	String name;

	String color;

	public Animal(String name, String color){
		this.name = name;
		this.color = color;
	}

	public abstract void run();
}

class Dog extends Animal
{
	public Dog(String name, String color){
		super(name,color);
	}

	public void run(){
		System.out.println("pao");
	}
}

class Fish extends Animal
{
	public Fish(String name, String color){
		super(name,color);
	}

	public void run(){
		System.out.println("swim");
	}
}

class Demo2
{
	public static void main(String[] args) 
	{
		Dog d = new Dog("牧羊犬", "棕色");
		d.run();
		Fish f = new Fish("鲤鱼","金黄色");
		f.run();
		System.out.println("Hello World!");
	}
}
