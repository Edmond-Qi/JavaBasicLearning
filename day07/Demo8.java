/*
6.дһ��father �࣬��son�࣬���son���Ǽ̳���father��
  ̽����η���fater�����Ժͷ���

 ע��㣺
	Java��������Ĭ��������Ĺ��췽���м���super();
*/
class Father
{
	int age = 100;
	public static String name = "laowang";
	public Father(String name){
		this.name = name;
		System.out.println("Hello");	
	}

	public Father(){}
	public void work(){
		System.out.println(this.name+"���Ĺ�����");
	}
}

class Son extends Father
{
	int age;
	public Son(String name){
		//super();
		this.name = name;
		this.age = 90;
		super.age = 110;
		
		//super.name = "";
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}

class Demo8
{
	public static void main(String[] args) 
	{
		new Son("xiaoming");
		System.out.println("Hello World!");
	}
}
