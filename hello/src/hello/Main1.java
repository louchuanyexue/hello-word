package hello;

import java.util.Scanner;

public class Main1 {

	private static Scanner in;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		int m = in.nextInt();
		int a=-1;
		int b=1;
		int c=0;
		int flg =1;
		OUT:
		for(;;b++){
			for(int i=2;i<b;i++){
				if(b%i==0)
					{flg=0;
					break;}
				else
					flg=1;}
			if(flg==1){
				a++;
				if(a>=n)
				{
				if (a<=m)
					c+=b;
				else if (a>m)
					break OUT;}
				}
			
		}
		System.out.println(c);
	}

}
