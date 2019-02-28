package com.test;

public class Insert_sort{
	public static void main(String[] args) {
		Insert_sort st=new Insert_sort();
		int[] s=new int[10];
		for(int i=0;i<10;i++) {
			s[i]=10-i;
			System.out.print(s[i]);
		}
		int[] s1=st.insert_test(s);
		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.print(s[i]);
		}
		
	}
	public int[] insert_test(int[] s) {
		int key=0;
		int i=0;
		for(int j=1;j<s.length;j++) {  
			key=s[j];
			i=j-1;
			while(i>=0&&key<s[i]) {
				s[i+1]=s[i];
				i--;
			}
			s[i+1]=key;
		}
		return s;
	}
	
}
