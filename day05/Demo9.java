/*
ѡ������
*/
import java.util.*;
class Demo9 
{
	public static void main(String[] args) 
	{
		int[] arr = {12, 14, 5, 26, 4};
		selectSort(arr);		
		System.out.print(Arrays.toString(arr)); //�Ƚ�����ת���ַ���Ȼ���ӡ����
	}

	public static void selectSort(int[] arr)
	{
		for (int i =0; i<arr.length-1; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[j]>arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
