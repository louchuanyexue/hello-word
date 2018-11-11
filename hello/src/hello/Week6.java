package hello;

import java.util.Scanner;

public class Week6 {

	public static void Week6(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=0;
		String s=null,d ="";
		String m=in.next();
		if (m.charAt(0)=='.') {
			System.out.print('0');
			return;}
		while(true){
			s = in.next();
			if(s.charAt(s.length()-1)=='.') {
				break;
			}
			n=s.length();
			d =d+" "+n;
			}
		System.out.print(m.length());
		System.out.print(d);
		System.out.print(" "+(s.length()-1));
		OUT:;	
		
	}

}
