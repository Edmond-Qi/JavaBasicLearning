/*
windows�� �����ļ� ʱ��������Ҫ\r\n��linuxֻҪ\n
*/
import java.io.*;

class Demo16 
{
	public static void main(String[] args) throws Exception
	{
		//System.out.println("Hello\nWorld!");
		File file  = new File("F:\\test.txt");
		FileWriter out = new FileWriter(file);
		out.write("��Һã�\r\n");
		out.write("��Һã�\n");
		out.close();
	}
}
