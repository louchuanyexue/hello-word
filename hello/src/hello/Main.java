

import java.util.Scanner;
class Demo1_Polymorphic {
	public static void main(String[] args) {
		Cat c = new Cat();	//���ö�̬
		c.eat();

		Animal a = new Cat();	//��������ָ���������
		a.eat();
	}
}

class Animal {
	public void eat() {
		System.out.println("����Է�");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}