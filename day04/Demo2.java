/*
�����������֮---switchѡ���ж����:
	1.byte\short\int\String(jdk7.0)
	2.case����Ҫ��һ���������ʽ
	3.switch��ֹͣ���� break or },ƥ�䵽һ�κ�Ͳ���ƥ�䣬˳��ִ������Ĵ���
	4.û��ƥ�䵽�κ�case,��ִ��default
*/
class Demo2 
{
	public static void main(String[] args) 
	{
		int option = 12;
		switch (option)
		{
		default:
			System.out.println("���ѵ������");
		case 1:
			System.out.println("java");
		case 2:
			System.out.println("c#");
		case 3:
			System.out.println("javascript");		
		}
	}
}
