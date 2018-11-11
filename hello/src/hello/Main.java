package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int number = 100001;
		int m = 1;
		int p = 0;
		int[]array = new int[number];
		for(int i=2;i<100001;i++) {
			for(int j=2;i*j<100001;j++) {
				if(array[i*j]==1) {
					continue;
				}
				else
					array[i*j]=1;
			}
		}
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		p=n;
		if(array[n]==0) {
			System.out.println(n+"="+n);
		}
		else
			 {
			System.out.print(n+"=");
			for(int t=2;t<p;t++) {
				 while(array[t]==0&&n%t==0) {
					 m=m*t;
					 n=n/t;
					 if(m!=p) {
						 System.out.print(t+"x");
					 }
					 else
						 System.out.print(t);
				 }
			 }
			 }
			 //System.out.print("");}
				
			
		//System.out.println(array[5]);
	}

}
