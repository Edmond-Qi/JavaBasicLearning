/*
需求：定义一个函数接收一个int类型的数组对象，找出数组对象中的最大元素返回给调用者
*/
class Demo8 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int[] arr = {12, 14, 5, 26, 4};
		int max = getMax(arr);
		System.out.println(max);

	}

	public static int getMax(int[] arr)
	{
		int maxNum = arr[0];
		for (int i=1; i<arr.length; i++)
		{
			if (arr[i]>maxNum)
			{
				maxNum = arr[i];
			}
			
		}
		return maxNum;
	}
}
