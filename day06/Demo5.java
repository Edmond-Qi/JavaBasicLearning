/*
����������������:
	1.��װ
	2.�̳�
	3.��̬

Ȩ�����η������Ʊ����ȵĿɼ���Χ��

public: public���εĳ�Ա�������߷����κ��˶����Է���

private: ֻ���ڱ����н��з��ʡ�

�淶������ʵ�����У�һ��ʵ��������г�Ա���Զ�Ҫ��װ������

ʵ���ࣺ��������һ������

�����ࣺ��Array��


*/

class Member
{
	public String name;
	private String sex;
	int salary;
	public void talk()
	{
		System.out.println("�ĵ÷ǳ�����");
	}

	public void laugh()
	{
		System.out.println("��Ц�ĺܿ���");
	}
	public void set_sex(String se)
	{
		sex = se;
	}


}

class Demo5 
{
	public static void main(String[] args) 
	{
		Member m = new Member();
		m.name = "che";
		m.set_sex("name");
		m.talk();
		m.laugh();
		System.out.println("Hello World!");
	}
}
