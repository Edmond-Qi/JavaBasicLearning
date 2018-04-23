/*
需求：使用do-while算出1-100之间偶数的总和。
*/
class Demo10 
{
	public static void main(String[] args) 
	{
		int count = 0;
		int sum = 0;
		do
		{
			if (count%2==0)
			{
				sum += count;
			}
			count++;
		}
		while (count<=100);
		System.out.println("sum = " + sum);
	}
}
