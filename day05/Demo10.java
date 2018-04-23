/*
ц╟ещеепР
*/
import java.util.*;
class Demo10 
{
	public static void main(String[] args) 
	{
		int[] arr = {12, 14, 5, 26, 4};
		bubleSort(arr);
		System.out.print(Arrays.toString(arr));
	}

	public static void bubleSort(int[] arr)
	{
		for (int i=0; i<arr.length-1; i++)
		{
			for (int j=0; j<(arr.length-i-1); j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
