/*
2.дһ���������Ƚ����Ժʹ���ı���˭��˭С��Ҫ���������������һ����
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
