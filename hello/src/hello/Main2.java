package hello;

import java.util.Collections;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a=0;
		int b=n;
		int c=n;
		int e=0;
		int f=0;
		if(n==0) {
			System.out.print("ling");
		}
		else {
		if(n<0) {
			System.out.print("fu ");
		}
		while(b!=0) {
			b=b/10;
			f++;
		}
		for(;f!=1;f--) {
			e=(int) (c/(Math.pow(10, f-1)));
			e=e%10;
			switch(Math.abs(e)) {
			case 0:System.out.print("ling ");break;
			case 1:System.out.print("yi ");break;
			case 2:System.out.print("er ");break;
			case 3:System.out.print("san ");break;
			case 4:System.out.print("si ");break;
			case 5:System.out.print("wu ");break;
			case 6:System.out.print("liu ");break;
			case 7:System.out.print("qi ");break;
			case 8:System.out.print("ba ");break;
			case 9:System.out.print("jiu ");break;
			default:break;}
 		}
		a=n%10;
		switch(Math.abs(a)) {
		case 0:System.out.print("ling");break;
		case 1:System.out.print("yi");break;
		case 2:System.out.print("er");break;
		case 3:System.out.print("san");break;
		case 4:System.out.print("si");break;
		case 5:System.out.print("wu");break;
		case 6:System.out.print("liu");break;
		case 7:System.out.print("qi");break;
		case 8:System.out.print("ba");break;
		case 9:System.out.print("jiu");break;
		default:break;}}
	}	
		

}
