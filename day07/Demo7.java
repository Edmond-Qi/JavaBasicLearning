/*
5.写出2种单例模式
*/
class Single
{
	/*
	private static Single s = new Single();

	private Single(){}

	public static Single getSingle(){
		return s;
	}
	*/
	private static Single s;
	
	private Single(){}

	public static Single getSingle(){
		if (s==null)
		{
			s = new Single();
		}

		return s;		
	}
}
class Demo7 
{
	public static void main(String[] args) 
	{
		Single s = Single.getSingle();
		System.out.println("Hello World!");
	}
}
