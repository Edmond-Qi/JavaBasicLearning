/*
���󣺼���1-100��7�ı������ܺ�
*/
class Demo7 
{
	public static void main(String[] args) 
	{
		int count = 0;
		int sum = 0;
		while (count<101)
		{
			if (count%7==0)
			{
				sum += count;
			}
			count++;
		}
		System.out.println("sum = " + sum);
	}
}
