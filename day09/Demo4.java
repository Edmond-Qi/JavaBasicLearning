/*
abstract不能与以下关键字共同修饰一个方法：
	1.private 对外不可见
	2.static 可以被类名调用，但是还没实现
	3.final 不能被修改
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
		System.out.println("我是圆，我的周长是"+ PI*r);
	}

	public void getSurface(){
		System.out.println("圆的面积是"+ PI*r*r);
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
		System.out.println("我是圆，我的周长是"+ 2*(width+height));
	}

	public void getSurface(){
		System.out.println("我是圆，我的周长是"+ width*height);
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle("圆",4.0f);
		c.getLength();
		c.getSurface();
		Rectangl r = new Rectangl("正方形",3.0f,4.0f);
		r.getLength();
		r.getSurface();
		System.out.println("Hello World!");
	}
}
