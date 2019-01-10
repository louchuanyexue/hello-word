package com.test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a,b,c,rebs,recs;
		 int n;
		 int flag=0;
		 Scanner in = new Scanner(System.in);
		 do{
		 a = in.nextLine();
	     n = a.indexOf("-");
		 b = a.substring(0,n);
		 c = a.substring(n+1);
		 StringBuilder b1 = new StringBuilder(b);
		 StringBuilder c1 = new StringBuilder(c);
		 rebs = b1.reverse().toString();
		 recs = c1.reverse().toString();
		 char[] rebc =rebs.toCharArray();
		 char[] recc =recs.toCharArray();
		 int[] n1=new int[rebc.length];
		 int[] n2=new int[rebc.length];
		 int[] sub=new int[rebc.length];
    	 for(int i=0;i<rebc.length;i++)
		 {
			 n1[i]=rebc[i]-'0';
		 }	
		 for(int i=0;i<recc.length;i++)
		 {
			 n2[i]=recc[i]-'0';
		 }	
		 
 
		 for(int i=0;i<rebc.length;i++) {
			 sub[i]=n1[i]-n2[i];
			 if(sub[i]<0) {
				 sub[i]+=10;
				 n1[i+1]--;
			 }
			  
		 }
		 
		 int sum =0;
		 for(int j=0;j<sub.length;j++) {
			 sum+=sub[j];
		 }
		 int i =rebc.length-1;
		 if(sub.length==1) {flag=1;}
		 System.out.println();
		 for(;i>=0;i--) {
			 if(sum==0) {
				 System.out.print(0);
				 break;
			 }
			 else if(sub[i]==0&flag==0) {
				 continue;
			 }
			 else {
			 flag=1;
			 System.out.print(sub[i]);}
		 }
		 }while(in.hasNextLine());
		 
		 

	 
	}
}
