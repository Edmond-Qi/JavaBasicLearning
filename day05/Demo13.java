/*
������ص㣺
	1.����ֻ�ܴ洢ͬһ���������͵����ݡ�
	2.�������洢�ĵ������е�Ԫ�ط���һ������ֵ����0��length-1��
	3.����һ����ʼ�������ȹ̶���
	4.������Ԫ�غ�Ԫ��֮�����ڴ��ַ��������

�����Ƕ�������
*/
import java.util.*;
class Demo13 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{10,9,11},{67,12},{33,35,39,40}};
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}
}
