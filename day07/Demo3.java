/*
描述一个员工类，员工具备的属性：id name age

具备的公共行为： 工作

一旦创建一个员工对象，那么该员工就要对象的属性值

构造代码块：给对象进行统一的初始化，放在成员变量的位置。
	{
		构造代码块;
	}

注意事项：
	1.Java编译器编译原文件的时候会把成员变量的声明语句提前至一个类的最前端。
	2.成员变量的初始化工作起始都在构造函数中执行
	3.构造代码块被移动至构造函数中，构造函数的语句最后执行
	4.成员变量的显示初始化与构造代码块的代码时按照当前代码的顺序执行的。
	
局部代码块
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
		Employee e = new Employee("卢纳尔多");
		System.out.println(e.name);
		e.work();
	}
}
