/*
abstract���������¹ؼ��ֹ�ͬ����һ��������
	1.private ���ⲻ�ɼ�
	2.static ���Ա��������ã����ǻ�ûʵ��
	3.final ���ܱ��޸�
*/
abstract class MyShape
{
	String name;

	public MyShape(String name){
		this.name = name;
	}

	public abstract void getLength();

	public abstract void getSurface();
}

class Circle extends MyShape
{
	public float r;

	public static final float PI = 3.14159f;

	public Circle(String name, float r){
		super(name);
		this.r = r;
	}
	
	public void getLength(){
		System.out.println("����Բ���ҵ��ܳ���"+ PI*r);
	}

	public void getSurface(){
		System.out.println("Բ�������"+ PI*r*r);
	}
	
}

class Rectangl extends MyShape
{
	public float width;

	public float height;

	public Rectangl(String name, float w, float h){
		super(name);
		this.width = w;
		this.height = h;
	}

	public void getLength(){
		System.out.println("����Բ���ҵ��ܳ���"+ 2*(width+height));
	}

	public void getSurface(){
		System.out.println("����Բ���ҵ��ܳ���"+ width*height);
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle("Բ",4.0f);
		c.getLength();
		c.getSurface();
		Rectangl r = new Rectangl("������",3.0f,4.0f);
		r.getLength();
		r.getSurface();
		System.out.println("Hello World!");
	}
}
