/*
��ѧ�ߵľ������
	1.������ͬһ�����������ǿ���ֱ�ӷ��ʵġ�
	2.���һ����Ҫ��������һ��������ǣ���ô��ʱ��ֻ��ͨ��������з��ʡ�


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
			System.out.print("�������ˣ�");
		}
		else
		{
			System.out.print("��ȥ�����ˣ�");
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
		System.out.println("���޺��ˣ�");
		return car;
	}
	
}

class Demo2
{
	public static void main(String[] args) 
	{
		Car car = new Car();
		car.name = "½��";
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
