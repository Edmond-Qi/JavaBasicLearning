/*
java�������
	�Զ�����ķ�ʽ��
	1.�����ࣺ
		��ʽ��
			class ����{
				����Ĺ�������ʹ�ã���Ա������

				����Ĺ�����Ϊ��ʹ��
			}
	2.ͨ���ഴ������
	3.���ʶ�������Ի��ߵ��ö���Ĺ��ܡ�

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
	String name; //��������
	String color; //������ɫ
	int size; //�����С

	public void run()
	{
		System.out.println("�ɿ����������");
	}
}
