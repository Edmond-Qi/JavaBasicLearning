/*
使用异或对图片数据进行加密

*/
import java.io.*;
class ImageTest 
{
	public static void main(String[] args) throws Exception
	{
		//找到图片文件
		File inFile = new File("E:\\Pro.jpg");
		File outFile = new File("E:\\Pro.jpg1");
		
		//建立数据通道，让图片的二进制数据流入
		FileInputStream input = new FileInputStream(inFile);
		FileOutputStream output = new FileOutputStream(outFile);
		
		//边读，把读到的数据异或一个数字
		int content = 0;
		while ((content = input.read())!=-1)
		{
			output.write(content^12);
		}

		output.close();
		input.close();
	}

}
