/*
数组的特点：
	1.数组只能存储同一种数据类型的数据。
	2.数组会给存储的到数组中的元素分配一个索引值，从0到length-1；
	3.数组一旦初始化，长度固定。
	4.数组中元素和元素之将的内存地址是连续的

遍历非定长数组
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
