/*
ѭ����䣺
	����1+2+3+.....+ 1000���ܺ�
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
