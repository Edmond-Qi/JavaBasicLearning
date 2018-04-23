/*
4.写一个初始化块，用于统计此类的新建次数
*/

class Car{
	public static int count;
	
	/*
	{
		count++;
		System.out.println("第"+ count +"辆车被创建了！");
	}
	*/
	public Car(){
		count++;
		System.out.println("第"+ count +"辆车被创建了！");
	}
}

class Demo6 
{
	public static void main(String[] args) 
	{
		new Car();
		new Car();
		System.out.println("Hello World!");
	}
}
