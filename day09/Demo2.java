/*
��ȡ��Ϊ�����壬����ȥʵ�ָ���Ϊ����ʱ�����Ǿ�Ҫʹ�ó����ࡣAbstract����

�ô���ǿ��������ʵ�ֳ��󷽷�

ϸ�ڣ�
	1.һ������û�з����壬��ô�ú�������Ҫ��Abstract���Σ��Ѹú������γɳ���ĺ���
	2.���һ��������˳���ĺ�������ô����Ҳ������abstract����
	3.����ǳ�����̳��˳����࣬��ô����Ҫ�ѳ���������г��󷽷�ȫ��ʵ�֡�
	4.����������зǳ��󷽷�
	5.����û�зǳ��󷽷�
	6.�����಻�ܹ���������
	7.������Ĺ��캯��ʱ�ṩ�������ʼ���̳��Ը�������ʱ�õġ�

abstract���������¹ؼ��ֹ�ͬ����һ��������
	1.private ���ⲻ�ɼ�
	2.static ���Ա��������ã����ǻ�ûʵ��
	3.final ���ܱ��޸�
*/		
abstract class Animal{
	String name;

	String color;

	public Animal(String name, String color){
		this.name = name;
		this.color = color;
	}

	public abstract void run();
}

class Dog extends Animal
{
	public Dog(String name, String color){
		super(name,color);
	}

	public void run(){
		System.out.println("pao");
	}
}

class Fish extends Animal
{
	public Fish(String name, String color){
		super(name,color);
	}

	public void run(){
		System.out.println("swim");
	}
}

class Demo2
{
	public static void main(String[] args) 
	{
		Dog d = new Dog("����Ȯ", "��ɫ");
		d.run();
		Fish f = new Fish("����","���ɫ");
		f.run();
		System.out.println("Hello World!");
	}
}
