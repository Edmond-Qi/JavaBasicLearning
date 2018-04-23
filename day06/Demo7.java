/*
需求：目前存在数组：int[] arr = {0,0,12,1,0,4,6,0}
*/
import java.util.*;
class Demo7 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,0,12,1,0,4,6,0};
		int[] arr2 = handle(arr);
		System.out.println(Arrays.toString(arr2));
	}

	public static int[] handle(int[] arr)
	{
		int count = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]==0)
			{
				count++;
			}
		}

		int[] arr2 = new int[arr.length-count];
		int j = 0;

		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr2[j++] = arr[i];
			}
		}

		return arr2;

	}
}
