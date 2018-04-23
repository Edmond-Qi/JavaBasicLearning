/*
需求：计算1-100中7的倍数的总和
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
