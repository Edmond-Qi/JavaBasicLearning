/*
ʹ������ͼƬ���ݽ��м���

*/
import java.io.*;
class ImageTest 
{
	public static void main(String[] args) throws Exception
	{
		//�ҵ�ͼƬ�ļ�
		File inFile = new File("E:\\Pro.jpg");
		File outFile = new File("E:\\Pro.jpg1");
		
		//��������ͨ������ͼƬ�Ķ�������������
		FileInputStream input = new FileInputStream(inFile);
		FileOutputStream output = new FileOutputStream(outFile);
		
		//�߶����Ѷ������������һ������
		int content = 0;
		while ((content = input.read())!=-1)
		{
			output.write(content^12);
		}

		output.close();
		input.close();
	}

}
