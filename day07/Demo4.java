/*
2.写一个方法，比较属性和传入的变量谁大谁小（要求变量名和属性名一样）
*/
class Person
{
	int age;
	public Person(int age){
		this.age = age;
	}

	public Boolean compareNumber(int age){
		if (this.age>=age)
		{
			return true;
		}
		else{
			return false;
		}
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		Person p = new Person(100);
		Boolean b = p.compareNumber(99);
		System.out.println(b);
	}
}
