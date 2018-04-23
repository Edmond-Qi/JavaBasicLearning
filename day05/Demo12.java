/*
二维数组

二维数组的初始化方式：
	动态初始化：
		数据类型[][] 变量名 = new 数据类型[长度1][长度2]

	静态初始化：
		数据类型[][] 变量名 = {{元素1，元素2},{},{}}
*/
class  Demo12
{
	public static void main(String[] args) 
	{
		//int[][] arr = new int[3][4];

		int[][] arr = {{10,9,11},{67,12},{33,35,39,40}};
		System.out.println("二维数组的长度：" + arr.length);
		System.out.println("二维数组的长度：" + arr[0].length);
		System.out.println("二维数组的长度：" + arr[1].length);
		System.out.println("二维数组的长度：" + arr[2].length);
	}
}
