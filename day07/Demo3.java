/*
����һ��Ա���࣬Ա���߱������ԣ�id name age

�߱��Ĺ�����Ϊ�� ����

һ������һ��Ա��������ô��Ա����Ҫ���������ֵ

�������飺���������ͳһ�ĳ�ʼ�������ڳ�Ա������λ�á�
	{
		��������;
	}

ע�����
	1.Java����������ԭ�ļ���ʱ���ѳ�Ա���������������ǰ��һ�������ǰ�ˡ�
	2.��Ա�����ĳ�ʼ��������ʼ���ڹ��캯����ִ��
	3.�������鱻�ƶ������캯���У����캯����������ִ��
	4.��Ա��������ʾ��ʼ���빹������Ĵ���ʱ���յ�ǰ�����˳��ִ�еġ�
	
�ֲ������
{

}

*/

class Employee
{
	String name;
	int id;
	int age;

	{
		work();
	}
	public Employee(String n){
		this.name = n;
	}

	public void work(){
		System.out.println(this.name);
	}


}
class Demo3 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("¬�ɶ���");
		System.out.println(e.name);
		e.work();
	}
}
