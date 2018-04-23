/*
循环语句：
	计算1+2+3+.....+ 1000的总和
*/
class Demo5 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int sum = 0;
		while (num<=1000)
		{
			sum += num++;
		}
		System.out.println(sum);
	}
}
