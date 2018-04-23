/*
控制流程语句之---switch选择判断语句:
	1.byte\short\int\String(jdk7.0)
	2.case后面要跟一个常量表达式
	3.switch的停止条件 break or },匹配到一次后就不再匹配，顺序执行下面的代码
	4.没有匹配到任何case,才执行default
*/
class Demo2 
{
	public static void main(String[] args) 
	{
		int option = 12;
		switch (option)
		{
		default:
			System.out.println("你的训责有误！");
		case 1:
			System.out.println("java");
		case 2:
			System.out.println("c#");
		case 3:
			System.out.println("javascript");		
		}
	}
}
