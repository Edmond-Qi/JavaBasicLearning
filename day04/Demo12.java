/*
需求：在控制台上打印一个五行五列的矩形
*/
class Demo12 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
