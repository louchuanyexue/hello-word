package demo;

public class Car {
	public static void run(){
		//System.out.println("������");
		String color;
		int num;
		
		System.out.println(color + "..." + num);
	}
	public static void main(String[] args) {
		Car c1 = new Car();	//���������ֵĶ���
		c1.run();
		c1.run();
		new Car().run();	//����������÷���
		new Car().run();	//��������ֻ�ʺ϶Է�����һ�ε���,��Ϊ���ö�ξͻ�����������,�����������ֵĶ���	
	
		//���������Ƿ���Ե������Բ���ֵ?��ʲô����?
		/*
		����������Ե�������,����û������,��Ϊ���ú�ͱ������
		�����Ҫ��ֵ�����������ֶ���
		*/
		
		new Car().color = "red";
		new Car().num = 8;
		new Car().run();
		  
	}

}

