/*
面向对象的三大特征:
	1.封装
	2.继承
	3.多态

权限修饰符：控制变量等的可见范围。

public: public修饰的成员变量或者方法任何人都可以访问

private: 只能在本类中进行访问。

规范：在现实开发中，一般实体类的所有成员属性都要封装起来。

实体类：用于描述一类事物

工具类：（Array）


*/

class Member
{
	public String name;
	private String sex;
	int salary;
	public void talk()
	{
		System.out.println("聊得非常开心");
	}

	public void laugh()
	{
		System.out.println("他笑的很开心");
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
