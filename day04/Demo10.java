/*
����ʹ��do-while���1-100֮��ż�����ܺ͡�
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
