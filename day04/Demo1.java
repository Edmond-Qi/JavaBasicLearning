import java.util.*;

class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("������һ��������");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();		
		if ((num>=0) && (num<60))
		{
			System.out.println("�ȼ���D");
		}
		else if ((num>=60) && (num<75))
		{
			System.out.println("�ȼ���C");
		}
		else if ((num>=75) && (num<90))
		{
			System.out.println("�ȼ���B");
		}
		else if ((num>=90) && (num<=100))
		{
			System.out.println("�ȼ���A");
		}
		else{
			System.out.println("������ķ��������ڣ�������������룡");
			}
	}
}