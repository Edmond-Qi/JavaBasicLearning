/*
初学者的经典错误：
	1.变量在同一个作用域内是可以直接访问的。
	2.如果一个类要访问另外一个类变量是，那么这时候只能通过对象进行访问。


*/
class Car
{
	String name;
	String color;
	int numberWheel;
	public void run()
	{
		if (numberWheel==4)
		{
			System.out.print("跑起来了！");
		}
		else
		{
			System.out.print("该去修理了！");
		}
	}
}

class Factory
{
	String name;
	String addr;
	String phone;

	public Car fixCar(Car car)
	{
		car.numberWheel = 4;
		System.out.println("车修好了！");
		return car;
	}
	
}

class Demo2
{
	public static void main(String[] args) 
	{
		Car car = new Car();
		car.name = "陆峰";
		car.color = "red";
		car.numberWheel = 4;
		int i = 0;
		while(i<=100)
		{
			car.run();
			i++;
		}
		car.numberWheel = 3;
		car.run();
		Factory fac = new Factory();
		car = fac.fixCar(car);
		car.run();
	}
}
