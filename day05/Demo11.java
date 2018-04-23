/*
二分法查找
*/
import java.util.*;
class Demo11 
{
	public static void main(String[] args) 
	{
		int[] arr = {12, 14, 16, 26, 34};
		while (true)
		{
			System.out.println("请输入你要查询的数字，我将给你下标：{12, 14, 16, 26, 34}");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			int index = halfSearch(num,arr);
			System.out.println(index);
		}
	}

	public static int halfSearch(int num, int[] arr)
	{
		int low = 0;
		int mid = arr.length/2;
		int high = arr.length-1;
		while(true)
		{
			if (num<arr[mid])
			{
				high = mid;
				mid = (high + low)/2;
			}
			else if (num>arr[mid])
			{
				low = mid;
				mid = (high + low)/2;
			}
			else
			{
				return mid;
			}
		}
	}
}
