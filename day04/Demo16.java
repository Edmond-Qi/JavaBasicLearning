/*
windows中 操作文件 时，换行需要\r\n。linux只要\n
*/
import java.io.*;

class Demo16 
{
	public static void main(String[] args) throws Exception
	{
		//System.out.println("Hello\nWorld!");
		File file  = new File("F:\\test.txt");
		FileWriter out = new FileWriter(file);
		out.write("大家好！\r\n");
		out.write("大家好！\n");
		out.close();
	}
}
