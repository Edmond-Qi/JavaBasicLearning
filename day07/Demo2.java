/*
���캯��������Ӧ�Ķ�����г�ʼ����

���캯���Ķ����ʽ��
	
	���η� ����������ʽ������{
		������
	}
���캯����
	1.û�з���ֵ����
	2.������������һ�¡�
	3.�Զ���jvm����
	4.û�й��캯����Java���������Ҹ����Զ����һ��
*/
class Baby
{
	int id;

	String name;

	public Baby(int i, String n){
		id = i;
		name = n;
	}

	public Baby(){}

	public void cry(){
		System.out.println("���ۿޡ�����");
	}
}
class Demo2 
{
	public static void main(String[] args) 
	{
		Baby b = new Baby();
		System.out.println("Hello World!");
	}
}
