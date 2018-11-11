package hello;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int m =in.nextInt();
		int p=0;
		int u=0;
		int q=0;
		int z=0;
		int t=0;
		t=n;
		int array [][]=new int [n*2+2][2];
		array[0][0]=n;
		array[0][1]=m;
		for(int i=1;i<n*2;i++) {
			int a =in.nextInt();
			int b =in.nextInt();
			if(i<n) {
			array[Math.abs(a-n)][0]=a;
			array[Math.abs(a-n)][1]=b;}
			else {
				array[n+Math.abs(a-n)+1][0]=a;
				array[n+Math.abs(a-n)+1][1]=b;
			}
			if(a==0){
				p++;
				i=n;
			}
			if(p==2) {
				break;
			}
			
		}
		for(int i=0;i<=n;i++) {
			array[i][0]=t;
			t--;
		}
		for(int i=0;i<n+1;i++) {
			 
				array[i][1]=array[i][1]+array[i+7][1];
				
		}
		if(array[0][0]==0) {
			System.out.print(array[0][1]);
		}
		if(array[0][0]!=0) {
			System.out.print(array[0][1]+"x"+array[0][0]);
		}
		for(int i=1;i<=n;i++) {
			if(array[i][1]==0) {
				continue;
			}
			if(array[i][1]>0) {
				System.out.print("+");
			}
			if(array[i][1]<0) {
				System.out.print("-");
			}
			if(array[i][0]==0) {
				System.out.print(array[i][1]);
			}
			if(array[i][0]!=0) {
				if(array[i][0]==1) {
					System.out.print(array[i][1]+"x");
				}
				else {
				System.out.print(array[i][1]+"x"+array[i][0]);}
			}
			
		}
	}

}
