/*
4.дһ����ʼ���飬����ͳ�ƴ�����½�����
*/

class Car{
	public static int count;
	
	/*
	{
		count++;
		System.out.println("��"+ count +"�����������ˣ�");
	}
	*/
	public Car(){
		count++;
		System.out.println("��"+ count +"�����������ˣ�");
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
