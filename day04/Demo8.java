/*
��������Ϸ
*/
import java.util.*;
class Demo8 
{
	public static void main(String[] args) 
	{
		//����һ�����������
		System.out.println("��������Ϸ��ʼ��");
		Random rand = new Random();
		int num1 = rand.nextInt(10) + 1;
		while (true)
		{
			System.out.println("��������Ҫ�µ����֣�");
			Scanner scanner = new Scanner(System.in);
			int num2 = scanner.nextInt();
			if (num1 < num2)
			{
				System.out.println("�´��ˣ�");
			}
			else if (num1 > num2)
			{
				System.out.println("��С�ˣ�");
			}
			else
			{
				System.out.println("��ϲ���¶��ˣ���Ϸ������");
				break;
			}
		}
	}
}
