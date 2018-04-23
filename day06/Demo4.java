/*
匿名对象：没有引用类型变量指向的对象


	注意事项：
		1.不要给匿名对象赋予属性，因为永远无法获取到
		2.两个匿名对象那个永远都不可能是同一个对象

		比较运算时，基本类型比较的时值
		引用类型比较的是内存地址。

匿名对象的使用场景：
	1.如果一个对象需要调用一个方法，而调用完这个方法之后，该对象就
	不再使用了，这时候应该使用匿名对象

	2.作为实参
	
*/
class Student
{
	int num; // 学号
	String name; //名字
	public void study()
	{
		System.out.print("好好学习，为将来的高富帅做准备！");
	}

}

class Demo4 
{
	public static void main(String[] args) 
	{
		//创建一个学生对象
		Student s = new Student();
		System.out.println(s.name);
	}
}
