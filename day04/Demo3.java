/*
�����·ݼ��ڶ�Ӧ
*/
import java.util.*;

class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("�������·�");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num)
		{
		case 2:
		case 3:
		case 4:
			System.out.println("���Ǵ��죡");
			break;
		case 5:
		case 6:
		case 7:
			System.out.println("�������죡");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("�������죡");
			break;
		case 11:
		case 12:
		case 1:
			System.out.println("���Ƕ��죡");
			break;
		default:
			System.out.println("��������");
		}
	}
}
