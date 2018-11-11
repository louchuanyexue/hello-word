package hello;

import java.util.Scanner;

public class Mainw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.nextLine(),s0;
		final int MOD=65536;
		int n1,n2,hh=0,mm=0,ss=0,textvalue,actualvalue;
		n2=s.indexOf('*');
		while(!s.equals("END")) {
			n1=s.indexOf(',');
			s0=s.substring(0, 6);
			n1=s.indexOf(',',n1+1);
			textvalue=(int)s.charAt(1)^(int)s.charAt(2);
			if(s0.equals("$GPRMC")&&s.charAt(n1+1)=='A') {
				int j=s.indexOf('*');
				for(int i=3;i<j;i++) {
					if(s.charAt(i)!=',') {
						textvalue=textvalue^(int)s.charAt(i);
					}
				}
				textvalue=textvalue%MOD;
				actualvalue=Integer.parseInt(s.substring(n2+1),16);
				if(textvalue==actualvalue) {
					hh=Integer.parseInt(s.substring(7,9));
					mm=Integer.parseInt(s.substring(9,11));
					ss=Integer.parseInt(s.substring(11,13));
				}
			}
			s=in.nextLine();
		}
		System.out.printf("%02d:%02d:%02d",(hh+8)%24,mm,ss);
		in.close();
	}

}
