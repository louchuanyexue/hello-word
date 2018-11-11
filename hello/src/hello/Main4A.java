package hello;

import java.util.Scanner;

public class Main4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 0;
		Scanner in = new Scanner(System.in);
		int array[] = new int[101];
		while (true) {
			int a = in.nextInt();
			int b = in.nextInt();
			array[a] += b;
			if (a == 0) {
				p++;
			}
			if (p == 2) {
				break;
			}
		}
		int flag = 1;
		int lag = 0;
		for (int i = array.length - 1; i > 1; i--) {
			if (array[i] == 0)
				continue;
			else {
				if (array[i] < 0) {
					if (array[i] == -1) {
						System.out.print("-" + "x" + i);
					} else
						System.out.print(array[i] + "x" + i);
				} else if (array[i] > 0 && flag == 0) {
					if (array[i] == 1) {
						System.out.print("+" + "x" + i);
					} else
						System.out.print("+" + array[i] + "x" + i);
				} else if (array[i] > 0 && flag == 1) {
					if (array[i] == 1) {
						System.out.print("x" + i);
					} else
						System.out.print(array[i] + "x" + i);
					flag = 0;
				}
				lag = 1;
			}
		}
		if (array[1] != 0) {
			if (array[1] < 0) {
				if (array[1] == -1) {
					System.out.print("-" + "x");
				} else
					System.out.print(array[1] + "x");
			} else if (array[1] > 0) {
				if (array[1] == 1) {
					System.out.print("+" + "x");
				} else
					System.out.print("+" + array[1] + "x");

			}
			flag = 1;
			lag = 1;
		}
		if (array[0] != 0) {
			if (array[0] < 0 && array[1] != 0) {
				System.out.print(array[0]);
			} else if (array[0] > 0 && lag == 1) {
				System.out.print("+" + array[0]);
			} else {
				System.out.print(array[0]);
			}
		}
		if (array[0] == 0 && lag == 0)
			System.out.print(array[0]);

	}
}
